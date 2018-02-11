package task.fourteen;
// Zadaca_14_19_11_2017

import java.util.Scanner;

/*
 *  @uthor Edin Korkic
 * 
 *  Napisati metodu koja ima sledeci header: public static String ukloniKarakter(String str, char ch) 
 *  Metoda prima string i karakter i vraca novi string koji predstavlja originalni string sa izuzetkom 
 *  proslijedjenog karaktera.  Napisati program koji pita korisnika da unese string i karakter, a zatim 
 *  ispisuje string iz koga je obrisan uneseni karakter. 
 *  Sample run
 *  Unesi string:  stepenice Medicinske skole 
 *  Unesi karakter:  s 
 *  Rezultat: tepenice Medicinke kole
 */

public class DeleteCharacter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite string: ");
		String s = input.nextLine();

		System.out.print(" Unesite karakter: ");
		char ch = input.next().charAt(0);

		input.close();

		System.out.printf(" Rezultat: %s ", removeCharacter(s, ch));

	}

	public static String removeCharacter(String s, char ch) {

		String remove = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ch) {
				remove += s.charAt(i);
			}
		}
		return remove;

	}
}
