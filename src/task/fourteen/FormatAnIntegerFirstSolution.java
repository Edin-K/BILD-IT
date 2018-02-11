package task.fourteen;
// Zadaca_14_19_11_2017

import java.util.Scanner;

/*
 *  @uthor Edin Korkic
 * 
 *   Napisati metodu sa sljede�im headerom: public static String format(int number, int width) 
 *   koja vra�a string broja sa prefiksom od jedne ili vi�e nula. Veli�ina stringa je width argument. 
 *   Na primjer, ukoliko pozovemo metodu format(34, 4) metoda vra�a 0034, ukoliko pozovemo format(34, 5) 
 *   metoda vra�a 00034. Ukoliko je uneseni broj ve�i nego width argument, metoda vra�a samo string broja. 
 *   Npr. ukoliko pozovemo format(34, 1) metoda vra�a 34.
 */

public class FormatAnIntegerFirstSolution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite broj i duzinu stringa: ");

		int number = input.nextInt();

		int width = input.nextInt();

		input.close();

		System.out.println(format(number, width));

	}

	public static String format(int number, int width) {

		return String.format("%0" + width + "d", number);

	}
}

