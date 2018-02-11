package task.nineteen;
// Zadaca_19_27_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Me�unarodni standard za mapiranje slova na brojeve na telefonima mo�ete pogledati na slici ispod. 
 *  Napisati program koji pita korisnika da unese neko slovo te, nakon unosa slova, ispisuje 
 *  odgovaraju�i broj za unijeto slovo. BONUS: Napisati metodu koja rje�ava ovaj problem. 
 *  Sample run:
 *  Unesite slovo: A
 *  Odgovaraju�i broj je 2
 *  Unesite slovo: a
 *  Odgovaraju�i broj je 2
 *  Unesite slovo: +
 *  + predstavlja pogre�an unos
 */

public class PhoneKeyPads {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite slovo: ");
		
		String s = input.next();

		input.close();
		
		if(number(s) != 0){
		System.out.printf(" Odgovarujici broj je: %d " ,number(s));
		}else{
			System.out.printf(" %s predstavlja pogresan unos", s);
		}
	}

	public static int number(String s) {

		char ch = s.toLowerCase().charAt(0);

		int n;

		switch (ch) {

		case 'a':
		case 'b':
		case 'c':
			n = 2;
			break;
		case 'd':
		case 'e':
		case 'f':
			n = 3;
			break;
		case 'g':
		case 'h':
		case 'i':
			n = 4;
			break;
		case 'j':
		case 'k':
		case 'l':
			n = 5;
			break;
		case 'm':
		case 'n':
		case 'o':
			n = 6;
			break;
		case 'p':
		case 'q':
		case 'r':
		case 's':
			n = 7;
			break;
		case 't':
		case 'u':
		case 'v':
			n = 8;
			break;
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			n = 9;
			break;

		default:
			n = 0;
			break;
		}
		
		return n;

	}
}
