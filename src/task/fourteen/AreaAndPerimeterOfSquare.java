package task.fourteen;
// Zadaca_14_19_11_2017

import java.util.Scanner;

/*
 *  @uthor Edin Korkic
 * 
 *   Napisati metode koje izraèunavaju obim i površinu kvadrata. Metode trebaju imati sledeæe headere: 
 *   public static double obim(double stranica) 
 *   public static double povrsina(double stranica)
 *   Napisati test program koji pita korisnika da unese dužinu stranice kvadrata i ispisuje mu obim i površinu tog kvadrata.
 *   Formule
 *   obim kvadrata - O = 4 x a - gdje je a stranica kvadrata
 *   površina kvadrata - P = a x a - gdje je a stranica kvadrata
 */

public class AreaAndPerimeterOfSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite duzinu stranice kvadrata: ");

		double side = input.nextDouble();

		input.close();

		System.out.printf(" Obim kvadrata stranice %.2f iznosi %.2f cm \n", side, perimeter(side));
		System.out.printf(" Povrsina kvadrata stranice %.2f iznosi %.2f cm^2", side, area(side));

	}

	public static double perimeter(double side) {

		return 4 * side;

	}

	public static double area(double side) {

		return Math.pow(side, 2);

	}
}
