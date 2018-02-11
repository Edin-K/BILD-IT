package task.nineteen;
// Zadaca_19_27_11_2017

/*
 * @author Edin Korkic
 * 
 *   Cijeli pozitivni broj nazivamo savr�enim brojem ukoliko je jednak zbiru svih svojih 
 *   pozitivnih djelilaca ne uklju�uju�i samoga sebe. Na primjer, 6 je prvi savr�eni 
 *   broj jer 6 = 3 + 2 + 1. Sljede�i savr�eni broj je 28 = 14 + 7 + 4 + 2 + 1. 
 *   U rasponu od 0 do 10.000 postoje 4 savr�ena broja. Napisati program koji pronalazi 
 *   ova 4 broja. BONUS: Napisati metodu koja rje�ava ovaj problem. 
 */

public class PerfectNumbers {

public static void main(String[] args) {
		
		perfectNumber();

	}

	public static void perfectNumber() {

		int sum = 0;
		

		for (int i = 1; i <= 10000; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}

			}
			if (sum == i) {
				System.out.printf(" %d je savrseni broj!",i);
				System.out.printf("\n");
			}
			sum = 0;
		}

	
	}
}

