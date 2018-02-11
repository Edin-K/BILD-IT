package task.twentyfour;
// Zadaca_24_04_12_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Moderne observacije procjenjuju da je svemir star oko 13.7 milijardi godina. Znamo da svjetlu, kao i svemu drugome, 
 *  treba odreðeno vrijeme da preðe odreðenu površinu. Ukoliko posmatramo objekt koji je od nas udaljen 13 milijardi 
 *  svjetlosnih godina – svjetlu je trebalo 13 milijardi godina da stigne do nas. (13 milijardi godina je mnogo – deep 
 *  time calculator vam može dati bolji uvid koliko mnogo wink wink, nudge nudge.)
 *  Napisati aplikaciju koja prima od korisnika unos (broj svjetlosnih godina koje bi željeli putovati) te ispisuje korisniku:
 *  1.broj kilometara koje svjetlost preðe u datom vremenu
 *  2.broj AU (astronomical units) koje svjetlost preðe u datom vremenu
 *  3.broj parseca koje svjetlost preðe u datom vremenu
 *  
 *  Pored svega ovoga, izraèunati koliko bi trebalo nama da preðemo istu udaljenost najbržim man made objectom ikada (Helios 2). 
 *  1.Brzina svjetlosti – 299 792 458 m / s
 *  2.AU – 149.6 miliona kilometara
 *  3.Parsec – 3.26 svjetlosnih godina
 *  4.Helios 2 – 252792.537 km / h. 
 */

public class Helios2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite broj svjetlosnih godina koje bi zeljeli putovati: ");

		double lightYears = input.nextLong();

		input.close();

		calculateLightSpeed(lightYears);

		helios(lightYears);

	}

	public static void calculateLightSpeed(double lightYear) {

		double lightDistance = lightYear * 299792458 * 0.277777778;

		double au = lightYear * 63239.7785135;

		double parsec = lightYear * 0.3065950959227;

		System.out.printf(" %.0f svjetlosna godina \n", lightYear);
		System.out.printf(" inosi: %.3f kilometara \n", lightDistance);
		System.out.printf(" inosi: %.3f astronomical units \n", au);
		System.out.printf(" inosi: %.3f parseca \n", parsec);

	}

	public static void helios(double lightYear) {

		double lightDistance = lightYear * 299792458 * 0.277777778;
		double lightTime = lightYear * 299792458 * 0.277777778 / 252792.537;

		System.out.printf(" Da bi presli: %.3f kilometara \n", lightDistance);
		System.out.printf(" sa heliosom treba nam: %.3f sati \n", lightTime);
		
	}
}

