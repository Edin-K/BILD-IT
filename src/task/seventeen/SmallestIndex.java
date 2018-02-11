package task.seventeen;
// Zadaca_17_25_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati metodu koja vraæa indeks elementa koji sadrži najmanju vrijednost u nizu. 
 *  Testirati metodu na isti naèin kao u zadatku 3 samo vratiti indeks na kojem se 
 *  nalazi najmanja vrijednost, ne samu vrijednost. Ako unesemo iste brojeve kao u 
 *  zadatku tri, program treba da vrati 4 jer se najmanja vrijednost nalazi na petoj 
 *  poziciji u nizu. 
 */

public class SmallestIndex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] array = new double[10];

		System.out.print(" Unesite niz od 10 double brojeva: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}

		input.close();

		System.out.printf(" Najmanja vrijednost u unijetom nizu je na indexu: [%d] ", smallestIndex(array));
	}

	public static int smallestIndex(double[] array) {

		double min = array[0];
		int minIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				minIndex = i;
			}
		}
		return minIndex;
	}
}
