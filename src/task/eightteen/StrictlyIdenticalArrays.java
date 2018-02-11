package task.eightteen;
// Zadaca_18_26_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Nizovi niz1 i niz2 su striktno identièni ukoliko imaju elemente sa istim vrijednostima 
 *  na istim indeksima niza. Napisati boolean metodu koja provjerava da li su dva prosljeðena 
 *  niza striktno identièna. Koristiti sljedeæi header:
 *  public static boolean striktnoIdenticniNizovi(int[] niz1, int[] niz2)
 *  Prilikom testiranja metode, pitati korisnika da unese oba niza. 
 *  Sample run:
 *  Unesite duzinu nizova: 6
 *  Unesite prvi niz: 5 2 5 6 6 1
 *  Unesite drugi niz: 5 2 5 6 6 1
 *  Dva niza su striktno identicna
 *  
 *  Unesite duzinu nizova: 7
 *  Unesite prvi niz: 5 2 5 6 6 1 8
 *  Unesite drugi niz: 5 2 5 6 1 6 8
 *  Dva niza nisu striktno identicna
 */


public class StrictlyIdenticalArrays {

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
		
		System.out.printf(" Dva niza " + (strictlyIdenticalArrays(array1,array2) ? " su " : " nisu ") + " striktno indeticna ");
	}

	public static boolean strictlyIdenticalArrays(int[] array1, int[] array2) {
		
		

		for (int i = 0; i < array2.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;

	}
}

