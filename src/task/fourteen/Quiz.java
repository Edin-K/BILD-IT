package task.fourteen;
//Zadaca_14_19_11_2017

/*
 *  @uthor Edin Korkic
 * 
 *   Napisati metodu koja prima jedan argument, broj pitanja, te generiše toliko nasumiènih, 
 *   jednostavnih pitanja oduzimanja tipa : „Koliko je 5 - 2 ?“. Metoda treba da broji broj 
 *   taènih i netaènih odgovora te ih ispiše korisniku. 
 */

public class Quiz {

static java.util.Scanner input = new java.util.Scanner(System.in);
	
	public static void main(String[] args) {
		

		System.out.print(" Unesite broj pitanja: ");

		int number = input.nextInt();

		numberOfQuestions(number);
		
		input.close();
	}

	public static void numberOfQuestions(int number) {
		

		       /*  BONUS  (total time) */
		long startTime = System.currentTimeMillis();

		int correctCount = 0;
		int wrongCount = 0;
		int count = 0;

		while (count < number) {

			int num1 = (int) (Math.random() * 10);
			int num2 = (int) (Math.random() * 10);

			if (num1 < num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}

			System.out.printf(" Koliko je %d - %d = ", num1, num2);

			int answer = input.nextInt();
			if (num1 - num2 == answer) {
				System.out.printf(" Cestitamo, tacan odgovor!\n");
				correctCount++;
			} else {
				System.out.printf(" Netacan odgovor!\n");
				wrongCount++;

			}
			count++;

		}

		long endTime = System.currentTimeMillis();

		long totalTime = (endTime - startTime) /1000;

		System.out.printf(" Imali ste tacnih %d odgovora.\n", correctCount);
		System.out.printf(" Imali ste netacnih %d odgovora.\n", wrongCount);
		System.out.printf(" Trebalo Vam je vremena %d sekundi. ", totalTime);
	}
}
