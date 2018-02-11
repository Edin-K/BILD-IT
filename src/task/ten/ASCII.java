package task.ten;
//Zadaca_10_15_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese ASCII kod (cijeli broj od 0 do 127) 
 *  i ispisuje karakter koji odgovara tom kodu.  
 *  Sample run programa:
 *  Unesite ASCII code: 69
 *  Karakter za ASCII code 69 je: E
 */

public class ASCII {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite ASCII code: ");

		int number = input.nextInt();

		input.close();

		char ch = (char) number;

		if (ch <= 127) {

			System.out.printf(" Karakter za ASCII code %d je: %c ", number, ch);

		} else {

			System.out.printf(" Pograsan unos,pokusajte sa manjim brojem..!");

		}

	}

}
