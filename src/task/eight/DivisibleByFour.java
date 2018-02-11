package task.eight;
//Zadaca_8_13_11_2017

/*
 *  @uthor Edin Korkic
 * 
 *   Napisati program koji ispisuje sve brojeve u rangu od 1 do 1000 
 *   koji su djeljivi sa 4, ali ne sa 5. 
 */

public class DivisibleByFour {

public static void main(String[] args) {
		
		int count = 0; 
		
		System.out.print(" Brojevi djeljivi sa 4 ali ne sa 5 od 1 do 1000 su:\n");
		
		for(int i = 1; i < 1000; i++){
			if(i % 4 == 0 && i % 5 != 0){
				
				System.out.printf(" %4d",i);
				count++;
				// ispisi 10 brojeva po liniji
				if(count % 10 == 0){
					System.out.printf("\n");
				}
			}
		}

	}

}
