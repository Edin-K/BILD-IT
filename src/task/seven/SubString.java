package task.seven;
//Zadaca_7_4_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese dva stringa te
 *  provjerava i ispisuje da li je drugi string substring prvog stringa.
 *  Na primjer, ukoliko korisnik unese ABCD kao prvi string a BC kao
 *  drugi string program mu ispisuje da je BC substring ABCD stringa.
 */

public class SubString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesite prvi string:");
		String s1 = input.nextLine();
		
		System.out.print(" Unesite drugi string:");
		String s2 = input.nextLine();
		
		input.close();
		
		if(s1.contains(s2)){
			System.out.printf(" %s je substring %s stringa! ", s2, s1);
		}else{
		System.out.printf(" %s nije substring %s stringa! ", s2, s1);
		}
		

	}

}

