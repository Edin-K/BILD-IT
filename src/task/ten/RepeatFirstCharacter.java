package task.ten;
//Zadaca_10_15_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese string i ispisuje prvi 
 *  karakter koji se ne pojavljuje u ostatku stringa. 
 *  Sample run programa:
 *  Unesite neki string: yellow
 *  Prvi karakter koji se ne pojavljuje u ostatku stringa je: y
 */

public class RepeatFirstCharacter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite string: ");

		String s = input.nextLine();

		input.close();

		boolean repeat = true;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			repeat = false;
			for (int j = 0; j < s.length(); j++) {
				if (ch == s.charAt(j) && i != j) {
					repeat = true;
					break;
				}
			}
			if (!repeat) {
				System.out.printf(" Prvi karakter koji se ne pojavljuje u ostatku stringa je: %c ", ch);
				break;
			}
		}

	}

}
