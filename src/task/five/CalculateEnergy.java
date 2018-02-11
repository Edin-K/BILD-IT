package task.five;
//Zadaca_5_1_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji izraèunava energiju potrebnu za zagrijavanje
 *  vode od poèetne do željene temperature. Program treba da pita
 *  korisnika da unese iznos vode u kilogramima, poèetnu temperaturu vode
 *  te željenu temperaturu vode. Formula za izraèunavanje potrebne
 *  energije je:
 * 
 *  Q = MergingArrays * (zeljenaTemperatura - pocetnaTemperatura) * 4184
 *  gdje MergingArrays predstavlja težinu vode u kilogramima, temperature
 *  predstavljamo u celzijusima a energiju Q u joulima.
 * 
 *  Sample run programa:
 * 
 *  Unesite težinu vode u kilogramima: 55.5 
 *  Unesite poèetnu temperaturu:3.5 
 *  Unesite željenu temperaturu: 10.5
 *  Energije potrebno za zagrijavanje vode: 1625484.0 joula
 * 
 */

public class CalculateEnergy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesite tezinu vode u kilogramima:");
		double tezinaVode = input.nextDouble();
		
		System.out.print(" Unesite pocetnu temperaturu:");
		double pocetnaTemperatura = input.nextDouble();
		
		System.out.print(" Unesite zeljenu temperaturu:");
		double zeljenaTemperatura = input.nextDouble();
		
		input.close();
		
		double energija = tezinaVode * (zeljenaTemperatura - pocetnaTemperatura) * 4184; 
		
		System.out.printf(" Energije potrebno za zagrijavanje vode: %.1f joula ", energija);
		
	}

}
