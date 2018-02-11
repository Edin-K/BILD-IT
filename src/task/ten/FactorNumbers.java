package task.ten;
//Zadaca_10_15_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese cijeli broj, a zatim 
 *  ispisuje sve faktore tog broja. Ako broj m podijelimo brojem n pri 
 *  cemu je ostatak dijeljenja 0, onda je broj n faktor broja m.
 *  Sample run programa: 
 *  Unesi cijeli broj: 12
 *  Faktori broja 12 su: 1 2 3 4 6 12
 *  
 */

public class FactorNumbers {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesi cijeli broj: ");
		
		int m = input.nextInt();
		
		input.close();
		
		System.out.printf(" Faktori broja %d su: ",m);
		
		for(int n = 1; n <= m; n++){
			if(m % n == 0){
				System.out.printf(" %d ",n);
			}
		}


	}

}
