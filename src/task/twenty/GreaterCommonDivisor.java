package task.twenty;
// Zadaca_20_28_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati metodu koja kao arugment prima niz cijelih brojeva neodreðene dužine te vraæa najveæi 
 *  zajednièki djelilac za unesenei niz.  Koristiti sljedeæi header: public static int nzd(int...brojevi). 
 *  Napisati test program koji pita korisnika da unese 5 brojeva, poziva metodu te ispisuje nzd.
 */

public class GreaterCommonDivisor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[5];

		System.out.print(" Unesite niz od 5 brojeva: ");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		input.close();

		System.out.printf(" Najveci zajednicki djelilac za ovaj niz je: %d ", gcd(numbers));

	}

	public static int gcd(int... numbers) {

		int min = min(numbers);

		for (int i = min; i >= 1; i--) {

			int j;

			for (j = 0; j < numbers.length; ++j) {
				if (numbers[j] % i != 0)
					break;
			}
			if (j == numbers.length) {
				return i;
			}
		}

		return 1;
	}

	public static int min(int... numbers) {

		int min = numbers[0];

		for (int n : numbers) {
			if (n < min) {
				min = n;
			}
		}

		return min;

	}
}

