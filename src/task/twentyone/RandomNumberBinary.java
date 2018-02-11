package task.twentyone;
// Zadaca_21_29_11_2017

import java.util.Random;
import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji nasumièno generiše niz od 100.000 cijelih brojeva. Nakon 
 *  što je program generisao niz, korisnik unosi vrijednost koju želi pronaæi u nizu. 
 *  Izmjeriti vrijeme potrebno za pronalaženje vrijednosti u nizu koristeæi algoritme 
 *  za linearno i binarno pretraživanje. 
 *  HINT: 
 *  long pocetakMjerenja = System.currentTimeMillis();
 *  long krajMjerenja = System.currentTimeMillis();
 *  long ukupnoVrijeme = krajMjerenja - pocetakMjerenja;
 */

public class RandomNumberBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[100000];

		long startTime = System.currentTimeMillis();

		Random random = new Random();

		for (int i = 0; i < array.length; i++){
			array[i] = random.nextInt(1000);
		}

		System.out.print(" Unesite vrijednost koju zelite pronaci u nizu(0 - 999): ");
		
		int key = input.nextInt();

		long endTime = System.currentTimeMillis();

		long totalTime = (endTime - startTime) / 1000;

		System.out.printf(" Potrebno vrijeme za pronalazak broja iznosi %d sekundi! ", totalTime);

	}

	// Linearni algoritam za pretrazivanje

	public static int linearSearch(int[] array, int key) {

		for (int i = 0; i < array.length; i++){
			if (key == array[i]) {
				return i;
			}
		}

		return -1;
	}

	public static int[] selectionSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			int min = array[i];
			int minIndex = i;

			for (int j = i; j < array.length; j++) {
				if (min > array[j]) {
					min = array[j];
					minIndex = j;
				}
			}

			if (minIndex != i) {
				array[minIndex] = array[i];
				array[i] = min;
			}
		}

		return array;
	}

	// Binarni algoritam za pretrazivanje

	public static int binarySearch(int[] list, int key) {

		int low = 0, high = list.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			
			if (key < list[mid]) {
				high = mid - 1;

			} else if (key == list[mid]) {
				return mid;

			} else {
				low = mid + 1;
			}
		}
		return -1;

	}

}

