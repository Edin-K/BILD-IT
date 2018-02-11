package task.five;
// Zadaca_5_1_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Body Mass Index (BMI) je mjera zdravlja na osnovu težine.
 *  (diskreditirana ali dobra za potrebe zadatka) BMI možemo izraèunati
 *  tako što uzmemo težinu u kilogramima i podijelimo istu sa kvadratom
 *  visine u metrima. Napisati program koji pita korisnika da unese svoju
 *  tezinu u kilogramima i visinu u metrima te ispise korisniku njegov
 *  BMI. (Kategorije možete pogledati ovdje)
 * 
 *  Sample run programa:
 * 
 *  Unesite svoju tezinu u kg (npr. 63): 75 
 *  Unesite svoju visinu u metrima (npr 1.63): 1.82 
 *  Vas BMI iznosi: 22.6421929718633
 * 
 */


public class BMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite vašu težinu u kilogramima:");
		double tezina = input.nextDouble();

		System.out.print(" Unesite vašu visinu u metrima:");
		double visina = input.nextDouble();

		input.close();

		double bmi = tezina / Math.pow(visina, 2);
		System.out.printf(" Vaš BMI iznosi %.13f ", bmi);

		if (bmi < 15) {
			System.out.printf(" Vi ste vrlo ozbiljno pothranjeni!");
		} else if (bmi >= 15 && bmi < 16) {
			System.out.printf(" Vi ste ozbiljno pothranjeni!");
		} else if (bmi >= 16 && bmi < 18.5) {
			System.out.printf(" Vi ste pothranjeni!");
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.printf(" Vi ste normalne(zdrave tezine)!");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.printf(" Vi ste preteski!");
		} else if (bmi >= 30 && bmi < 35) {
			System.out.printf(" Vi ste umjerene gojaznosti!");
		} else if (bmi >= 35 && bmi < 40) {
			System.out.printf(" Vi ste ozbiljne gojaznosti!");
		} else {
			System.out.printf(" Vi ste vrlo ozbiljne gojaznosti!");

		}

	}
}

