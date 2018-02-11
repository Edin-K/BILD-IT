package task.twenty;
// Zadaca_20_28_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati metodu koja kao argument prima niz brojeva te vraæa, kao novi niz, 
 *  sve elemente na neparnim pozicijama primljenog niza. 
 */

public class ElementOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite duzinu niza: ");

		int length = input.nextInt();

		int[] array = new int[length];

		System.out.printf(" Unesite niz od %d brojeva: ", length);

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		input.close();

		printElementOdd(array);
	}

	public static void printElementOdd(int[] array) {

		System.out.printf(" Elementi na neparnim pozicijama: ");

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.printf(" %d ", array[i]);
			}
		}

	}
}
