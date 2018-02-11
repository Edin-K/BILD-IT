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

public class RandomNumberSecondSolution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite duzinu niza: ");

		int length = input.nextInt();

		System.out.printf(" Unesite niz od %d brojeva: ", length);

		int[] array = new int[length];
		int[] count = new int[100];

		for (int i = 0; i < array.length; i++) {
			int numbers = input.nextInt();
			array[i] = numbers;
			count[numbers]++;

		}
		input.close();

		System.out.printf(" Nasumicni broj je: %d ", getRandomNumber(array));

	}

	public static int getRandomNumber(int... numbers) {

		int random = (int) (Math.random() * 54 + 1);

		for (int i = 0; i < numbers.length; i++) {
			if (!isNotRandom(numbers)) {
				if (i != numbers[i]) {
					random = (int) (Math.random() * 54 + 1);

				}
			}
		}
		return random;

	}

	public static boolean isNotRandom(int[] count) {

		for (int i = 0; i < count.length; i++) {
			if (count[i] == i) {
				i = -1;
				return false;
			}

		}
		return true;
	}
}
