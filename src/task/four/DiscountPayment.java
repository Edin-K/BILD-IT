package task.four;
//Zadaca_4_31_10_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji raèuna iznos popusta na gotovinsko plaæanje
 *  robe i cijenu robe sa popustom. Korisnik treba da unese vrijednost
 *  robe u KM i popust u procentima.
 * 
 *  Sample run programa:
 * 
 *  Unesite vrijednost robe u KM: 175.50 
 *  Unesite popust na gotovinsko placanje u procentima: 12 
 *  Vrijednost popusta je: 21.06 KM 
 *  Vrijednost robe sa popustom je: 154.44 KM
 * 
 */

public class DiscountPayment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite vrijednost robe u KM:");
		double cijena = input.nextDouble();
		
		System.out.print(" Unesite popust na gotovinsko placanje u procentima:");
		double popust = input.nextDouble();
		
		input.close();
		
		double vrijednostPopusta = cijena * (popust / 100);
		double vrijednostRobe = cijena - vrijednostPopusta;
		
		System.out.printf(" Vrijednost popusta je: %.2f KM \n", vrijednostPopusta);
		System.out.printf(" Vrijednost robe sa popustom je: %.2f KM ", vrijednostRobe);
		

	}

}

