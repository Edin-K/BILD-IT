package task.twentythree;
// Zadaca_23_01_12_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati metodu koja prima kao argument 2D niz te vraca lokaciju najveceg elementa u nizu kao 1D niz. 
 *  Metoda treba da koristi sljedeci header: public static int[] najveciElement(double[][] niz). 
 *  Return tip nase metode je 1D niz koji sadrži dva elementa. Ova dva elementa predstavljaju indekse reda 
 *  i kolone 2D niza na kojem se nalazi naš najveæi element. Napisati program koji pita korisnika da unese 
 *  2D niz te mu ispisuje lokaciju najveceg elementa u prosljedenom nizu. 
 *  Sample run:
 *  Unesite broj redova i kolona niza: 3 4 
 *  Unesite 3 x 4 matricu:
 *  23.5 35 2 10
 *  4.5 3 45 3.5
 *  35 44 5.5 9.6
 *  Lokacija najveceg elementa: (1, 2)
 */

public class LargestElementIndex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite broj redova i kolona niza:");

		int row = input.nextInt();
		int col = input.nextInt();

		double[][] matrix = new double[row][col];

		System.out.printf("  Unesite %d x %d matricu: \n ", row, col);

		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				matrix[r][c] = input.nextDouble();
			}

		}

		input.close();

		int[] index = largestElement(matrix);

		System.out.printf("  Lokacija najveceg elementa: (%d,%d)", index[0], index[1]);
	}

	public static int[] largestElement(double[][] matrix) {

		int[] index = new int[2];

		index[0] = 0;
		index[1] = 0;

		double max = 0;

		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				if (matrix[r][c] > max) {
					index[0] = r;
					index[1] = c;
					max = matrix[r][c];
				}
			}
		}
		
		return index;
	}
}

