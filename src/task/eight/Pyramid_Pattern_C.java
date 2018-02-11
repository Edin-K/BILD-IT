package task.eight;
//Zadaca_8_13_11_2017

import java.util.Scanner;

/*
 *  @uthor Edin Korkic
 * 
 *  Napisati program koji ispisuje ova 4 patterna. BONUS: pitati korisnika da unese koliko redova želi ispisati. 
 *  
 *  Display four patterns using loops) Use nested loops that display the following
 *  patterns in four separate programs:
 *  
 *  Pattern C 
 *           1
 *         2 1
 *       3 2 1
 *     4 3 2 1
 *   5 4 3 2 1
 * 6 5 4 3 2 1
 *  
 */

public class Pyramid_Pattern_C {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite broj redova piramide: ");

		int row = input.nextInt();

		input.close();

		System.out.printf(" Pattern C \n");

		for (int i = 1; i <= row; i++) {
			for (int j = i; j <= (row - 1); j++) {
				System.out.printf("  ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.printf(" %d", k);
			}
			System.out.printf("\n");
		}
	}

}

