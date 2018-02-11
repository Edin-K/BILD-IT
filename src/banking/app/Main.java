package banking.app;

import java.util.ArrayList;

public class Main {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	static int id = 0;
	static String name = null;
	static double deposit = 0;
	static int sourceAccount;
	static int targetAccount;
	static double money;

	public static void main(String[] args) {

		ArrayList<Account> account = new ArrayList<>();

		boolean isTrue = true;

		do {
			System.out.printf(" Izaberite jednu od ponudenih radnji:\n " + "[1] Kreiranje  racuna\n"
					+ " [2] Prebacivanje novca\n" + " [3] Stanje racuna\n" + " [4] Izlaz\n");
			int number = input.nextInt();

			if (number > 0 && number < 5) {

				switch (number) {

				case 1:
					System.out.printf(" Unesite broj racuna:\n ");
					id = input.nextInt();
					input.nextLine();
					System.out.printf(" Unesite ime korisnika:\n ");
					name = input.nextLine();
					System.out.printf(" Unesite stanje racuna:\n ");
					deposit = input.nextDouble();
					if (isValid(account, id) && deposit > 0) {
						account.add(new Account(id, name, deposit));
						System.out.printf(" Cestitamo krearali ste novi racun:\n ");
					} else {
						System.out.printf(" Vec imate racun kreiran sa tim brojem,ili niste unijeli dobro stanje racuna"
								+ ",pokusajte ponovo!\n");
					}
					break;
				case 2:

					System.out.printf(" Unesite broj source racuna:\n ");
					sourceAccount = input.nextInt();
					System.out.printf(" Unesite iznos koji zelite prabaciti:\n ");
					money = input.nextDouble();
					System.out.printf(" Unesite broj target racuna:\n ");
					targetAccount = input.nextInt();
					int i = 0;
					if ((account.get(i).getId() == sourceAccount) && isTrue && (account.get(i).getDeposit() >= money)) {
						Transfer.transfer(account, sourceAccount, targetAccount, money);
						System.out.printf(" Uspjesno ste izvsili transakciju!\n ");
					} else {
						System.out
								.printf(" Broj racuna je nepostojeci ili trenutno nije dostupan,pokusajte ponovo!\n ");
					}

					break;
				case 3:
					System.out.printf(" Unesite broj racuna:\n ");
					id = input.nextInt();
					if (!isValid(account, id)) {
						System.out.printf(" Stanje vaseg racuna je:%.2f \n ", balance(account, id));

					} else {
						System.out
								.printf(" Broj racuna je nepostojeci ili trenutno nije dostupan,pokusajte ponovo!\n ");

					}

					break;
				case 4:
					System.out.printf(" Hvala na posjeti,hvala sto koristite nas bankomat!");
					System.exit(0);
					break;

				}
			} else {
				System.out.printf(" Pogresan unos,pokusajte ponovo:\n ");

			}

		} while (isTrue);

	}

	public static boolean isValid(ArrayList<Account> account, int id) {

		for (int i = 0; i < account.size(); i++) {
			if (id == account.get(i).id) {

				return false;

			}
		}
		return true;

	}

	public static double balance(ArrayList<Account> account, int id) {

		double count = 0;

		for (int i = 0; i < account.size(); i++) {
			if (id == account.get(i).id) {
				count = account.get(i).getDeposit();

			}
		}
		return count;

	}
}
