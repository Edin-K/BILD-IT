package task.seven;
//Zadaca_7_4_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese Social Security Number
 *  (SSN) u formatu DDD-DD-DDDD gdje D predstavlja broj. Program treba da
 *  provjerava da li je broj unese�en u ispravnom formatu. Ukoliko nije,
 *  program pita korisnika da poku�a ponovo. Ukoliko jeste une�en u
 *  pravom formatu, program zavr�ava sa radom.
 */

public class SSNSecondSolution {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite SSN broj:");
		String ssn = input.nextLine();

		input.close();

		// String isValid = String.format();
		String isValid = null;
		
		if (ssn == isValid) {
			System.out.println(" Corect ");
		} else {
			System.out.println(" NOT Corect ");
		}
	}

}

