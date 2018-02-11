package task.bonus;
//Zadaca_BONUS_02_12_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Collatz conjecture / Hailstone sekvenca moze biti generisana tako sto krenemo od pozitivnog cijelog 
 *  broja n te sljedimo sljedeca pravila: 
 *  1.	Ukoliko je n = 1, sekvenca zavrsava.
 *  2.	Ukoliko je n paran broj sljedeci n u sekvenci je jednak n / 2
 *  3.	Ukoliko je n neparan broj sljedeci n u sekvenci je jednak (3 * n) + 1
 *  Collatz conjecture nalaže da ce sekvenca biti prekinuta za bilo koji poèetni broj. Napisati program koji 
 *  pita korisnika da unese neki poèetni broj te ispisuje ovu sekvencu.  
 */

public class CollatzSequance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite broj: ");

		int n = input.nextInt();

		input.close();

		collatz(n);

	}

	public static void collatz(int n) {

		System.out.printf(" %d ", n);

		if (n == 1) {
			return;
		} else if (n % 2 == 0) {
			collatz(n / 2);
		} else {
			collatz(3 * n + 1);
		}

	}
}

