package task.thirteen;
//Zadaca_13_18_11_2017

/*
 *  @uthor Edin Korkic
 * 
 *  Palindrome prime je prosti broj koji je takoðer i palindrom. Na primjer, 131 je 
 *  palindrome prime, kao i brojevi 313 i 757. Napisati program koji ispisuje prvih 
 *  100 palindrome prime brojeva, 10 brojeva po liniji. Koristiti metode za rješenja zadatka.
 */

public class PalindromicPrime {

	public static void main(String[] args) {
		
		final int NUMBER_OF_PALIDROMIC = 100;
		final int NUMBER_PER_LINE = 10;

		int i = 2;
		int count = 0;

		while (count < NUMBER_OF_PALIDROMIC) {
			if (isPrime(i) && isPalindromicPrime(i)) {
				System.out.printf(" %6d ",i);
				count++;
				if (count % NUMBER_PER_LINE == 0) {
					System.out.printf("\n");
				}

			}
			i++;
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

	public static int reverse(int n) {

		String reverse = "";
		String s = n + "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);
		}
		return Integer.parseInt(reverse);

	}

	public static boolean isPalindromicPrime(int n) {

		return n == reverse(n);

	}

}
