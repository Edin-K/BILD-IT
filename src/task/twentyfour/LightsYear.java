package task.twentyfour;
// Zadaca_24_04_12_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Pretpostavimo da je starost zemlje, za sve prakti�ne svrhe, oko 4.55 milijardi godina.
 *  Anatomski moderni ljudi postoje zadnjih 200.000 godina. Neandertacli su izumrli prije otprilike 
 *  40.000 godina. Homo erectus, Homo habilis, Australopithecus su izumrli prije par miliona godina. 
 *  Dinosauri su izumrli prije otprilike 66 miliona godina. Mnogo je to vremena.
 *  Koncept dubokog vremena / geolo�kog vremena je te�ko zamisliv nama sa relativno kratkim vijekom trajanja. 
 *  Stoga, zamislimo da imamo avion koji mo�e putovati u pro�lost brzinom od jedne godine po sekundi. 
 *  Ovaj nevjerovatni avion �e nam omogu�iti da steknemo bolji uvid i osje�aj za duboko vrijeme. 
 *  (Ako ni�ta drugo, vje�bat �emo Javu)
 *  Napisati aplikaciju koja prima od korisnika unos (broj godina koji korisnik �eli da se vrati u pro�lost) 
 *  te ispisuje korisniku broj:
 *  1.Sekundi, minuta i sati koliko bi trebalo putovati da se vrati do navedene godine u pro�losti.
 *  2.BONUS: Dana, mjeseci, godina koliko bi trebalo putovati da se vrati do navedene godine u pro�losti.
 *  3.BONUS: Decenija, stolje�a, milenija koliko bi trebalo putovati da se vrati do navedene godine u pro�losti. 
 *  Drugi na�in da dobijemo osje�aj za duboko vrijeme je da zamislimo da nas jedan korak (~75 cm) vra�a 1 godinu u pro�lost. 
 *  Na�a aplikacija treba da ispisuje i sljede�e (za isti unos kao i gore):
 *  1.Broj centimetara, metara i kilometara koje bi trebalo prohodati da se vrati do navedene godine u pro�losti.
 *  2.Broj puta koliko bi prehodali prosje�ni fudbalski stadion (105 m)
 *  3.Broj puta koliko bi prehodali obim zemlje (obim zemlje: 40.075 km)
 */

public class LightsYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite godinu u koju se zelite vartiti: ");

		long backYear = input.nextLong();

		input.close();

		lightsYears(backYear);
		distanceNumber(backYear);

	}

	public static void lightsYears(long backYear) {

		long currentYear = 2017;

		long totalYear = currentYear - backYear;

		// 365 * 24 * 60 * 60
		long total = totalYear * 31536000;

		// y = 8760h y = 525600m y = 31536000
		long seconds = total;
		long minutes = total / 3600 * 60;
		long hours = total / 3600;

		/* BONUS dani,mjeseci,godine */
		long days = total / 3600 / 24;
		long months = totalYear * 12;
		long years = totalYear;

		/* BONUS decenije,stiljeca,miliniji */
		long decades = totalYear / 10;
		long centurys = totalYear / 100;
		long mileniums = totalYear / 1000;

		System.out.printf(" Da bi otisli u %d godinu \n", backYear);
		System.out.printf(" potrebno nam je %d sekundi \n", seconds);
		System.out.printf(" potrebno nam je %d minuta \n", minutes);
		System.out.printf(" potrebno nam je %d sati \n", hours);
		System.out.printf(" potrebno nam je %d dana \n", days);
		System.out.printf(" potrebno nam je %d mjeseci \n", months);
		System.out.printf(" potrebno nam je %d godina \n", years);
		System.out.printf(" potrebno nam je %d decenija \n", decades);
		System.out.printf(" potrebno nam je %d stoljeca \n", centurys);
		System.out.printf(" potrebno nam je %d milenija \n", mileniums);

	}
	
	public static void distanceNumber(long backYear) {

		long currentYear = 2017;

		double total = currentYear - backYear;

		total *= 75;

		double centimeter = total;
		double meter = total / 100;
		double kilometer = total / 100000;

		double stadium = (total / 100) / 105;
		double earth = (total / 100000) / 40075;

		System.out.printf(" potrebno je preci %.1f centimetara \n", centimeter);
		System.out.printf(" potrebno je preci %.2f metara \n", meter);
		System.out.printf(" potrebno je preci %.5f kilometara \n", kilometer);
		System.out.printf(" potrebno je preci  stadion %.1f puta \n", stadium);
		System.out.printf(" potrebno je preci  zemlju %f puta \n", earth);

	}

}

