package task.five;
//Zadaca_5_1_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji izra�unava energiju potrebnu za zagrijavanje
 *  vode od po�etne do �eljene temperature. Program treba da pita
 *  korisnika da unese iznos vode u kilogramima, po�etnu temperaturu vode
 *  te �eljenu temperaturu vode. Formula za izra�unavanje potrebne
 *  energije je:
 * 
 *  Q = MergingArrays * (zeljenaTemperatura - pocetnaTemperatura) * 4184
 *  gdje MergingArrays predstavlja te�inu vode u kilogramima, temperature
 *  predstavljamo u celzijusima a energiju Q u joulima.
 * 
 *  Sample run programa:
 * 
 *  Unesite te�inu vode u kilogramima: 55.5 
 *  Unesite po�etnu temperaturu:3.5 
 *  Unesite �eljenu temperaturu: 10.5
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
