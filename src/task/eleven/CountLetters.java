package task.eleven;
//Zadaca_11_16_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 *
 *  Napisati metodu koja broji slova u stringu. Metoda treba koristiti sljedeæi header: 
 *  public static int prebrojiSlova(String s). Napisati program koji pita korisnika da 
 *  unese neki string te mu vrati koliko taj string ima slova. 
 */

public class CountLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite string: ");

		String s = input.nextLine();

		input.close();

		System.out.printf(" String koji ste unijeli ima %d slova.", prebrojiSlova(s));
	}

	public static int prebrojiSlova(String s) {

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				count++;
			}

		}
		return count;

	}

}
