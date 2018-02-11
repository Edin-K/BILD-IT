package task.eleven;
//Zadaca_11_16_11_2017

/*
 * @author Edin Korkic
 *
 *  Napisati metodu sa sljedeæim headerom: public static boolean isProstiBroj(int broj) 
 *  koja provjerava da li je broj prost/prime. Napisati test program koji poziva ovu metodu 
 *  i ispisuje sve proste brojeve u rasponu od 0 do 100 000. 
 */

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int numberPerLine = 0;

		for (int i = 2; i <= 100000; i++) {
			if (isProstiBroj(i)) {
				numberPerLine++;
				System.out.printf(" %4d ",i);
				if (numberPerLine % 8 == 0) {
					System.out.printf("\n");

				}
			}
		}

	}

	public static boolean isProstiBroj(int broj) {

		for (int j = 2; j < broj; j++) {
			if (broj % j == 0) {
				if (broj != 0 && broj != 1) {
					return false;

				}
			}
		}
		return true;
	}

}
