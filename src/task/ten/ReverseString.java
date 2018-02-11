package task.ten;
//Zadaca_10_15_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese neki string te ispisuje taj isti string naopako.
 */

public class ReverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite string: ");

		String s = input.nextLine();

		input.close();

		String reverse = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			reverse += s.charAt(i);

		}

		System.out.printf(" Unijeti string naopako: %s ", reverse);


	}

}
