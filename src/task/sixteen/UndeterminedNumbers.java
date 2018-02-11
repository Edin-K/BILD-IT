package task.sixteen;
// Zadaca_16_24_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji uèitava neodreðen broj nekih brojèanih rezultata te 
 *  ispisuje koliko unesenih rezultata je bilo iznad ili jednako izraèunatom 
 *  prosjeku svih unesenih rezultata te koliko unesenih rezultata je bilo 
 *  ispod izraèunatog prosjeka.Negativan broj prekida unos rezultata. 
 *  Pretpostavimo da je maksimalan broj  rezultata koje možemo unijeti 100. 
 */


public class UndeterminedNumbers {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int aboveAverage = 0;
		int underAverage = 0;
		int count = -1;
		double sum = 0;

		int[] array = new int[100];

		System.out.print(" Unesite niz do 100 brojeva(negativan broj prekida unos): ");
		for (int i = 0; i < array.length; i++) {
			int num = input.nextInt();
			array[i] = num;
			count++;
			if (num < 0) {
				break;
			}
		}

		for (int i = 0; i < array.length; i++) {
				if(array[i] > 0){
				sum += array[i];
			}
				}
		
		double average = sum / count;
		
		for(int n : array){
			if(n < 0){
				break;
			}
			if(n >= average){
				aboveAverage++;
			}
			if(n < average){
				underAverage++;
			}
		}
		
		System.out.printf(" Duzina niza koji ste unijeli je %d \n", (aboveAverage + underAverage));
		System.out.printf(" Suma niza koji ste unijeli je %.2f \n", sum);
		System.out.printf(" Prosjek niza koji ste unijeli je %.2f \n", average);
		System.out.printf(" Rezultata jednako ili iznad prosjeka %d \n", aboveAverage);
		System.out.printf(" Rezultata ispod prosjeka %d ", underAverage);
		
	}

}
