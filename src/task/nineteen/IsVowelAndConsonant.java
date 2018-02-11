package task.nineteen;
// Zadaca_19_27_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati metodu koja prima kao argument jedan karakter te odreðuje da li je 
 *  primljeni karakter samoglasnik, suglasnik ili nešto drugo. 
 *  Sample run:
 *  Unesite karakter: B
 *  B je suglasnik. 
 *  Unesite karakter: a
 *  a je samoglasnik
 *  Unesite karakter: #
 *  # predstavlja pogrešan unos. 
 */

public class IsVowelAndConsonant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite karakter: ");

		char ch = input.next().charAt(0);

		input.close();

		if (!Character.isLetter(ch)) {
			System.out.printf(ch + " predstavlja pogresan unos.");
		} else {
			if (isVowel(ch)) {
				System.out.printf(ch + " je samoglasnik.");
			} else if (!isVowel(ch)) {
				System.out.printf(ch + " je suglasnik.");
			}
		}
	
		
	}

	public static boolean isVowel(char ch) {

		switch (ch) {

		case 'A':
			break;
		case 'E':
			break;
		case 'I':
			break;
		case 'O':
			break;
		case 'U':
			break;
		case 'a':
			break;
		case 'e':
			break;
		case 'i':
			break;
		case 'o':
			break;
		case 'u':
			break;

		default:
			return false;

		}
		return true;
	}
}

