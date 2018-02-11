package task.seven;
//Zadaca_7_4_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese imena tri grada te ih
 *  ispiše u abecednom redu. Na primjer, ukoliko korisnik unese Chicago,
 *  Los Angeles i Atlanta kao gradove, program vraæa Atlanta, Chicago,
 *  Los Angeles.
 */

public class SortCityesSecondSolution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite ime prvog grada:");
		String city1 = input.nextLine();

		System.out.print(" Unesite ime drugog grada:");
		String city2 = input.nextLine();

		System.out.print(" Unesite ime treceg grada:");
		String city3 = input.nextLine();

		input.close();

		if (city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0) {
			System.out.printf(" Gradovi poredani po abecedi: %s %s %s ", city1, city2, city3);

		} else if (city2.compareTo(city1) > 0 && city2.compareTo(city3) > 0) {
			System.out.printf(" Gradovi poredani po abecedi: %s %s %s ", city2, city1, city3);

		} else if (city3.compareTo(city1) < 0 && city3.compareTo(city2) < 0) {
			System.out.printf(" Gradovi poredani po abecedi: %s %s %s ", city3, city1, city2);

		} else {
			System.out.printf(" Gradovi poredani po abecedi: %s %s %s ", city3, city2, city1);

		}

	}

}
