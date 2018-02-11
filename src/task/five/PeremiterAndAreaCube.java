package task.five;
//Zadaca_5_1_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji uzima od korisnika duzinu ivice kocke i na
 *  osnovu nje racuna obim i povrsinu kocke. 
 *  Obim kocke se racuna po formuli: O = 12a. 
 *  Površina se izraèunava po formuli: P = 6a^2.
 * 
 *  Sample run programa:
 * 
 *  Unesite duzinu ivice kocke u cm: 7.5 
 *  Obim kocke cija je ivica 7.5 cm iznosi: 90.0 cm 
 *  Povrsina kocke cija je ivica 7.5 cm iznosi: 337.5 cm^2
 * 
 */

public class PeremiterAndAreaCube {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesite duzinu ivice kocke u cm:");
		double a = input.nextDouble();
		
		input.close();
		
		double obim = 12 * a;
		double povrsina = 6 * Math.pow(a, 2);
		
		System.out.printf(" Obim kocke cija je ivica %.1fcm izosi:%.1f cm \n", a, obim);
		System.out.printf(" Povrsina kocke cija je ivica %.1fcm izosi:%.1f cm^2 ", a, povrsina);
	}

}

