package task.seventeen;
// Zadaca_17_25_11_2017


/*
 * @author Edin Korkic
 * 
 *   Napisati program koji generiše 100 nasumiènih cijelih brojeva u rasponu od
 *   0 do 9 te ispisuje koliko se koji puta karakter ponovio. 
 * 
 */

public class CountOfOccurrence {

public static void main(String[] args) {
		
		int counter = 0;
		final int NUMBER_PER_LINE = 10;
		
		int[] array = new int[100];
		int[] count = new int[100];
		
		System.out.printf(" Nasumicno generisan niz: \n");
		
		for(int i = 0; i < array.length; i++){
			int num = (int) (Math.random() * 10);
			array[i] = num;
			count[num]++;
			
			System.out.printf(" %d ",array[i]);
			counter++;
			if(counter % NUMBER_PER_LINE == 0){
				System.out.printf("\n");
			}
		}
		
		System.out.printf("\n");
		countOccurrence(count);
	}
public static void countOccurrence(int[] count) {
	
	for(int i = 0; i < count.length; i++){
		if(count[i] != 0){
			System.out.printf(i + " se pojavljuje " + count[i] + (count[i] == 1 ? " put.\n" : " puta.\n"));
		}
	}
	
}
}

