package task.three;
//Zadaca_3_30_10_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese cijeli broj za današnji
 *  dan u sedmici (0 za ponedjeljak, 1 za utorak...) i da unese broj dana
 *  nakon današnjeg dana te mu ispiše koji je to dan u buduænosti.
 *  (Primjer: ako korisnik unese 1 kao današnji dan a 3 kao dan u
 *  buduænosti program mu ispisuje da je danas utorak a dan u buduænosti
 *  je petak.)
 *
 */
public class FutureDaySecondSolution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite cijeli broj za današnji dan:");
		int dan = input.nextInt();

		System.out.print(" Unesite cijeli broj za buduæi dan:");
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
			System.out.printf(" Danas je èetvrtak ");
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
			System.out.printf(",a dan u buduænosti je ponedjeljak. ");
			break;
			
		case 1:
			System.out.printf(",a dan u buduænosti je utorak. ");
			break;
			
		case 2:
			System.out.printf(",a dan u buduænosti je srijeda. ");
			break;
			
		case 3:
			System.out.printf(",a dan u buduænosti je èetvrtak. ");
			break;
			
		case 4:
			System.out.printf(",a dan u buduænosti je petak. ");
			break;
			
		case 5:
			System.out.printf(",a dan u buduænosti je subota. ");
			break;
			
		case 6:
			System.out.printf(",a dan u buduænosti je nedjelja. ");

		}
	}
}

