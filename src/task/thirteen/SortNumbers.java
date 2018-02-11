package task.thirteen;
//Zadaca_13_18_11_2017

import java.util.Scanner;

/*
 *  @uthor Edin Korkic
 *  
 *  Napisati metodu sa sljede�im headerom koja ispisuje tri broja u rastu�em redosljedu: 
 *  public static void ispisiSortiraneBrojeve(double num1, double num2, double num3). 
 *  Napisati program koji pita korisnika da unese tri broja te ispi�e ta tri broja u rastu�em redosljedu. 
 */

public class SortNumbers {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesite tri broja: ");
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();

		input.close();

		printSortedNumbers(num1, num2, num3);
		
	}

	public static void printSortedNumbers(double num1, double num2, double num3) {

		if (num1 > num2) {
			double temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num2 > num3) {
			double temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if (num1 > num2) {
			double temp = num1;
			num1 = num2;
			num2 = temp;
		}
System.out.format(" Sortirani brojevi: %.2f %.2f %.2f ", num1, num2, num3);
	}

}
