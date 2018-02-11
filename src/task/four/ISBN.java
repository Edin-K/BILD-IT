package task.four;
//Zadaca_4_31_10_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 * 
 *  ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva:
 *  d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. Posljednji broj, d10, služi kao
 *  checksum i njega izraèunavamo iz prvih devet brojeva koristeæi se
 *  sljedeæom formulom: (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6
 *  * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11. Ukoliko je checksum 10, zadnji
 *  broj oznaèavamo sa X u skladu sa ISBN-10 konvencijom. Napisati
 *  program koji pita korisnika da unese prvih 9 brojeva te ispiše
 *  desetocifreni ISBN-10 broj.
 * 
 *  Sample run programa:
 * 
 *  Unesite prvih 9 ISBN brojeva: 013601267 ISBN-10 broj je: 0136012671
 *  Unesite prvih 9 ISBN brojeva: 013031997 ISBN-10 broj je: 013031997X
 */

public class ISBN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Unesite prvih 9 ISBN brojeva:");

		int d1 = input.nextInt();
		int d2 = input.nextInt();
		int d3 = input.nextInt();
		int d4 = input.nextInt();
		int d5 = input.nextInt();
		int d6 = input.nextInt();
		int d7 = input.nextInt();
		int d8 = input.nextInt();
		int d9 = input.nextInt();

		input.close();

		int d = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		if (d == 10) {
			System.out.printf(" ISBN-10 broj je: %d%d%d%d%d%d%d%d%dX ", d1, d2, d3, d4, d5, d6, d7, d8, d9);
		} else {
			System.out.printf(" ISBN-10 broj je: %d%d%d%d%d%d%d%d%d1 ", d1, d2, d3, d4, d5, d6, d7, d8, d9);
		}

	}
}
