package task.seventeen;
// Zadaca_17_25_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati metodu koja vraæa nasumièan broj u rasponu od 1 do 54, ne ukljuèujuèi 
 *  brojeve koje proslijedimo metodi kao argumente. Metoda treba da ima sljedeæi 
 *  header:public static int vratiNasumicanBroj(int... brojevi)
 */

public class RandomNumberFirstSolution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite duzinu niza: ");

		int length = input.nextInt();

		System.out.printf(" Unesite niz od %d brojeva: ", length);

		int[] numbers = new int[length];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		input.close();
		
		System.out.printf(" Nasumicni broj je: %d ", getRandomNumber(numbers));

	}

	public static int getRandomNumber(int... numbers) {

		int random = (int) (Math.random() * 54 + 1);

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == random) {
				random = (int) (Math.random() * 54 + 1);
					i = -1;
			}
		}
		return random;

	}
}

