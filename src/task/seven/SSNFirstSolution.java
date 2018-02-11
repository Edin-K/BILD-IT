package task.seven;
//Zadaca_7_4_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese Social Security Number
 *  (SSN) u formatu DDD-DD-DDDD gdje D predstavlja broj. Program treba da
 *  provjerava da li je broj unesešen u ispravnom formatu. Ukoliko nije,
 *  program pita korisnika da pokuša ponovo. Ukoliko jeste unešen u
 *  pravom formatu, program završava sa radom.
 */

public class SSNFirstSolution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite SSN broj:");
		String ssn = input.nextLine();

		input.close();

		if (ssn.length() == 11 && Character.isDigit(ssn.charAt(0)) && Character.isDigit(ssn.charAt(1))
				&& Character.isDigit(ssn.charAt(2)) && (ssn.charAt(3) == '-') && Character.isDigit(ssn.charAt(4))
				&& Character.isDigit(ssn.charAt(5)) && (ssn.charAt(6) == '-') && Character.isDigit(ssn.charAt(7))
				&& Character.isDigit(ssn.charAt(8)) && Character.isDigit(ssn.charAt(9))
				&& Character.isDigit(ssn.charAt(10))) {
			System.out.printf(" Unijeli ste ispravan SSNFirstSolution broj!");
			System.exit(0);

		} else {
			System.out.printf(" Niste unijeli ste ispravan SSNFirstSolution broj,pokusajte ponovo!");
		}

	}

}

