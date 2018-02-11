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

public class ConvertMillisFirstSolution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite milisekunde: ");

		long millis = input.nextLong();

		input.close();

		System.out.printf(convertMillis(millis));

	}

	public static String convertMillis(long millis) {

		long totalSeconds = millis / 1000;

		long currentSecond = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;

		long currentMinute = totalMinutes % 60;

		long totalHours = totalMinutes / 60;

		long currentHour = totalHours % 24;
		
		String total = currentHour + ":" + currentMinute + ":" + currentSecond;
		

		return  total; 

	}
}




