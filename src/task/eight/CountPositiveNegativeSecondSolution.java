package task.eight;
//Zadaca_8_13_11_2017

import java.util.Scanner;

/*
 *  @uthor Edin Korkic
 * 
 *  Napisati program koji uèitava neodreðen broj cijelih brojeva odreðuje koliko je
 *  pozitivnih brojeva korisnik unio, koliko negativnih te izraèunava ukupnu sumu i 
 *  prosjek svih unesenih brojeva. (Korisnik prekida unos tako što unese nulu). 
 *  Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program treba da ispiše da je broj 
 *  pozitivnih brojeva 3, negativnih brojeva 1, suma ili zbir su 5.0 a prosjek svih brojeva je 1.25. 
 */

public class CountPositiveNegativeSecondSolution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite niz brojeva(0 prekida unos): ");

		int countPos = 0;

		int countNeg = 0;

		double sum = 0;

		for (int numbers; (numbers = input.nextInt()) != 0;) {

			sum += numbers;

			if (numbers > 0) {
				countPos++;

			} else {
				countNeg++;
			}
		}

		input.close();

		double avg = sum / (countPos + countNeg);

		System.out.printf(" Uneseno je pozitivnih brojeva: %d\n", countPos);
		System.out.printf(" Uneseno je negativnih brojeva: %d\n", countNeg);
		System.out.printf(" Suma unesenih brojeva: %.1f\n", sum);
		System.out.printf(" Prosjek unesenih brojeva: %.2f\n", avg);
		// BONUS:Broj unijetih brojeva
		System.out.printf(" Ukupno uneseno brojeva: %d", (countPos + countNeg));

	}

}
