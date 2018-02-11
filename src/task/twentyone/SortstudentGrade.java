package task.twentyone;
// Zadaca_21_29_11_2017

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese broj studenata, imena studenata kao 
 *  i njihove ocjene te ispisuje imena studenata na osnovu njihovih ocjena, od najveæe ka najmanjoj. 
 */

public class SortstudentGrade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite broj studenata: ");

		int number = input.nextInt();

		String[] students = new String[number];
		int[] grades = new int[number];


		System.out.printf(" Unesite imena za %d studenata i ocjene: \n ",number);
		for (int i = 0; i < number; i++) {
			students[i] = input.next();
			grades[i] = input.nextInt();
		}

		
		input.close();
		
		printStudents(students,grades);

	}

	public static void printStudents(String[] students, int[] grades) {

		for (int i = 0; i < students.length; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (grades[i] < grades[j]) {
					sortStudents(students, grades, i, j);
				}
			}

		}

		System.out.printf(" Ime studenta \t Ocjene \n");
		for (int i = 0; i < students.length; i++) {
			System.out.printf(" %s \t\t %d \n",students[i],grades[i]);
			
		}
		
	}

	public static void sortStudents(String[] students, int[] grades, int i, int j) {

		String tempStudents = students[i];
		students[i] = students[j];
		students[j] = tempStudents;

		int tempGrades = grades[i];
		grades[i] = grades[j];
		grades[j] = tempGrades;
	}
}


