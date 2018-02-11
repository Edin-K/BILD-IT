package task.seventeen;
// Zadaca_17_25_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati metodu koja pronalazi najmanju vrijednost u nizu double vijednosti. 
 *  Napisati program koji testira ovu metodu tako što æe korisnik unijeti 10 vrijednosti. 
 *  Kada korisnik unese 10 vrijednosti, program poziva metodu i ispisuje na konzoli najmanju vrijednost. 
 *  Sample run: 
 *  Unesite 10 brojeva: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
 *  Najmanja vrijednost u unijetom nizu je: 1.5
 */

public class SmallestElement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] array = new double[10];

		System.out.print(" Unesite niz od 10 double brojeva: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		
		input.close();

		System.out.printf(" Najmanja vrijednost u unijetom nizu je: %.1f ", min(array));
	}

	public static double min(double[] array) {

		double min = array[0];

		for (double i : array) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}
}

