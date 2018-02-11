package task.three;
//Zadaca_3_30_10_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese cijeli broj za dana�nji
 *  dan u sedmici (0 za ponedjeljak, 1 za utorak...) i da unese broj dana
 *  nakon dana�njeg dana te mu ispi�e koji je to dan u budu�nosti.
 *  (Primjer: ako korisnik unese 1 kao dana�nji dan a 3 kao dan u
 *  budu�nosti program mu ispisuje da je danas utorak a dan u budu�nosti
 *  je petak.)
 *
 */
public class FutureDaySecondSolution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite cijeli broj za dana�nji dan:");
		int dan = input.nextInt();

		System.out.print(" Unesite cijeli broj za budu�i dan:");
		int buduciDan = input.nextInt();

		input.close();

		switch (dan % 7) {

		case 0:
			System.out.printf(" Danas je ponedjeljak ");
			break;

		case 1:
			System.out.printf(" Danas je utorak ");
			break;

		case 2:
			System.out.printf(" Danas je srijeda ");
			break;

		case 3:
			System.out.printf(" Danas je �etvrtak ");
			break;

		case 4:
			System.out.printf(" Danas je petak ");
			break;
			
		case 5:
			System.out.printf(" Danas je subota ");
			break;
			
		case 6:
			System.out.printf(" Danas je nedjelja ");

		}

		switch ((dan + buduciDan) % 7) {

		case 0:
			System.out.printf(",a dan u budu�nosti je ponedjeljak. ");
			break;
			
		case 1:
			System.out.printf(",a dan u budu�nosti je utorak. ");
			break;
			
		case 2:
			System.out.printf(",a dan u budu�nosti je srijeda. ");
			break;
			
		case 3:
			System.out.printf(",a dan u budu�nosti je �etvrtak. ");
			break;
			
		case 4:
			System.out.printf(",a dan u budu�nosti je petak. ");
			break;
			
		case 5:
			System.out.printf(",a dan u budu�nosti je subota. ");
			break;
			
		case 6:
			System.out.printf(",a dan u budu�nosti je nedjelja. ");

		}
	}
}

