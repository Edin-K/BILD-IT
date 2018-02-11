package task.twenty;
// Zadaca_20_28_11_2017

/*
 * @author Edin Korkic
 * 
 *  Napisati metodu koja vraca, kao niz, prvih 100 Fibonnaci brojeva. 
 */

public class FibonacciNumberFirstSolution {

	public static void main(String[] args) {
		final int NUMBER_PER_LINE = 10;
		int count = 0;
		
		int[] array = new int[100];
		
		long[] fibonacci = fibonacciNumber(array);
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.printf(" %20d ", fibonacci[i]);
			count++;
			if (count % NUMBER_PER_LINE == 0) {
				System.out.printf("\n");
		}
		}
	}

	public static long[] fibonacciNumber(int[] array) {


		long[] count = new long[array.length];
		long[] fibonacci = new long[count.length];

		count[0] = 0;
		count[1] = 1;

		for (int i = 2; i < count.length; i++) {
			count[i] = count[i - 1] + count[i - 2];
		}

		for (int i = 0; i < count.length; i++) {
			fibonacci[i] =  count[i];
			

			}

		
		return fibonacci;
	}
}
