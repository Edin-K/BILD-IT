package task.nine;
//Zadaca_9_14_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 * Neke web stranice forsiraju odreðena pravila za passworde. Napisati program koji
 * provjerava da li je unijeti string validan Password.  
 * Pravila da bi Password bio validan su sljededa:
 * 1. Password mora biti saèinjen od najmanje 8 karaktera. 
 * 2. Password smije da se sastoji samo od slova i brojeva.  
 * 3. Password mora sadržati najmanje 2 broja.  
 * Program pita korisnika da unese Password te mu ispisuje "Password je validan" ukoliko
 * su sva pravila ispoštovana ili "Password nije validan" ukoliko pravila nisu ispoštovana.
 */


public class Password {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite vas pasword: ");

		String password = input.next();

		input.close();

		int countDigit = 0;

		boolean isValid = true;

		if (password.length() < 8) {
			isValid = false;
		}

		for (int i = 0; i < password.length(); i++) {
			if (!Character.isLetterOrDigit(password.charAt(i))) {
				isValid = false;
				if (Character.isDigit(password.charAt(i))) {
					countDigit++;

				}
			}

		}

		if (isValid && countDigit >= 2) {
			System.out.printf(" Vas Password je validan.");
		} else {
			System.out.printf(" Vas Password nije validan.");
		}
	}

}
