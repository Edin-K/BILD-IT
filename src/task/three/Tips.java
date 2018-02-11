package task.three;

import java.util.Scanner;

/**
 * @author Edin Korkic
 * 
 *         (Izraèunavanje napojnice) Napisati program koji uèitava ukupan iznos
 *         raèuna koji treba uplatiti kao i procenat tog raèuna kojeg želimo
 *         platiti kao napojnicu te izraèunava ukupan raèun i napojnicu. Na
 *         primjer, ukoliko korisnik unese 10 kao raèun i 15 % kao procenat za
 *         napojnicu program treba da ispiše da je ukupan raèun za uplatiti 11.5
 *         a napojnica 1.5.
 *
 */

public class Tips {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite iznos racuna:");
		double racun = input.nextDouble();

		System.out.print(" Unesite napojnicu u procentima:");
		double procenat = input.nextDouble();

		input.close();

		double napojnica = racun * (procenat / 100);
		double cijena = racun + napojnica;

		System.out.printf(" Ukupan iznos racuna je: %.1f, ", cijena);
		System.out.printf("a iznos napojnice je: %.1f ", napojnica);

	}

}

