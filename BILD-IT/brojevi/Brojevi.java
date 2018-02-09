package brojevi;

import java.util.Scanner;

public class Brojevi {

	public static void main(String[] args) {

		methodToUse();
	}

	public static void primeNumbers() {

	}

	public static void first100emirps() {

	}

	public static void fibonacci() {

	}

	public static void marsennePrimes() {

	}

	public static void armstorngNumbers() {

		for (int i = 0; i <= 1000; i++) {

			int sum = 0;
			int n = i;

			while (n != 0) {
				int digit = n % 10;
				sum += Math.pow(digit, 3);
				n /= 10;

			}
			if (sum == i) {
				System.out.printf(" %d je Amstrongov broj..!\n", i);
			}
		}
	}

	public static void methodToUse() {
		Scanner input = new Scanner(System.in);
		
		System.out.printf(" Unesite oznake za metode od a-e: ");
		String meth = input.nextLine();
		
		
		switch(meth){
		
		case "a":
			primeNumbers();
			break;
		case "b":
			first100emirps();
			break;
		case "c":
			fibonacci() ;
			break;
		case "d":
			marsennePrimes();
			break;
		case "e":
			armstorngNumbers();
			break;
		default:
			System.out.printf(" Pogresan unos,pokusajte ponovo!");
		
		}

	}

}
