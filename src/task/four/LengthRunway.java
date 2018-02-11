package task.four;
//Zadaca_4_31_10_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji izraèunava minimalnu dužinu avionske piste ako
 *  nam je data brzina pri uzletanju i ubrzanje aviona koristeæi se
 *  formulom: duzina = v^2 / (2 * a)
 * 
 *  Korisnik treba da unese brzinu(v) u m/s i ubrazanje(a) u m/s^2.
 * 
 *  Sample run programa:
 * 			
 *  Unesite brzinu i ubrzanje: 60 3.5 
 *  Minimalna duzina piste za ovaj avion iznosi: 514.286 m
 */


public class LengthRunway {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite brzinu i ubrzanje aviona:");
		
		double brzina = input.nextDouble();
		double ubzanje = input.nextDouble();
		
		input.close();
		
		double duzina = Math.pow(brzina, 2) / (2 * ubzanje);
		
		System.out.printf(" Minimalna duzina piste za ovaj avion iznosi: %.3f m ", duzina);
		

	}

}

