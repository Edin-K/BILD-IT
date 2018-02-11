package task.thirteen;
//Zadaca_13_18_11_2017

/*
 *  @uthor Edin Korkic
 * 
 *   Napisati metodu sa sljedeæim headerom: public static boolean isPrime(int n) 
 *   koja provjerava da li je broj prost/prime. Napsati test program koji poziva 
 *   ovu metodu i ispisuje sve proste brojeve u rasponu od 0 do 100000.
 */

public class PrimeNumbers {
	
	public static void main(String[] args) {

		final int NUMBER_PER_LINE = 8;

		int count = 0;

		for (int i = 2; i < 100000; i++) {
			if (isPrime(i)) {
				System.out.printf(" %4d ",i);
				count++;
				if (count % NUMBER_PER_LINE == 0) {
					System.out.printf("\n");
				}

			}
		}

	}

	public static boolean isPrime(int n) {

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				if (n != 0 && n != 1) {

					return false;
				}
			}
		}
		return true;
	}
}



