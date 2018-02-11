package task.four;
// Zadaca_4_31_10_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese radius (r) i visinu (H)
 *  cilindra te izraèunava njegovu površinu i zapreminu koristeæi se
 *  sljedeæim formulama: 
 *  površina = 2 * r2PI + H * 2rPI
 *  zapremina = r2PI * H
 * 
 *  Sample run programa:
 * 
 *  Unesite radius i dužinu cilindra: 5.5 12 
 *  Povrsina cilindra iznosi 604.7565858160352 
 *  Zapremina cilindra iznosi 1140.398133253095
 */

public class AreaAndVolumeCylinnder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
				System.out.print(" Unesite radius i duzinu cilindra:");
				
				double radius = input.nextDouble();
				double visina = input.nextDouble();
				
				input.close();
				
				double povsina = 2 * Math.pow(radius, 2) * Math.PI + visina * 2 * radius * Math.PI;
				double zapremina = Math.pow(radius, 2) * Math.PI * visina;
				
				System.out.printf(" Povrsina cilindra iznosi %.13f \n", povsina);
				System.out.printf(" Zapremina cilindra iznosi %.12f ", zapremina);
				

			}

		}

