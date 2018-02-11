package task.twentytwo;
// Zadaca_22_30_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati metodu koja vraæa zbir dvije matrice. Metoda treba da ima sljedeæi header: 
 *  public static saberiMatrice(double[][] a, double[][] b). Da bi dvije matrice bile sabrane, 
 *  moraju imati iste dimenzije te iste ili kompatibilne tipove podataka. 
 *  Napisati program koji pita korisnika da unese dvije 3 x 3 matrice te vrati zbir unesenih matrica. 
 *  Sample run:
 *  Unesite prvu matricu: 1 2 3 4 5 6 7 8 9
 *  Unesite drugu matricu: 0 2 4 1 4.5 2.2 1.1 4.3 5.2
 *  Rezultirajuæa matrica:
 *  1.0 4.0 7.0
 *  5.0 9.5 8.2
 *  8.1 12.3 14.2
 */

public class SumMatrix {

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

		double[][] c = sumMatrix(a, b);

		System.out.printf(" Rezultirajua matrica: \n ");
		
		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c[row].length; col++) {
				System.out.printf("%5.1f",c[row][col]);
			}
			System.out.printf("\n");
		}

	}

	public static double[][] sumMatrix(double[][] a, double[][] b) {

		double[][] sum = new double[a.length][a[0].length];

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				sum[row][col] = a[row][col] + b[row][col];
			}
		}
		return sum;
	}
}

