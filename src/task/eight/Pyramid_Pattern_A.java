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
 *  Pattern A
 *  1 
 *  1 2 
 *  1 2 3 
 *  1 2 3 4 
 *  1 2 3 4 5 
 *  1 2 3 4 5 6 
 * 
 */

public class Pyramid_Pattern_A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesite broj redova piramide: ");
		
		int row = input.nextInt();
		
		input.close();
		
		System.out.printf(" Pattern A \n");

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf(" %d ",j);
			}
			System.out.printf("\n");
		}
	}

}

