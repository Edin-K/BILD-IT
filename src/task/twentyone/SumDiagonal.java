package task.twentyone;
// Zadaca_21_29_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *   Napisati metodu koja sabira sve elemente duž silazne dijagonale n x n matrice koristeæi 
 *   se sljedeæim headerom: public static double sumirajSilaznuDijagonalu(double[][] niz). 
 *   (u matrici 4 x 4, silaznu dijagonalu saèinjavaju elementi 0.0 1.1 2.2 3.3) 
 *   Napisati program koji pita korisnika da unese 4 x 4 matricu double vrijednosti te 
 *   ispisuje sumu svih elemenata duž silazne dijagonale. 
 *   BONUS: Napisati metodu koja sabira sve elemente duž uzlazne dijagonale. (3.0 2.1 1.2 0.3)
 *   Sample run: 
 *   Unesite 4 x 4 matricu, red po red:
 *   1 2 3 4.0
 *   5 6.5 7 8 
 *   9 10 11 12
 *   13 14 15 16
 *   
 */

public class SumDiagonal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[][] matrix = new double[4][4];

		System.out.print("  Unesite 4 x 4 matricu, red po red:\n");

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = input.nextDouble();
			}

		}
		input.close();

		System.out.printf(" Suma svih elemenata duz silazne dijagonale je: %.1f \n", sumMainDiagonal(matrix));
		System.out.printf(" Suma svih elemenata duz ulazne dijagonale je: %.1f ", sumOtherDiagonal(matrix));

	}

	public static double sumMainDiagonal(double[][] matrix) {

		double sum = 0;

		for (int row = 0; row < matrix.length; row++) {
			sum += matrix[row][row];
		}
		return sum;

	}

	/*
	 * BONUS: Napisati metodu koja sabira sve elemente duž uzlazne(sporedne)
	 * dijagonale.
	 */
	public static double sumOtherDiagonal(double[][] matrix) {

		double sum = 0;
		int index = matrix.length - 1;

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				if (row + col == index) {
					sum += matrix[row][col];
				}
			}
		}
		return sum;

	}
}

