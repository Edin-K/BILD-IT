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


public class RandomCardsSecondSolution {

	public static void main(String[] args) {
		
		int karta = (int)(Math.random() * 13 + 1);
		int znak = (int) (Math.random() * 4 + 1);
		
		if(karta == 1){
			System.out.printf(" Karta koju ste izvukli je A ");
		}
		else if(karta == 2){
			System.out.printf(" Karta koju ste izvukli je 2 ");
		}
		else if(karta == 3){
			System.out.printf(" Karta koju ste izvukli je 3 ");
		}
		else if(karta == 4){
			System.out.printf(" Karta koju ste izvukli je 4 ");
		}
		else if(karta == 5){
			System.out.printf(" Karta koju ste izvukli je 5 ");
		}
		else if(karta == 6){
			System.out.printf(" Karta koju ste izvukli je 6 ");
		}
		else if(karta == 7){
			System.out.printf(" Karta koju ste izvukli je 7 ");
		}
		else if(karta == 8){
			System.out.printf(" Karta koju ste izvukli je 8 ");
		}
		else if(karta == 9){
			System.out.printf(" Karta koju ste izvukli je 9 ");
		}
		else if(karta == 10){
			System.out.printf(" Karta koju ste izvukli je 10 ");
		}
		else if(karta == 11){
			System.out.printf(" Karta koju ste izvukli je J ");
		}
		else if(karta == 12){
			System.out.printf(" Karta koju ste izvukli je Q ");
		}
		else{ 
			if(karta == 13){
				System.out.printf(" Karta koju ste izvukli je K ");
			}
			
		}
		
		if(znak == 1){
			System.out.printf("u znaku srca.");
		}
		else if(znak == 2){
			System.out.printf("u znaku pika.");
		}
		else if(znak == 3){
			System.out.printf("u znaku djeteline.");
		}
		else{ 
			if(znak == 4){
				System.out.printf("u znaku kocke.");
			}
			
		}

	}

}

