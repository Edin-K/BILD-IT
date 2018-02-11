package task.nineteen;
// Zadaca_19_27_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 * Napisati program koji ispisuje sljedeæu piramidu:
 *                                                    1 
 *                                               1    2    1 
 *                                          1    2    3    2    1 
 *                                     1    2    3    4    3    2    1 
 *                                1    2    3    4    5    4    3    2    1 
 *                           1    2    3    4    5    6    5    4    3    2    1 
 *                      1    2    3    4    5    6    7    6    5    4    3    2    1 
 *                 1    2    3    4    5    6    7    8    7    6    5    4    3    2    1 
 *            1    2    3    4    5    6    7    8    9    8    7    6    5    4    3    2    1 
 *       1    2    3    4    5    6    7    8    9   10    9    8    7    6    5    4    3    2    1 
 *  1    2    3    4    5    6    7    8    9   10   11   10    9    8    7    6    5    4    3    2    1 
 * 
 * BONUS: Napisati metodu koja prima dva argumenta - poèetni broj i krajnji broj te ispisuje piramidu u tom rasponu. 
 */

public class PrintPyramidSecondSolution {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print(" Unesite broj za pocetak piramide: ");

		int start = input.nextInt();

		System.out.print(" Unesite broj za kraj piramide: ");

		int end = input.nextInt();

		System.out.print(" Unesite broj redova piramide: ");

		int row = input.nextInt();

		input.close();

		printPyramid(start, end);
		printPyramid(row);

	}

	public static void printPyramid(int start, int end) {

		int n = end + 1;
		for (int i = start; i <= n; i++) {
			for (int j = start; j <= (n - i); j++) {
				System.out.print("    ");
			}
			for (int k = 1; k < i; k++) {
				System.out.printf(" %2d ", k);
			}
			for (int l = i - 2; l >= 1; l--) {
				System.out.printf(" %2d ", l);

			}
			System.out.println();
		}
	}

	public static void printPyramid(int row) {

		// Vanjska petlja koja ide od 1 do unesenog broja
		for (int i = 1; i <= row; i++) {
			// Petlja za razmake
			for (int j = 1; j <= (row - i); j++) {
				System.out.print("    ");
				// %6s

			}
			// Petja za lijevu stranu piramide
			for (int j = i; j >= 1; j--) {
				System.out.printf(" %2d ", j);
			}
			// Petja za desnu stranu piramide
			for (int j = 2; j <= i; j++) {
				System.out.printf("  %2d ", j);

			}
			System.out.println();
		}
	}

}
