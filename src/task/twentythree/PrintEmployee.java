package task.twentythree;
// Zadaca_23_01_12_2017

/*
 * @author Edin Korkic
 * 
 *  Zamislimo kompaniju u kojoj su svi radni sati uposlenika spremljeni u 2D niz / matricu. 
 *  Svaki red matrice predstavlja 7 radnih dana zaposlenika, gdje svaka kolona predstavlja 
 *  jedan radni dan. Uposlenik 0 se nalazi u prvom redu, Uposlenik 1 u drugom redu, itd.  
 *  Kao primjer, uzmimo sljedeæu 7 x 7 matricu:
 *  2 4 3 4 5 8 8 
 *  7 3 4 3 3 4 4
 *  3 3 4 3 3 2 2 
 *  9 3 4 7 3 4 1 
 *  3 5 4 3 6 3 8
 *  3 4 4 6 3 4 4
 *  3 7 4 8 3 8 4
 *  Napisati program koji prolazi kroz ovu matricu te ispisuje uposlenike i njihov ukupan broj 
 *  odraðenih sati u silaznom redosljedu. (uposlenik sa najviše sati na vrhu, sa najmanje na dnu.)
 */

public class PrintEmployee {

	public static void main(String[] args) {
		// Posto znamo sate da stalno ne unosim ovako odmah ih dodijelim matrici
		int[][] matrix = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 } };
		
		
		String[] employee = { "Employee1", "Employee2", "Employee3", "Employee4", "Employee5", "Employee6",
				"Employee7" };

		int[] hours = new int[7];

		for (int row = 0; row < matrix.length; row++) {
			hours[row] = sumHours(matrix, row);
		}
		printEmployee(employee,hours);
	}

	public static int sumHours(int[][] matrix, int rowindex) {

		int sum = 0;

		for (int row = 0; row < matrix.length; row++) {
			sum += matrix[rowindex][row];

		}
		return sum;

	}

	public static void printEmployee(String[] employee, int[] hours) {

		for (int i = 0; i < employee.length; i++) {
			for (int j = i + 1; j < employee.length; j++) {
				if (hours[i] < hours[j]) {
					sortEmployee(employee, hours, i, j);
				}
			}

		}
		System.out.printf(" Ime uposlenika \t Ukupni sati \n");
		for (int i = 0; i < employee.length; i++) {
			System.out.printf(" %s \t\t %d \n", employee[i], hours[i]);
		}
	}

	public static void sortEmployee(String[] employee, int[] hours, int i, int j) {

		String tempEmployee = employee[i];
		employee[i] = employee[j];
		employee[j] = tempEmployee;

		int tempHours = hours[i];
		hours[i] = hours[j];
		hours[j] = tempHours;

	}
}

