package task.eightteen;
// Zadaca_18_26_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Nizovi niz1 i niz2 su identièni ukoliko imaju isti sadržaj. Napisati boolean 
 *  metodu koja provjerava da li su dva prosljeðena niza identièna. 
 *  Koristiti sljedeæi header:
 *  public static boolean identicniNizovi(int[] niz1, int[] niz2)
 *  Prilikom testiranja metode, pitati korisnika da unese oba niza. 
 *  Sample run:
 *  Unesite duzinu nizova: 6
 *  Unesite prvi niz: 5 2 5 6 6 1
 *  Unesite drugi niz: 5 5 2 6 1 6
 *  Dva niza su identicna
 *  
 *  Unesite duzinu nizova: 7
 *  Unesite prvi niz: 5 5 5 6 6 1 8
 *  Unesite drugi niz: 5 2 5 6 1 6 9
 *  Dva niza nisu identicna
 */

public class IdenticalArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite duzinu nizova: ");

		int length = input.nextInt();

		int[] array1 = new int[length];
		int[] array2 = new int[length];

		System.out.print(" Unesite prvi niz: ");

		for (int i = 0; i < array1.length; i++) {
			array1[i] = input.nextInt();
		}

		System.out.print(" Unesite drugi niz: ");

		for (int i = 0; i < array2.length; i++) {
			array2[i] = input.nextInt();

		}

		input.close();
		
	
		
		System.out.printf(" Dva niza " + (identicalArrays(array1,array2) ? " su " : " nisu ") + " indeticna ");

	}

	public static int[] sortArray1(int[] array1) {

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				if (array1[i] < array1[j]) {
					int temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
					
				}

			}

		}
		return array1;

	}

	public static int[] sortArray2(int[] array2) {

		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array2[i] < array2[j]) {
					int temp = array2[i];
					array2[i] = array2[j];
					array2[j] = temp;
					
				}

			}

		}
		return array2;
	}

	public static boolean identicalArrays(int[] array1, int[] array2) {

		int[] array3 = sortArray1(array1);
		int[] array4 = sortArray2(array2);
		

		for (int i = 0; i < array3.length; i++) {
			if (array3[i] != array4[i]) {
				return false;
			}
		}
		return true;

	}
}

