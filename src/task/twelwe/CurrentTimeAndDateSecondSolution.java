package task.twelwe;
// Zadaca_12_17_11_2017

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *  @uthor Edin Korkic
 * 
 *  Napisati metodu koja vraæa datum i trenutaèno vrijeme.
 */

public class CurrentTimeAndDateSecondSolution {

	public static void main(String[] args) {

		currentTimeAndDate();
	}

	public static void currentTimeAndDate() {

		Date date = new Date();
		
		SimpleDateFormat formatDate = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy:");
		
		System.out.printf(formatDate.format(date));
		
	}
}
