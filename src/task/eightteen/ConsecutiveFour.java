package task.eightteen;
// Zadaca_18_26_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 *  
 *  Napisati metodu koja provjerava da li niz sadrži 4 ista broja uzastopno.
 *  Sample run: Unesite broj elemenata niza: 8
 *  Unesite 8 brojeva: 3 4 5 5 5 5 4 5
 *  Ovaj niz sadrzi 4 ista broja uzastopno
 *  Unesite broj elemenata niza: 9
 *  Unesite 8 brojeva: 3 4 5 5 6 5 5 4 5
 *  Ovaj niz ne sadrzi 4 ista broja uzastopno
 */

public class ConsecutiveFour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesite broj elemenata niza: ");

		int length = input.nextInt();

		int[] array = new int[length];
		

		System.out.printf(" Unesite %d brojeva: ",length);

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

	
		input.close();
		
		System.out.printf(" Ovaj niz " + (isConsecutiveFour(array) ? "" : "ne ") + "sadrzi 4 ista broja uzastopno ");
	}
	public static boolean isConsecutiveFour(int[] array) {
		
		int count = 1;
		
		for(int i = 0; i < array.length-1; i++){
			if(array[i] == array[i+1]){
			count++;
			if(count >= 4){
				return true;
			}
				if(array[i] != array[i+1]){
				count = 1;
			}
			}
		
		
	}
		return false;
	}

}

