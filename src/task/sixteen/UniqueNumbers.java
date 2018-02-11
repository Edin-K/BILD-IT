package task.sixteen;
// Zadaca_16_24_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji uèitava 10 brojeva te ispisuje sve jedinstvene brojeve koji su 
 *  unijeti kao i broj jedinstvenih brojeva. Jedinstveni brojevi - ukoliko se broj ponovio 
 *  više od jednom, treba biti ispisan samo jednom na konzoli. 
 *  Sample run:
 *  Unesite 10 brojeva. 1 2 3 2 1 6 3 4 5 2
 *  Broj jedinstvenih brojeva je: 6
 *  Jedinstveni brojevi su: 1 2 3 6 4 5 
 */

public class UniqueNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[10];

		System.out.print(" Unesite niz od 10 brojeva: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		input.close();

		int[] newArray = uniqueNumbers(array);

		System.out.printf(" Broj jedinstvenih brojeva je: %d \n", count(array));

		System.out.printf(" Jedinstveni brojevi su: ");

		for (int n : newArray) {

			System.out.printf(" %d ", n);
		}

	}

	public static int count(int[] array) {

		int[] newArray = uniqueNumbers(array);

		int count = 0;

		for (int n : newArray) {
			count++;

		}
		return count;
	}

	public static int[] uniqueNumbers(int[] array) {

		int end = array.length;

		for (int i = 0; i < end; i++) {
			for (int j = i + 1; j < end; j++) {
				if (array[i] == array[j]) {
					int shiftLeft = j;
					for (int k = j + 1; k < end; k++, shiftLeft++) {
						array[shiftLeft] = array[k];

					}
					end--;
					j--;
				}
			}

		}
		int[] newArray = new int[end];

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = array[i];
		}
		return newArray;

	}

}
