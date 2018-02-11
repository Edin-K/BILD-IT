package task.sixteen;
// Zadaca_16_24_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji uèitava cijele brojeve u rasponu od 1 do 100 te broji ponavljanje svakog broja. 
 *  Prepostavimo da 0 prekida unos brojeva.
 *  Sample run:Unesite cijele brojeve izmeðu 1 i 100: 2 5 6 5 4 3 23 43 2 0
 *  2 se pojavljuje 2 puta
 *  3 se pojavljuje 1 put
 *  4 se pojavljuje 1 put 
 *  5 se pojavljuje 2 puta
 *  6 se pojavljuje 1 put
 *  23 se pojavljuje 1 put
 *  43 se pojavljuje 1 put
 *  Primjetimo da ako se broj pojavljuje više od jednog puta koristimo množinu rijeèi „puta“ u ispisu korisniku.
 */


public class CountOccurrenceOfNumbers {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		int[] array = new int[100];
		int[] count = new int[100];
		
		
		System.out.print(" Unesite cijele brojeve izmeðu 1 i 100(0 prekida unos): ");

		for (int i = 0; i < array.length; i++) {
			int num = input.nextInt();
			array[i] = num;
			count[num]++;
			if (num == 0) {
				break;
			}
		}
		input.close();
		
		printArray(count);
	}
public static void printArray(int[] count) {
	
	for(int i = 0; i < count.length; i++){
		if(count[i] != 0 && i != 0){
			System.out.printf(i + " se pojavljuje " + count[i] + (count[i] == 1? " put.\n": " puta.\n"));
		
		}
	}
	
}

	}


