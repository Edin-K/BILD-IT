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

public class BubbleSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] array = new double[10];

		System.out.print(" Unesite niz od 10 double brojeva: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		input.close();

		System.out.printf(" Buble sort algoritam od najmanjeg do najveceg: \n ");

		double[] newArray = bubbleSort(array);

		for (double n : newArray) {
			System.out.printf(" %.1f ", n);
		}
	}

	public static double[] bubbleSort(double[] array) {

		int n = array.length;
          //unos 10 9 8 7 6 5 4 3 2 1
		//prvi prolaz 9 8 7 6 5 4 3 2 1 10 
		//drugi prolaz  8 7 6 5 4 3 2 1 9 10 itd
		for (int i = 0; i < (n - 1); i++) {
			for (int j = 0; j < (n - i - 1); j++) {
				if (array[j + 1] < array[j]) {
					double temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}

		}
		return array;
	}
}
