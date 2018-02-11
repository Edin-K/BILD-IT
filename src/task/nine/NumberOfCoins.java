package task.nine;
// Zadaca_9_14_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 * Dati su vam novcici u vrijednosti od 1, 3 i 5 maraka, korisnik unosi konacni 
 * iznos koji trebate isplatiti, trebate napisati program koji izracunava i 
 * ispisuje najmanji broj novcica koji vam je potreban da isplatite dati iznos. 
 * Sample run:
 * Unesite iznos: 21 
 * Broj potrebnih novcica: 5 
 */


public class NumberOfCoins {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite iznos: ");

		int coin = input.nextInt();
		
		input.close();

		int count = 0;
		
		while (coin != 0) {
			if (coin - 5 >= 0) {
				coin -= 5;
				count++;
			} else if (coin - 3 >= 0) {
				coin -= 3;
				count++;
			} else if (coin - 1 >= 0) {
				coin -= 1;
				count++;
			}
		}

		System.out.printf(" Broj potrebnih novcica: %d ", count);

	}

}

