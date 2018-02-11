package task.ten;
// Zadaca_10_15_11_2017

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji ispisuje sve Armstrongove brojeve izmedju 0 i 1000. 
 *  Armstrongov broj je broj ciji je zbir kubova svih cifri jednak samom broju. 
 *  Npr. 371 je Armstrongov broj jer je 33 + 73 + 13 = 371.
 */

public class ArmstrongNumber {

	public static void main(String[] args) {
		
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

}
