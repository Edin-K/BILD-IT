package zadaca11;
//Zadaca_11_16_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati metodu sa sljedeæim headerom koja ispisuje tri broja u rastuæem redosljedu: 
 *  public static void ispisiSortiraneBrojeve(double broj1, double broj2, double broj3). 
 *  Napisati program koji pita korisnika da unese tri broja te ispiše ta tri broja u rastuæem redosljedu. 
 */

public class DisplaySortedNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite tri broja: ");

		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();

		input.close();

		ispisiSortiraneBrojeve(num1, num2, num3);

	}

	public static void ispisiSortiraneBrojeve(double broj1, double broj2, double broj3) {

		if (broj1 > broj2) {
			double temp = broj1;
			broj1 = broj2;
			broj2 = temp;
			
		}
		if (broj2 > broj3) {
			double temp = broj2;
			broj2 = broj3;
			broj3 = temp;
		}
		if (broj1 > broj2) {
			double temp = broj1;
			broj1 = broj2;
			broj2 = temp;
		}
		
		System.out.printf(" Brojevi sortirani: %.2f %.2f %.2f ", broj1, broj2, broj3);
		

	}

}
