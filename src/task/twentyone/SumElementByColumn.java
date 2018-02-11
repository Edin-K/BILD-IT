package task.twentyone;
// Zadaca_21_29_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati metodu koja vraæa sumu svih elemenata u navedenoj koloni matrice koristeæi 
 *  se sljedeæim headerom: public static double sumirajKolonu(double[][] niz, int kolona). 
 *  Napisati program koji pita korisnika da unese 3 x 4 matricu te ispisuje sumu svih kolona. 
 *  Sample run:
 *  Unesite 3 x 4 matricu, red po red:
 *  1.5 2 3 4
 *  5.5 6 7 8
 *  9.5 1 3 1
 *  Zbir svih elemenata u koloni 0 je: 16.5
 *  Zbir svih elemenata u koloni 1 je: 9.0
 *  Zbir svih elemenata u koloni 2 je: 13.0
 *  Zbir svih elemenata u koloni 3 je: 13.0
 */

public class SumElementByColumn {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[][] matrix = new double[3][4];

		System.out.print("  Unesite 3 x 4 matricu, red po red:\n");

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = input.nextDouble();
			}

		}
		input.close();
		
		for (int col = 0; col < matrix[0].length; col++) {
			System.out.printf(" Zbir svih elemenata u koloni %d je: %.1f \n", col,sumColumn(matrix,col));
			
		}
		
	}
public static double sumColumn(double[][] matrix, int column) {
	
	double sum = 0;
	
	for (int row = 0; row < matrix.length; row++) {
		sum += matrix[row][column];
		
	}
	return sum;
	
	
}
}

