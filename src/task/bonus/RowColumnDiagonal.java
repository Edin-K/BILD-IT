package task.bonus;
//Zadaca_BONUS_02_12_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese velicnu n x n matrice, nasumicno ispuni 
 *  matricu sa 0-ma i 1-cama, ispisuje matricu na konzoli te pronalazi sve redove, kolone 
 *  i dijagonale ispunjene samo sa 0-ma ili 1-cama. 
 *  Sample run:
 *  Unesite velicinu matrice: 4
 *  
 *  0111
 *  0000
 *  0100
 *  1111
 *  Sve 0: red 1
 *  Sve 1: red 3
 *  Nijedna kolumna ne sadrzi sve 0 ili 1
 *  Uzlazna dijagonala na sadrzi sve 0 ili 1
 *  Silazna dijagonala ne sadrzi sve 0 ili 1
 */

public class RowColumnDiagonal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite velicinu matrice: ");

		int length = input.nextInt();

		int[][] matrix = new int[length][length];

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = (int) (Math.random() * 2);
				System.out.printf(" %d ", matrix[row][col]);
			}
			System.out.printf("\n");
		}

		input.close();

		System.out.printf("\n");

		sumRow(matrix);
		sumColumn(matrix);
		sumMainDiagonal(matrix);
		sumOtherDiagonal(matrix);

	}

	public static void sumRow(int[][] matrix) {

		int r = 0;
		int sumMax = 0;

		for (int col = 0; col < matrix[0].length; col++) {
			sumMax += matrix[0][col];
		}

		int sum = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				sum += matrix[row][col];
				if (sumMax < sum) {
					sumMax = sum;
					r = row;
				}
			}
		}
		if (sum == 0 && sum == matrix.length) {
			System.out.printf(" Sve 0 red: %d ", r);
			System.out.printf(" Sve 1 red: %d ", r);
		} else {
			System.out.printf(" Nijedan red ne sadrzi sve 0 ili 1 ");
		}

		System.out.printf("\n");
	}

	public static void sumColumn(int[][] matrix) {

		int c = 0;
		int sumMax = 0;

		for (int row = 0; row < matrix.length; row++) {
			sumMax += matrix[row][0];
		}
		int sum = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				sum += matrix[col][row];
				if (sumMax < sum) {
					sumMax = sum;
					c = col;
				}
			}
		}
		if (sum == 0 && sum == matrix.length) {
			System.out.printf(" Sve 0 kolumna: %d ", c);
			System.out.printf(" Sve 1 kolumna: %d ", c);
		} else {
			System.out.printf(" Nijedna kolumna ne sadrzi sve 0 ili 1 ");
		}
		System.out.printf("\n");
	}

	public static void sumMainDiagonal(int[][] matrix) {

		int sum = 0;

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				sum += matrix[row][row];
			}
		}
		if (sum == 0 && sum == matrix.length) {
			System.out.printf(" Silazna dijagonala sadrzi sve 0 ili 1 ");
		} else {
			System.out.printf(" Silazna dijagonala na sadrzi sve 0 ili 1 ");
		}
		System.out.printf("\n");
	}

	public static void sumOtherDiagonal(int[][] matrix) {

		int sum = 0;
		int index = matrix.length - 1;

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				if (row + col == index) {
					sum += matrix[col][row];
				}
			}
		}
		if (sum == 0 && sum == matrix.length) {
			System.out.printf(" Uzlazna dijagonala sadrzi sve 0 ili 1 ");
		} else {
			System.out.printf(" Uzlazna dijagonala na sadrzi sve 0 ili 1 ");
		}
		System.out.printf("\n");
	}
}

