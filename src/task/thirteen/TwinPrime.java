package task.thirteen;
//Zadaca_13_18_11_2017

/*
 *  @uthor Edin Korkic
 * 
 *  Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. 
 *  Na primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 
 *  su takoðer twin primes. Napisati program koji ispisuje sve twin prime 
 *  brojeve manje od 10000, 10 parova po liniji. Koristiti metode za rješenja zadatka. 
 */

public class TwinPrime {
	
public static void main(String[] args) {
		
		final int NUMBER_PER_LINE = 10;

		int count = 0;

		for (int i = 2; i < 10000; i++) {
			if (isPrime(i) && isPrime(i + 2)) {
				System.out.printf(" %6d%6d ",i,i+2);
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
