package task.twentytwo;
// Zadaca_22_30_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati metodu koja implementira Bubble sort algoritam za sortiranje nizova. 
 *  Napisati program koji pita korisnika da unese 10 double brojeva, poziva ovu 
 *  metodu te ispisuje korisniku sortiran niz. 
 */

public class BubbleSortBoolean {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] array = new double[10];

		System.out.print(" Unesite niz od 10 double brojeva: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		input.close();

		System.out.printf(" Buble sort algoritam od najmanjeg do najveceg: \n ");

		bubbleSort(array);

		for (double n : array) {
			System.out.printf(" %.1f ", n);
		}
	}

	public static void bubbleSort(double[] array) {

		boolean sort = false;

		while (!sort) {
			sort = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					double temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					sort = false;

				}
			}

		}
	}

}

