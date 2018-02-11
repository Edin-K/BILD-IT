package task.fourteen;
//Zadaca_14_19_11_2017

import java.util.Scanner;

/*
 *  @uthor Edin Korkic
 * 
 *   Napisati metodu sa sljedeæim headerom: public static String format(int number, int width) 
 *   koja vraæa string broja sa prefiksom od jedne ili više nula. Velièina stringa je width argument. 
 *   Na primjer, ukoliko pozovemo metodu format(34, 4) metoda vraæa 0034, ukoliko pozovemo format(34, 5) 
 *   metoda vraæa 00034. Ukoliko je uneseni broj veæi nego width argument, metoda vraæa samo string broja. 
 *   Npr. ukoliko pozovemo format(34, 1) metoda vraæa 34.
 */

public class FormatAnIntegerThirdSolution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite broj i duzinu stringa: ");

		System.out.print(format(input.nextInt(), input.nextInt()));

		input.close();

	}

	public static String format(int number, int width) {

		if (Integer.toString(number).length() >= width) {
			return Integer.toString(number);
		}
		String formatNumber = "";

		for (int i = 0; i < (width - Integer.toString(number).length()); i++) {

			formatNumber += 0;

		}
		return formatNumber + number;

	}
}

