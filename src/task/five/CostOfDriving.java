package task.five;
//Zadaca_5_1_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese daljinu u kilometrima
 *  koju želi preæi, potrošnju auta (koliko kilometara može preæi sa
 *  litrom goriva), te cijenu litre goriva. Ispisati konaènu cijenu
 *  putovanja.
 * 
 *  Sample run programa:
 * 
 *  Unesite duzinu puta u kilometrima: 125 
 *  Unesite potrosnju auta (kolikokilometara moze preci sa litrom goriva): 25 
 *  Unesite cijenu litregoriva u markama: 2.5 
 *  Ukupna cijena putovanja iznosi: 12.5
 * 
 */

public class CostOfDriving {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print(" Unesite duzinu puta u kilometrima:");
		double duzina = input.nextDouble();
		
		System.out.print(" Unesite potrosnju auta(koliko kilometara moze preci sa litrom goriva):");
		double potrosnja = input.nextDouble();
		
		System.out.print(" Unesite cijenu litre goriva u markama:");
		double cijena = input.nextDouble();
		
		input.close();
		
		double cijenaPutovanja = duzina / potrosnja * cijena;
		
		System.out.printf(" Ukupna cijena putovanja iznosi:%.1f ", cijenaPutovanja);
}

}

