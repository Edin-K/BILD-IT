package task.twentytwo;
// Zadaca_22_30_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *   Slièno prethodnom zadatku, napisati metodu koja vraæa proizvod dvije matrice. Da bi dvije 
 *   matrice bile pomnožene, moraju imati iste dimenzije te iste ili kompatibilne tipove podataka.
 *   Napisati program koji pita korisnika da unese dvije 3 x 3 matrice te vrati proizvod unesenih matrica. 
 *   Sample run:
 *   Unesite prvu matricu: 1 2 3 4 5 6 7 8 9
 *   Unesite drugu matricu: 0 2 4 1 4.5 2.2 1.1 4.3 5.2
 *   Rezultirajuæa matrica:
 *   5.3 23.9 24
 *   11.6 56.3 58.2
 *   17.9 88.7 92.4
 */

public class MultiplyMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[][] a = new double[3][3];
		double[][] b = new double[3][3];

		System.out.print(" Unesite prvi niz: ");

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				a[row][col] = input.nextDouble();
			}
		}
		System.out.print(" Unesite drugi niz: ");

		for (int row = 0; row < b.length; row++) {
			for (int col = 0; col < b[0].length; col++) {
				b[row][col] = input.nextDouble();
			}
		}

		input.close();

		double[][] m = multiplyMatrix(a, b);

		System.out.printf(" Rezultirajuæa matrica: \n ");

		for (int row = 0; row < m.length; row++) {
			for (int col = 0; col < m[0].length; col++) {
				System.out.printf("%-5.1f", m[row][col]);
			}
			System.out.printf("\n");
		}

	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {

		while (a.length != b.length && a[0].length != b[0].length) {
			break;
		}
		
		double[][] m = new double[a.length][a[0].length];

		
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < b[0].length; col++) {
				for (int num = 0; num < a[0].length; num++) {
					m[row][col] += a[row][num] * b[num][col];
				}

			}
		}
		return m;
	}
}

