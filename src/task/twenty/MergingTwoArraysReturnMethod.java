package task.twenty;
// Zadaca_20_28_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *   Napisati metodu koja kao argument prima 2 niza brojeva te vraæa novi kombinovani niz. 
 *   Ukoliko unesemo dva niza [1, 2, 3] i [10, 11, 12] metoda treba da vrati sljedeæi niz 
 *   [1, 10, 2, 11, 3, 12].
 */

public class MergingTwoArraysReturnMethod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array1 = new int[3];
		int[] array2 = new int[3];

		System.out.print(" Unesite prvi niz: ");

		for (int i = 0; i < array1.length; i++) {
			array1[i] = input.nextInt();
		}

		System.out.print(" Unesite drugi niz: ");

		for (int i = 0; i < array2.length; i++) {
			array2[i] = input.nextInt();

		}

		input.close();
		
		int[] array = mergingTwoArrays(array1,array2);
		
		for(int m : array){
			System.out.printf(" %d ", m);
		}
		

	}
	public static int[] mergingTwoArrays(int[] array1, int[] array2) {
		
		int[] array3 = new int[array1.length + array2.length];
		
		for(int i = 0; i < array1.length; i++){
			array3[i] = array1[i]; 
			for(int j = 0; j < array1.length; j++){
				array3[i] = array2[j]; 
				
			}
			
		}
		return array3;
	}
	}

