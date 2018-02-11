package task.nine;
//Zadaca_9_14_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 * Napisati program koji izracunava procenat pojavljivanja velikih i malih 
 * slova u nekom stringu koji unese korisnik. 
 */

public class PercentageUpperLower {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesite string: ");
		String s = input.nextLine();
		
		input.close();
		
		int countUpper = 0;
		int countLower = 0;
		
		
		for(int i = 0; i < s.length(); i++){
			if(Character.isUpperCase(s.charAt(i))){
				countUpper++;
			}if(Character.isLowerCase(s.charAt(i))){
				countLower++;
			}
		}
		int count = countUpper + countLower;
		
		double percentageUpper = (double)countUpper / count * 100;
		double percentageLower = (double)countLower / count * 100;
				
		System.out.printf(" Unijeti string ima procenat velikih slova %.1f%%\n",percentageUpper);
		System.out.printf(" Unijeti string ima procenat malih slova %.1f%%  ",percentageLower);
		
	}

}

