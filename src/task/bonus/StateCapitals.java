package task.bonus;
//Zadaca_BONUS_02_12_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese glavni grad neke drzave u vidu kviza geografije. 
 *  Kada program primi odgovor, vraæa korisniku povratnu informaciju da li je odgovor tacan ili nije. 
 *  Pretpostavimo da su drzave i glavni gradovi spremljeni u 2D matricu na sljedeæi nacin: Drzava  Grad
 *  Program pita korisnika onoliko pitanja koliko nasa matrica sadrzi parova te ispisuje na kraju broj 
 *  tacnih odgovora unijetih od strane korisnika. Unos odgovora nije case sensitive. 
 *  Sample run:
 *  Ako uzmemo sljedecu matricu:
 *  
 *  Alabama   Montgomery
 *  Alaska   Juneau
 *  Arizona Phoenix
 *  Output naseg program treba da izgleda ovako: 
 *  Koji je glavni grad drzave Alabama?: Sweet Home
 *  Netacno. Tacan odgovor je: Montgomery
 *  Koji je glavni grad drzave Alaska?: Anchorage
 *  Netacno. Tacan odgovor je: Juneau
 *  Koji je glavni grad drzave Arizona?: phoenix
 *  Tacan odgovor je Phoenix. Svaka cast. 
 *  Broj tacnih odgovora: 1.
 */


public class StateCapitals {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/* BONUS (total time) */
		long startTime = System.currentTimeMillis();

		int count = 0;

		for (int i = 0; i < state.length; i++) {
			System.out.printf(" Koji je glavni grad drzave %s?: ", state[i][0]);
			String answer = input.nextLine();
			if (answer.equalsIgnoreCase(state[i][1])) {
				System.out.printf(" Tacan odgovor je %s. Svaka cast. \n", state[i][1]);
				count++;
			} else {
				System.out.printf(" Netacno. Tacan odgovor je: %s \n", state[i][1]);
			}
		}

		long endTime = System.currentTimeMillis();

		long totalTime = (endTime - startTime) / 1000;

		System.out.printf(" Broj tacnih odgovora: %d.", count);

		System.out.printf(" Trebalo Vam je ukupno %d sekundi. ", totalTime);

	}

	public static String[][] state = { { "Alabama", "Montgomery" }, { "Alaska", "Juneau" }, { "Arizona", "Phoenix" },
			{ "Arkansas", "Little Rock" }, { "California", "Sacramento" }, { "Colorado", "Denver" },
			{ "Connecticut", "Hartford" }, { "Delaware", "Dover" }, { "Florida", "Tallahassee" },
			{ "Georgia", "Atlanta" }, { "Hawaii", "Honolulu" }, { "Idaho", "Boise" }, { "Illinois", "Springfield" },
			{ "Maryland", "Annapolis" }, { "Minnesota", "Saint Paul" }, { "Iowa", "Des Moines" },
			{ "Maine", "Augusta" }, { "Kentucky", "Frankfort" }, { "Indiana", "Indianapolis" }, { "Kansas", "Topeka" },
			{ "Louisiana", "Baton Rouge" }, { "Oregon", "Salem" }, { "Oklahoma", "Oklahoma City" },
			{ "Ohio", "Columbus" }, { "North Dakota", "Bismark" }, { "New York", "Albany" },
			{ "New Mexico", "Santa Fe" }, { "New Jersey", "Trenton" }, { "New Hampshire", "Concord" },
			{ "Nevada", "Carson City" }, { "Nebraska", "Lincoln" }, { "Montana", "Helena" },
			{ "North Carolina", "Raleigh" }, { "Missouri", "Jefferson City" }, { "Mississippi", "Jackson" },
			{ "Massachusetts", "Boston" }, { "Michigan", "Lansing" }, { "Pennsylvania", "Harrisburg" },
			{ "Rhode Island", "Providence" }, { "South Carolina", "Columbia" }, { "South Dakota", "Pierre" },
			{ "Tennessee", "Nashville" }, { "Texas", "Austin" }, { "Utah", "Salt Lake City" },
			{ "Vermont", "Montpelier" }, { "Virginia", "Richmond" }, { "Washington", "Olympia" },
			{ "West Virginia", "Charleston" }, { "Wisconsin", "Madison" }, { "Wyoming", "Cheyenne" } };
}

