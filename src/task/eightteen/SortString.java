package task.eightteen;
// Zadaca_18_26_11_2017

/*
 * @author Edin Korkic
 * 
 *  Napisati metodu koja vraæa sortiran string koristeæi se sljedeæim headerom:
 *  public static String sortirajString(String s)
 *  Poziv metode sortirajString("acb") treba da vrati abc. 
 */

public class SortString {

	public static void main(String[] args) {

		System.out.printf(" Prije sortiranja string: acb \n");
		System.out.printf(" Poslije sortiranja string: %s ", sortString("acb"));

	}

	public static String sortString(String s) {
		
		char[] ch = s.toCharArray();
		
		for(int i = 0; i < s.length(); i++){
			for(int j = 0; j < s.length(); j++){
				if(ch[i] < ch[j]){
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
					s = String.valueOf(ch);
				
				}
			}
		}
		return s;

	}
}

