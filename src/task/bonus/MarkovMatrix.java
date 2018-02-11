package task.bonus;
//Zadaca_BONUS_02_12_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  n x n matrica je pozitivna Markov matrica ukoliko je svaki element pozitivan te 
 *  ukoliko je suma svake kolone 1.  Napisati metodu koja koristi sljedeci header da 
 *  provjeri da li je prosljedena matrica Markov matrica:
 *  public statici boolean isMarkovMatrica(double[][] matrica)
 *  Napisati program koji pita korisnika da unese 3 x 3 matricu double vrijednosti 
 *  te provjerava da li je unijeta matrica Markov matrica. 
 *  Sample run:
 *  Unesite 3 x 3 matricu, red po red:
 *  0.15 0.875 0.375
 *  0.55 0.005 0.225
 *  0.30 0.12 0.4
 *  
 *  Prosljedjena matrica je Markov matrica. 
 *  
 *  Unesite 3 x 3 matricu, red po red:
 *  0.95 -0.875 0.375
 *  0.65 0.005 0.225
 *  0.30 0.22 -0.4
 *  
 *  Prosljedjena matrica nije Markov matrica. 
 */

public class MarkovMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[][] matrix = new double[3][3];
		
		System.out.print(" Unesite 3 x 3 matricu, red po red: \n ");

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = input.nextDouble();
			}

		}
		
		input.close();
		
		System.out.printf(" Prosljedjena matrica " + (isMarkovMatrix(matrix) ? "je" : "nije") + " Markov matrica. ");

	}

	public static boolean isMarkovMatrix(double[][] matrix) {

		double sum = 0;

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				sum += matrix[row][col];
				if (sum != 1 && matrix[row][col] < 0) {
					return false;
				}
			}

		}
		
		return true;
	}
}
/**
 0,95 -0,875 0,375
 0,65 0,005 0,225
 0,30 0,22 -0,4
*/
/**
 0,15 0,875 0,375
 0,55 0,005 0,225
 0,30 0,12 0,4
 */


