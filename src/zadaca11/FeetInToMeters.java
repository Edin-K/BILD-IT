package zadaca11;
//Zadaca_11_16_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 *
 *  Napisati metodu koja pretvara stope u metre. Metoda treba da ima sledeæi header: 
 *  public static double stopeUMetre(double stope). 1 stopa = 0,305 m.
 */

public class FeetInToMeters {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesite broj stopa: ");
		
		double stope = input.nextDouble();
		
		input.close();
		
		System.out.printf(" %.1f stopa je %.3f metara. ", stope, stopeUMetre(stope));
		

	}
	public static double stopeUMetre(double stope){
		
		double metri = stope * 0.305;
		
		return metri;

	}

}
