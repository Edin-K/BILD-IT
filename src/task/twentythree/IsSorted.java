package task.twentythree;
// Zadaca_23_01_12_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati metodu koja kao argument prima jedan niz te vraca true ili false u zavisnosti 
 *  da li je niz vec uzlazno sortiran(od najmanje vrijednosti ka najveæoj) ili ne. 
 *  Metoda treba da koristi sljedeæi header: 
 *  public static boolean isSortiran(int[] niz)
 *  Napisati program koji pita korisnika da unese duzinu niza kao i sam niz, poziva ovu metodu 
 *  te ispisuje korisniku da li je niz sortiran ili ne. 
 *  Sample run:
 *  Unesite duzinu niza: 8
 *  Unesite niz: 10 1 5 16 61 9 11 1
 *  Uneseni niz nije sortiran. 
 *  
 *  Unesite duzinu niza: 10
 *  Unesite niz: 1 1 3 4 4 5 7 9 11 21
 *  Uneseni niz je sortiran. 
 */

public class IsSorted {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite duzinu niza: ");

		int length = input.nextInt();

		int[] array = new int[length];

		System.out.printf(" Unesite niz od %d elemenata: ", length);

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		input.close();

		System.out.printf(" Uneseni niz " + (isSorted(array) ? "je" : "nije") + " sortiran ");

	}

	public static boolean isSorted(int[] array) {

		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) {
				return false;

			}
		}
		return true;

	}
}

