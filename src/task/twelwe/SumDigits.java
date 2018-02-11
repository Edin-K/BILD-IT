package task.twelwe;
// Zadaca_12_17_11_2017

/*
 *  @uthor Edin Korkic
 * 
 *  Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju. 
 *  Koristite sljedeæi header: public static int saberiCifre(long n). 
 *  Na primjer, ako pozovemo metodu i proslijedimo joj broj 234 
 *  (saberiCifre(234)) metoda treba da vrati 9. (2 + 3 + 4 = 9)
 */

public class SumDigits {

public static void main(String[] args) {
		
		System.out.printf(" Suma cifri iznosi: %d ",sumDigit(234));
		
	}
public static int sumDigit(long n) {
	
	n = Math.abs(n);
	
	int sum = 0;
	
	while(n != 0){
		long reaminder = n % 10;
		sum += reaminder;
		n /= 10;
	}
	return sum;
	
}
}

