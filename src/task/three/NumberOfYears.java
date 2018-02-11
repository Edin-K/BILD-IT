package task.three;
//Zadaca_3_30_10_2017


import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  (Naæi broj godina) Napisati program koji pita korisnika da unese broj
 *   minuta (npr. 1 milijardu) te ispiše korisniku koliko je to u godinama
 *   i danima. Zbog jednostavnosti, pretpostavimo da godina ima 365 dana.
 *
 */

public class NumberOfYears {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite broj minuta:");

		int minute = input.nextInt();
		input.close();

		int godine = minute / 525600;
		int dani = minute % 525600 / 1440;

		System.out.printf(" %d minuta je %d godine i %d dana.", minute, godine, dani);
	}

}

