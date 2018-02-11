package task.twelwe;
//Zadaca_12_17_11_2017

import java.util.Date;

/*
 *  @uthor Edin Korkic
 * 
 *  Napisati metodu koja vraæa datum i trenutaèno vrijeme.
 *  
 */

public class CurrentTimeAndDateFirstSolution {

	public static void main(String[] args) {

		currentTimeAndDate();
	}

	public static void currentTimeAndDate() {

		System.out.printf(" %s ", new Date());

	}
}
