package task.twentythree;
// Zadaca_23_01_12_2017

/*
 * @author Edin Korkic
 * 
 *  Zamislimo skolu koja ima 100 uèenika i 100 ormarica. Prvog dana skole, svi ormarici su zatvoreni. 
 *  Ucenici krecu sa ulaskom u skolu. Prvi ucenik koji ulazi u skolu, U1, otvara svaki ormaric. 
 *  Drugi ucenik koji ulazi u skolu, U2, poèinje sa drugim ormaricem te zatvara redom svaki drugi ormaric. 
 *  Ucenik U3, ulazi u skolu i, pocevsi od treceg ormarica, mjenja stanje svakog treceg ormarica. 
 *  (zatvara ormaric ukoliko je otvoren, otvara ukoliko je isti zatvoren). Ucenik U4 ulazi u skolu i, 
 *  pocevsi od cetvrtog ormarica, mjenja stanje svakog cetvrtog ormarica. Ucenik U5 ulazi u skolu i, 
 *  pocevsi od petog ormarica, mjenja stanje svakog petog ormarica i tako dalje sve dok ucenik U100 ne 
 *  promijeni stanje zadnjeg ormarica. Nakon što su svi ucenici prosli kroz skolu i promijenili stanja 
 *  ormarica, koji ormarici su ostali otvoreni? Napisati program koji pronalazi odgovor na ovo pitanje 
 *  te ispisuje na konzoli brojeve svih otvorenih ormarica.
 */

public class SchoolLocker {

	public static void main(String[] args) {
		
		boolean[] lock = new boolean[100 + 1];
		
		 locker(lock);
		 
		 } public static void locker(boolean[] lock) {

		for (int i = 1; i < lock.length; i++) {
			for (int j = 1; j < lock.length; j++) {
				if (j % i == 0) {
					lock[j] = !lock[j];
				}
			}

			if (lock[i] == true) {
				System.out.printf(" Ormaric je otvotren broj: %d \n", i);
			}
		}
	}
}
