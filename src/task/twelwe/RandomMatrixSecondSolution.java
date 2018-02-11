package task.twelwe;
// Zadaca_12_17_11_2017

import java.util.Scanner;

/*
 *  @uthor Edin Korkic
 * 
 *  Napisati metodu koja ispisuje n x n matricu koristeæi se sljedeæim headerom: 
 *  public static void printMatrix(int n). Svaki element u matrici je ili 0 ili 1, 
 *  nasumièno generisana. Napisati test program koji pita korisnika da unese broj 
 *  n te mu ispiše n x n matricu u konzoli.
 */

public class RandomMatrixSecondSolution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite broj redova i kolona matrice: ");

		int n = input.nextInt();

		input.close();

		printMatrix(n);

	}

	public static void printMatrix(int n) {

		int matrix[][] = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);

			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf(" %d ", matrix[i][j]);

			}

			System.out.printf("\n");
		}

	}
}


	