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

public class SortCityesFirstSolution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite ime prvog grada:");
		String city1 = input.nextLine();

		System.out.print(" Unesite ime drugog grada:");
		String city2 = input.nextLine();

		System.out.print(" Unesite ime treceg grada:");
		String city3 = input.nextLine();

		input.close();

		if (city1.compareTo(city2) > 0) {
			String temp = city2;
			city2 = city1;
			city1 = temp;
		}
		if (city2.compareTo(city3) > 0) {
			String temp = city3;
			city3 = city2;
			city2 = temp;
		}
		if (city1.compareTo(city2) > 0) {
			String temp = city2;
			city2 = city1;
			city1 = temp;
		}

		System.out.printf(" Gradovi poredani po abecedi: %s %s %s ", city1, city2, city3);

	}

}

