package task.seven;
//Zadaca_7_4_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese neki string te mu
 *  ispisuje dužinu tog stringa kao i prvo slovo stringa.
 *
 */

public class StringLengthAndFirstCharacter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesite vas string:");
		String s = input.nextLine();
		
		input.close();
		
		System.out.printf(" Vas string je: %s \n", s);
		System.out.printf(" Duzina stringa je: %s\n", s.length());
		System.out.printf(" Prvo slovo stringa je: %s ", s.charAt(0));
		

	}

}

