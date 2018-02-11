package task.twenty;
// Zadaca_20_28_11_2017

import java.math.BigInteger;

public class FibonacciNumberSecondSolution {

	public static void main(String[] args) {

		final int NUMBER_PER_LINE = 10;
		int count = 0;

		BigInteger[] array = new BigInteger[100];

		BigInteger[] fibonacci = fibonacciNumbers(array);

		for (BigInteger f : fibonacci) {
			System.out.printf(" %22d ", f);
			count++;
			if (count % NUMBER_PER_LINE == 0) {
				System.out.printf("\n");
			}
		}
	}

	public static BigInteger[] fibonacciNumbers(BigInteger[] array) {

		BigInteger[] fibonacci = new BigInteger[array.length];

		fibonacci[0] = BigInteger.ZERO;
		fibonacci[1] = BigInteger.ONE;

		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
		}

		return fibonacci;
	}

}

