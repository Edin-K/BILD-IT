package task.twentytwo;
// Zadaca_22_30_11_2017

import java.util.Scanner;

public class MySort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] array = new double[10];

		System.out.print(" unesite niz od 10 double brojeva: ");

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

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					double temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}

		}
		
		
		return array;

	}
}

