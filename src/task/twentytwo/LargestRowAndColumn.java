package task.twentytwo;
// Zadaca_22_30_11_2017

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji nasumièno ispunjava 4 x 4 matricu sa 0-ma i 1-cama, ispisuje 
 *  korisniku tu matricu na konzoli te pronalazi prvi red i kolonu sa najviše 1-ca. 
 *  Sample run:
 *  0 0 1 1
 *  0 0 1 1 
 *  1 1 0 1 
 *  1 0 1 0
 *  
 *  Red sa najviše jedinica: 2
 *  Kolona sa najviše jedinica: 2
 */

public class LargestRowAndColumn {

	public static void main(String[] args) {

		int[][] matrix = new int[4][4];

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = (int) (Math.random() * 2);
			}

		}

		System.out.printf(" RandomNumberSecondSolution matrix: \n");

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.printf("%3d", matrix[row][col]);
			}
			System.out.printf("\n");

		}

		System.out.printf("\n");
		System.out.printf(" Red sa najviše jedinica: %d\n", largestRow(matrix));
		System.out.printf(" Kolona sa najviše jedinica: %d", largestColumn(matrix));
	}

	public static int largestRow(int[][] matrix) {
		
		int row = 0;
		int sumMax = 0;
		
		for (int j = 0; j < matrix[0].length; j++) {
			sumMax += matrix[0][j];
		}

		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix[0].length; j++) {
				sum += matrix[i][j];
				if(sumMax < sum){
					sumMax = sum;
					row = i;
				}
			}
		}
		return row;

	}

	public static int largestColumn(int[][] matrix) {

		int col = 0;
		int sumMax = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			sumMax += matrix[i][0];
		}
		
		for (int j = 0; j < matrix[0].length; j++) {
			int sum = 0;
			for (int i = 0; i < matrix.length; i++) {
				sum += matrix[i][j];
				if(sumMax < sum){
					sumMax = sum;
					col = j;
				}
			}
		}
		return col;
		

	}
}

