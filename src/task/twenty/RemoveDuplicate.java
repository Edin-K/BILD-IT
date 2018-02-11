package task.twenty;
// Zadaca_20_28_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *   Napisati metodu koja kao arugment prima neki niz te uklanja sve duplikate iz prosljeðenog 
 *   niza. Koristiti sljedeæi header: public static int[] ukloniDuplikate(int[] niz). 
 *   Sample run:
 *   Unesite 10 brojeva: 1 2 3 2 1 6 3 4 5 2
 *   Jedinstveni brojevi iz prosljedenog niza su: 1 2 3 6 4 5 
 */

public class RemoveDuplicate {

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

		int[] remove = removeDuplicate(array);

		System.out.printf(" Jedinstveni brojevi iz prosljedenog niza su: ");
		for (int n : remove) {
			System.out.printf(" %d ", n);
		}

	}

	public static int[] removeDuplicate(int[] array) {

		int end = array.length;

		for (int i = 0; i < end; i++) {
			for (int j = i + 1; j < end; j++) {
				if (array[i] == array[j]) {
					int remove = j;
					for (int k = j + 1; k < end; k++, remove++) {
						array[remove] = array[k];
					}
					end--;
					j--;
				}
			}
		}

		return array;
	}
}
