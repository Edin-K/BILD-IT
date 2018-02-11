package task.nineteen;
// Zadaca_19_27_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese dva stringa te ispisuje zajednièki
 *  prefiks za oba stringa ukoliko isti postoji. BONUS: riješiti problem metodom.
 *  
 *  Sample run:
 *  
 *  Unesite prvi string: Dobrodosli na Java programiranje
 *  Unesite drugi string: Dobrodosli na C++ programiranje
 *  
 *  Zajednici prefiks za dva strina je: Dobrodosli na
 *  
 *  Unesite prvi string: za Beograd
 *  Unesite drugi string: firmom Krstic
 *  
 *  Stringovi za Beograd i firmom Krstic nemaju zajednicki prefiks.
 *  
 */

public class CommonPrefix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite prvi string:");

		String s1 = input.nextLine();

		System.out.print(" Unesite drugi string:");

		String s2 = input.nextLine();

		input.close();

		String prefix = commonPrefix(s1, s2);

		if (prefix != null && prefix.length() > 0) {
			System.out.printf(" Zajednici prefiks za dva strina je: %s ", commonPrefix(s1, s2));
		} else {
			System.out.printf(" Stringovi %s i %s nemaju zajednicki prefiks.", s1, s2);

		}
	}

	public static String commonPrefix(String s1, String s2) {

		int l = s2.length();
		int count = 0;

		if (s1.length() < s2.length()) {
			l = s1.length();
		}
		for (int i = 0; i < l; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				break;
			}
			count++;
		}
		return s1.substring(0, count);
	}
}
