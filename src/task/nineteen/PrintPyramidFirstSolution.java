package task.nineteen;
// Zadaca_19_27_11_2017

/*
 * @author Edin Korkic
 * 
 * Napisati program koji ispisuje sljedeæu piramidu:
 *                                                    1 
 *                                               1    2    1 
 *                                          1    2    3    2    1 
 *                                     1    2    3    4    3    2    1 
 *                                1    2    3    4    5    4    3    2    1 
 *                           1    2    3    4    5    6    5    4    3    2    1 
 *                      1    2    3    4    5    6    7    6    5    4    3    2    1 
 *                 1    2    3    4    5    6    7    8    7    6    5    4    3    2    1 
 *            1    2    3    4    5    6    7    8    9    8    7    6    5    4    3    2    1 
 *       1    2    3    4    5    6    7    8    9   10    9    8    7    6    5    4    3    2    1 
 *  1    2    3    4    5    6    7    8    9   10   11   10    9    8    7    6    5    4    3    2    1 
 * 
 * BONUS: Napisati metodu koja prima dva argumenta - poèetni broj i krajnji broj te ispisuje piramidu u tom rasponu. 
 */

public class PrintPyramidFirstSolution {

public static void main(String[] args) {
		
		printPyramid();

	}

	public static void printPyramid() {

		int n = 11 + 1;
		
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= (n - i); j++) {
				System.out.print("     ");
			}
			for (int k = 1; k < i; k++) {
				System.out.printf(" %3d ", k);
			}
			for (int l = i - 2; l >= 1; l--) {
				System.out.printf(" %3d ", l);

			}
			System.out.printf("\n");
		}
	}
}

