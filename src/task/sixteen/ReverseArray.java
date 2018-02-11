package task.sixteen;
// Zadaca_16_24_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji taži od korisnika da unese 10 cijelih brojeva 
 *  te ih ispisuje korisniku u obrnutom redosljedu. 
 */

public class ReverseArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[10];

		System.out.print(" Unesite niz od 10 brojeva odvojenih spaceom: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		input.close();

		int[] reverse = reverse(array);

		System.out.printf(" Obrnuti niz: ");

		for (int n : reverse) {
			System.out.printf(" %d ", n);
		}

	}

	public static int[] reverse(int[] array) {

		int[] reverse = new int[array.length];

		for (int i = array.length - 1, j = 0; i >= 0 && j < array.length; i--, j++) {
			reverse[j] = array[i];

		}
		return reverse;


	}

}
