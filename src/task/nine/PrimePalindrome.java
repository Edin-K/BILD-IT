package task.nine;
//Zadaca_9_14_11_2017

/*
 * @author Edin Korkic
 * 
 * Napisati program koji pronalazi i ispisuje najveci prosti palindrom manji od 1000. 
 */

public class PrimePalindrome {

	public static void main(String[] args) {

		for (int i = 1000; i >= 0; i--) {

			boolean isPrime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;

				}

			}

			int n = i;
			if (isPrime) {
				int reverse = 0;

				while (n != 0) {

					reverse += n % 10;
					reverse *= 10;
					n /= 10;

				}

				reverse /= 10;

				if (reverse == i) {
					System.out.printf(" %d ",i);
					break;

				}
			}
		}

	}
}

