package task.four;
//Zadaca_4_31_10_2017

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji simulira nasumièno izvlaèenje karte iz špila od
 *  52 karte. Program treba ispisati koja karta je izvuèena (A, 2, 3, 4,
 *  5, 6, 7, 8, 9, 10, J, Q ili K) te znak u kojem je data karta (Srce,
 *  Pik, Djetelina, Kocka). Primjer: Karta koju ste izvukli je 10 u znaku
 *  kocke
 */

public class RandomCardsFirstSolution {

	public static void main(String[] args) {

		int karta = (int) (Math.random() * 13 + 1);
		int znak = (int) (Math.random() * 4 + 1);

		switch (karta) {
		case 1:
			System.out.printf(" Karta koju ste izvukli je A ");
			break;

		case 2:
			System.out.printf(" Karta koju ste izvukli je 2 ");
			break;

		case 3:
			System.out.printf(" Karta koju ste izvukli je 3 ");
			break;

		case 4:
			System.out.printf(" Karta koju ste izvukli je 4 ");
			break;

		case 5:
			System.out.printf(" Karta koju ste izvukli je 5 ");
			break;

		case 6:
			System.out.printf(" Karta koju ste izvukli je 6 ");
			break;

		case 7:
			System.out.printf(" Karta koju ste izvukli je 7 ");
			break;

		case 8:
			System.out.printf(" Karta koju ste izvukli je 8 ");
			break;

		case 9:
			System.out.printf(" Karta koju ste izvukli je 9 ");
			break;

		case 10:
			System.out.printf(" Karta koju ste izvukli je 10 ");
			break;

		case 11:
			System.out.printf(" Karta koju ste izvukli je J ");
			break;

		case 12:
			System.out.printf(" Karta koju ste izvukli je Q ");
			break;

		case 13:
			System.out.printf(" Karta koju ste izvukli je K ");

		}

		switch (znak) {

		case 1:
			System.out.printf("u znaku srca.");
			break;

		case 2:
			System.out.printf("u znaku pika.");
			break;

		case 3:
			System.out.printf("u znaku djeteline.");
			break;

		case 4:
			System.out.printf("u znaku kocke.");

		}
	}

}

