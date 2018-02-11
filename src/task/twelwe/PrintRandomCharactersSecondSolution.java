package task.twelwe;
// Zadaca_12_17_11_2017

/*
 *  @uthor Edin Korkic
 * 
 *  Napisati metodu koja printa 100 nasumiènih uppercase karaktera i 100 nasumiènih brojeva, 10 po liniji.
 */

public class PrintRandomCharactersSecondSolution {

	public static void main(String[] args) {

		printUpperCaseAndNumber();

	}

	public static void printUpperCaseAndNumber() {

		final int NUMBERS_OF_CHARACTERS = 100;
		final int CHARACTERS_PER_LINE = 10;

		for (int i = 0; i < NUMBERS_OF_CHARACTERS; i++) {
			char ch = (char) (65 + Math.random() * 26);
			if ((i + 1) % CHARACTERS_PER_LINE == 0) {
				System.out.println(ch);
			} else {
				System.out.print(ch + " ");
			}
		}
		System.out.println();
		for (int i = 0; i < NUMBERS_OF_CHARACTERS; i++) {
			int n = (int) (Math.random() * 10);
			if ((i + 1) % CHARACTERS_PER_LINE == 0) {
				System.out.println(n);
			} else {
				System.out.print(n + " ");
			}
		}
	}
}
