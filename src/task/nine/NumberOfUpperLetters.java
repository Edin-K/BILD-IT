package task.nine;
//Zadaca_9_14_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 * Napisati program koji pita korisnika da unese neki string te ispisuje koliko
 * je velikih slova (uppercase slova) u datom stringu.
 */

public class NumberOfUpperLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite string: ");
		String s = input.nextLine();

		input.close();

		int countUpper = 0;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				countUpper++;

			}

		}
		if (countUpper > 0) {
			System.out.printf(" Unijeti string ima velikih slova %d\n", countUpper);
		}else{
			System.out.printf(" Unijeti string nema velikih slova.");
			
		}
	}

}

