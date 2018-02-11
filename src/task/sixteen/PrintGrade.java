package task.sixteen;
// Zadaca_16_24_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji uèitava broj osvojenih bodova svih studenata, pronalazi najveæi ostvareni 
 *  broj bodova te dodjeljuje ocjene ostalim studentima na osnovu sljedeæih kriterija:
 *  Ocjena je A ako je ostvareni broj bodova >= najveæi ostvareni broj bodova - 10
 *  Ocjena je B ako je ostvareni broj bodova >= najveæi ostvareni broj bodova - 20
 *  Ocjena je C ako je ostvareni broj bodova >= najveæi ostvareni broj bodova - 30
 *  Ocjena je D ako je ostvareni broj bodova >= najveæi ostvareni broj bodova - 40
 *  Ocjena F ako je ostvareni broj bodova manji od gore navedenih
 *  Program pita korisnika da unese ukupan broj studenata, zatim traži od korisnika da unese njihove 
 *  ocjene a onda prikazuje koju je ocjejenu dobio svaki student.
 *  Sample run:Unesite broj studenata: 4
 *  Unesite 4 ocjene : 40 55 70 58
 *  Student 0 je dobio 40 bodova i dobio ocjenu C
 *  Student 1 je dobio 55 bodova i dobio ocjenu B
 *  Student 2 je dobio 70 bodova i dobio ocjenu A
 *  Student 3 je dobio 58 bodova i dobio ocjenu B
 */

public class PrintGrade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite broj studenata: ");

		int length = input.nextInt();

		System.out.print(" Unesite 4 ocjene: ");

		int[] points = new int[length];

		char[] grade = new char[length];

		for (int i = 0; i < points.length; i++) {
			points[i] = input.nextInt();

		}

		input.close();

		printScore(points, grade);
	}

	public static int max(int[] points) {

		int max = points[0];

		for (int n : points) {
			if (max < n) {
				max = n;

			}
		}
		return max;
	}

	public static void printScore(int[] points, char[] grade) {

		int max = max(points);

		for (int i = 0; i < points.length; i++) {
			if (points[i] >= max - 10)
				grade[i] = 'A';
			else if (points[i] >= max - 20)
				grade[i] = 'B';
			else if (points[i] >= max - 30)
				grade[i] = 'C';
			else if (points[i] >= max - 40)
				grade[i] = 'D';
			else
				grade[i] = 'F';
		}
		for (int i = 0; i < points.length; i++) {
			System.out.printf(" Student %d je dobio %d bodova i dobio ocjenu %c \n", i, points[i], grade[i]);

		}


	}

}
