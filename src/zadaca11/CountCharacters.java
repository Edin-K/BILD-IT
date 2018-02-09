package zadaca11;
//Zadaca_11_16_11_2017

/*
 * @author Edin Korkic
 *
 *  Napisati metodu koja pronalazi broj ponavljanja odreðenog karaktera u stringu. 
 *  Metoda treba da koristi sljedeæi header: public static int brojacKaraktera(String str, char ch). 
 *  Na primjer, ukoliko pozovemo metodu na sljedeæi naèin: brojacKaraktera("Dobrodosli", o) metoda treba da vrati 3.
 */

public class CountCharacters {

	public static void main(String[] args) {
		
		System.out.printf(" Karakter o se pojavljuje %d puta. ",brojacKaraktera("Dobrodosli",'o'));

	}
	public static int brojacKaraktera(String str, char ch){
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == ch){
				count++;
			}
		}
		
		return count;

	}

}
