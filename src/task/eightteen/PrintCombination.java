package task.eightteen;
// Zadaca_18_26_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese 10 cijelih brojeva te mu ispisuje
 *  sve moguæe kombinacije parova tih 10 unesenih brojeva. 
 *  BONUS: ispisati ukupan broj moguæih kombinacija. 
 */

public class PrintCombination {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[10];

		System.out.print(" Unesite 10 cijelih brojeva: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		input.close();

		printCombination(array);

	}

	public static void printCombination(int[] array) {

		int count = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] != array[j]) {
					System.out.printf(array[i] + " " + array[j]);
					count++;
					System.out.printf("\n");
				}
			}

		}
		System.out.printf(" Broj mogucih kombinacija je: %d ", count);
	}

}

