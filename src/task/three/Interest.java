package task.three;
//Zadaca_3_30_10_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji u�itava iznos investicije, godi�nju interesnu
 *  stopu i broj godina te vra�a budu�u vrijednost investicije koriste�i
 *  se sljede�om formulom: buducaVrijednostInvesticije = iznosInvesticije
 *  * (1 + mjesecnaInteresnaStopa)^brojGodina*12. Na primjer, ukoliko
 *  uneste kao iznos investicije 1000, 3.25 kao godi�nju interesnu stopu
 *  i 1 kao broj godina program vam vra�a 1032.98 kao buducu vrijednost
 *  investicije.
 *
 */

public class Interest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite iznos ivesticije:");
		double iznosInvesticije = input.nextDouble();

		System.out.print(" Unesite godisnju interesnu stopu:");
		double interesnaStopa = input.nextDouble();

		System.out.print(" Unesite broj godina:");
		double brojGodina = input.nextDouble();

		interesnaStopa /= 1200;
		input.close();

		double vrijednostInvesticije = iznosInvesticije * Math.pow(1 + interesnaStopa, brojGodina * 12);

		System.out.printf(" Buduca vrijednost investicije je: %.2f ", vrijednostInvesticije);
	}

}
