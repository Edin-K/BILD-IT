package task.three;
//Zadaca_3_30_10_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 *
 *  Pretpostavimo da uplatimo $100 svaki mjesec na štedni raèun koji ima
 *  godišnju interesnu stopu od 5%. Mjeseèna interesna stopa je stoga
 *  0.05 / 12 = 0.00417. Nakon prvog mjeseca vrijednost na raèunu postaje
 *  100 * (1 + 0.00417) = 100.417. Nakon drugog mjeseca, vrijednost na
 *  raèunu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. Nakon
 *  treæeg mjeseca, vrijednost na raèunu postaje (100 + 201.252) * (1 +
 *  0.00417) = 302.507 i tako dalje. Napisati program koji pita korisnika
 *  da unese mjeseèni iznos štednje te broj mjeseci nakon kojeg bi želio
 *  znati stanje raèuna.
 */

public class SavingAmount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite iznos koji zelite uplatiti:");
		double iznos = input.nextDouble();

		System.out.print(" Unesite broj mjeseci nakon kojeg zelite znati stanje racuna:");
		double mjeseci = input.nextDouble();

		input.close();

		double stednja = 0;
		// Zelimo znati stednju za 6 mjeseci
		stednja = (iznos + stednja) * (1 + 0.00417);
		stednja = (iznos + stednja) * (1 + 0.00417);
		stednja = (iznos + stednja) * (1 + 0.00417);
		stednja = (iznos + stednja) * (1 + 0.00417);
		stednja = (iznos + stednja) * (1 + 0.00417);
		stednja = (iznos + stednja) * (1 + 0.00417);

		System.out.printf(" Nakon %.0f mjeseci vasa stednja iznosi: %.3f ", mjeseci, stednja);
	}

}
