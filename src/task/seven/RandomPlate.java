package task.seven;
// Zadaca_7_4_11_2017

/*
 * @author Edin Korkic
 * 
 *  Pretpostavimo da se registarska tablica za auto sastoji od tri
 *  uppercase karaktera i 4 broja u sljedeæem formatu AAA-1234. Napisati
 *  program koji nasumièno generiše tablicu.
 */


public class RandomPlate {

public static void main(String[] args) {
		
		char letter1 = (char) ((int)(Math.random() * 26) + 65);
		char letter2 = (char) ((int)(Math.random() * 26) + 65);
		char letter3 = (char) ((int)(Math.random() * 26) + 65);
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		int number4 = (int)(Math.random() * 10);
		
		System.out.printf(" %c%c%c-%d%d%d%d ", letter1, letter2 ,letter3, number1, number2, number3, number4);
	}

}

