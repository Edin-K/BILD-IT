package task.seventeen;
// Zadaca_17_25_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati dvije preoptere�ene (overloaded) metode koje vra�aju prosjek svih brojeva u nekom nizu. 
 *  Metode trebaju imati sljede�e headere:
 *  public static int prosjekNiza(int[] niz)
 *  public static double prosjekNiza(double[] niz)
 *  Napisati program koji testira ove dvije metode. Du�ina niza neka bude 10. 
 *  Tako�er, mo�ete pustiti korisnika da odredi du�inu niza. 
 */

public class AverageOfArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite duzinu niza: ");

		int length = input.nextInt();

		System.out.printf(" Unesite niz od %d brojeva: ", length);

		double[] array = new double[length];

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}

		input.close();
		
		System.out.printf(" Prosjek niza je %.2f " ,average(array));
		

	}

	public static int average(int[] array) {
		
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum /array.length;

	}

	public static double average(double[] array) {
		
		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}
}

