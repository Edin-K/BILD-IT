package task.eight;
//Zadaca_8_13_11_2017

import java.util.Scanner;

/*
 *  @uthor Edin Korkic
 *  
 *  Pretpostavimo da uplatimo $100 svaki mjesec na �tedni ra�un koji ima godi�nju 
 *  kamatnu stopu od 5%. Mjese�na kamatna stopa je stoga 0.05 / 12 = 0.00417. 
 *  Nakon prvog mjeseca vrijednost na ra�unu postaje 100 * (1 + 0.00417) = 100.417.
 *  Nakon drugog mjeseca, vrijednost na ra�unu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. 
 *  Nakon tre�eg mjeseca, vrijednost na ra�unu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 
 *  i tako dalje.  Napisati program koji pita korisnika da unese mjese�ni iznos �tednje te broj mjeseci
 *  nakon kojeg bi �elio znati stanje ra�una i ispisuje stanje na ra�unu nakon tog broja mjeseci. 
 */

public class SavingAccount {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print(" Unesite mjesecni iznos stednje: ");
        
        double amount = input.nextDouble();
       
        System.out.print(" Unesite broj mjeseci: ");
        
        double months = input.nextDouble();
        
        input.close();
        
        double account = 0;
        
        for(int i = 0; i < months; i++){
        	
        	account = (account + amount) * (1 + 0.00417);
        }
        System.out.printf(" Nakon %.0f mjeseca Vas racun iznosi: %.3f ", months, account);
	}

}

