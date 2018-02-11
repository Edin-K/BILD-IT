package task.bonus;
//Zadaca_BONUS_02_12_2017

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji nasumicno generise 6 x 6 matricu ispunjenu sa 0-ma i 1-cama, ispisuje 
 *  istu matricu na konzoli te provjera da li svaki red i svaka kolona imaju paran broj 1-ca. 
 */


public class OneEvenRowAndColumn {

	public static void main(String[] args) {

		int[][] matrix = new int[6][6];

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = (int) (Math.random() * 2);
				System.out.printf(" %d ", matrix[row][col]);
			}
			System.out.printf("\n");
		}

		System.out.printf("\n");

		int row = rowOneEven(matrix);
		int col = columnOneEven(matrix);

		if (col != -1 && row != -1) {
			System.out.printf(" Red i kolana u kojem je paran broj 1-ca [%d %d]", row, col);
		} else {
			System.out.printf(" Nema reda i kolene sto imaju paran broj 1-ca.");
		}

	}

	public static int rowOneEven(int[][] matrix) {

		int sum = 0;

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				sum += matrix[row][col];
				if (sum % 2 == 0) {
					return row;
				}
			}
		}
		return -1;

	}

	public static int columnOneEven(int[][] matrix) {

		int sum = 0;

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				sum += matrix[col][row];
				if (sum % 2 == 0) {
					return col;

			}
			}
		}

		return -1;

	}

}

