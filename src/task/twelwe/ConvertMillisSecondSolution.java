package task.twelwe;
// Zadaca_12_17_11_2017

import java.util.Scanner;

/*
 *  @uthor Edin Korkic
 * 
 *   Napisati metodu koja pretavara milisekunde u sate, minute i sekunde. 
 *   Metoda treba da koristi sljedeæi header: public static String pretvoriMilisekunde(long millis). 
 *   Metoda treba da vraæa vrijeme kao string u formatu sati:minute:sekunde.  
 *   Na primjer pretvoriMilisekunde(100000) treba da vrati 0:1:40.
 */

public class ConvertMillisSecondSolution {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite milisekunde: ");

		long millis = input.nextLong();

		input.close();

		System.out.printf(convertMillis(millis));

	}

	public static String convertMillis(long millis) {

		long seconds = (millis / 1000) % 60;
		long minutes = ((millis / 1000) / 60) % 60;
		long hours = ((millis / 1000) / 60) / 60;

		String total = hours + ":" + minutes + ":" + seconds;

		return total;


	}

}
