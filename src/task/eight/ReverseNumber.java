package task.eight;
//Zadaca_8_13_11_2017

import java.util.Scanner;

/*
 *  @uthor Edin Korkic
 * 
 *   Napisati program koji pita korisnika da unese cijeli broj, a zatim ispisuje taj cijeli broj naopako.
 *   Program treba da radi za sve pozitivne cijele brojeve koji se mogu smjestiti u promjenljivu int tipa. 
 *   Sample run programa: 
 *   Unesite cijeli broj: 123456789 
 *   Obrnut broj je: 987654321 
 */

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesite cijeli broj: ");
		
		int num = input.nextInt();
		
		input.close();
		
		// Ako je u pitanju negativna vrijednost
		num = Math.abs(num);
		
		String reverse = "";
		
		String s = num + "";
		
		for(int i = s.length() - 1; i >= 0; i--){
			reverse += s.charAt(i);
			
			num = Integer.parseInt(reverse);
		}

		System.out.printf(" Obrnut broj je: %d ",num);
		
	}

}

