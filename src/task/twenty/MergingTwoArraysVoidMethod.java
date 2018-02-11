package task.twenty;
// Zadaca_20_28_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *   Napisati metodu koja kao argument prima 2 niza brojeva te vraæa novi kombinovani niz. 
 *   Ukoliko unesemo dva niza [1, 2, 3] i [10, 11, 12] metoda treba da vrati sljedeæi niz 
 *   [1, 10, 2, 11, 3, 12].
 */

public class MergingTwoArraysVoidMethod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array1 = new int[3];
		int[] array2 = new int[3];

		System.out.print(" Unesite prvi niz: ");

		for (int i = 0; i < array1.length; i++) {
			array1[i] = input.nextInt();
		}

		System.out.print(" Unesite drugi niz: ");

		for (int i = 0; i < array2.length; i++) {
			array2[i] = input.nextInt();

		}

		input.close();

		mergingTwoArrays(array1, array2);

	}

	public static void mergingTwoArrays(int[] array1, int[] array2) {

		for (int i = 0; i < array1.length; i++) {

			System.out.printf(array1[i] + " " + array2[i]);

			System.out.printf(" ");
		}

	}
}
