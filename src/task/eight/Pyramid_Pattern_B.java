package task.eight;
//Zadaca_8_13_11_2017

import java.util.Scanner;

/*
 *  @uthor Edin Korkic
 * 
 *  Napisati program koji ispisuje ova 4 patterna. BONUS: pitati korisnika da unese koliko redova �eli ispisati. 
 *  
 *  Display four patterns using loops) Use nested loops that display the following
 *  patterns in four separate programs:
 *  
 *   Pattern B 
 *	 1  2  3  4  5  6 
 *	 1  2  3  4  5 
 * 	 1  2  3  4 
 *	 1  2  3 
 *	 1  2 
 * 	 1 
 * 
 */


public class Pyramid_Pattern_B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite broj redova piramide: ");

		int row = input.nextInt();

		input.close();

		System.out.printf(" Pattern B \n");

		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.printf(" %d ", j);
			}
			System.out.printf("\n");
		}
	}
}
