package task.twelwe;
// Zadaca_12_17_11_2017

/*
 *  @uthor Edin Korkic
 * 
 *  Napisati metodu koja printa 100 nasumiènih uppercase karaktera i 100 nasumiènih brojeva, 10 po liniji.
 */

public class PrintRandomCharactersFirstSolution {

	public static void main(String[] args) {
		
		printUpperCaseAndNumber();

	}

	public static void printUpperCaseAndNumber() {

		int count = 0;

		for (int i = 1; i <= 100; i++) {
			char ch = (char) (Math.random() * 26 + 65);
			System.out.printf(" %c ", ch);
			count++;
			if (count % 10 == 0) {
				System.out.printf("\n");
			}
		}
		System.out.printf("\n");
		for (int i = 1; i <= 100; i++) {
			int n = (int) (Math.random() * 10);
			System.out.printf(" %d ", n);
			count++;
			if (count % 10 == 0) {
				System.out.printf("\n");
			}
		}


	}

}
