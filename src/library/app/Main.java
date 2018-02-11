package library.app;

import java.util.ArrayList;
import java.util.Date;

public class Main {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	static int number = 0;
	static boolean isValid = false;
	static boolean isTrue = true;
	static boolean isBook;
	static boolean isAccount;
	static boolean statusBook = false;
	static int numberAccount = 0;
	static String name;
	static String nameBook = null;
	static int numberBook = 0;
	static int indexAccount = 0;
	static int indexBook = 0;

	public static void main(String args[]) throws Exception {

		ArrayList<Account> account = new ArrayList<>();
		ArrayList<Book> book = new ArrayList<>();
		ArrayList<UseBook> useBook = new ArrayList<>();

		do {
			System.out.printf(" Izaberite jednu od ponudenih radnji:\n " + "[1] Kreiranje  racuna\n"
					+ " [2] Kreiranje knjige\n" + " [3] Vracanje knjige\n" + " [4] Podizanje knjige\n"
					+ " [5] Lista knjiga\n" + " [6] Printanje racuna\n" + " [7] Izlaz\n");

			do {
				try {
					number = input.nextInt();
					if (number < 1 || number > 7) {
						throw new Exception();
					}
					isValid = true;
				} catch (Exception e) {
					System.out.println("Unos nije ispravan. Unesite ponovo: ");
					input.nextLine();
				}
			} while (!isValid);

			switch (number) {

			case 1:
				
					name = input.nextLine();
					System.out.printf("Unesite ime:\n ");
					name = input.nextLine();
					System.out.printf("Unesite broj racuna:\n ");

					isValid = false;
					try {
						numberAccount = input.nextInt();
						if (numberAccount < 0) {
							throw new Exception();
						} else {
							for (int i = 0; i < account.size(); i++) {
								if (account.get(i).numberAccount == numberAccount) {
									throw new Exception();
								}
							}
						}
						isValid = true;
					} catch (Exception e) {
						System.out.printf("Unos broja racuna nije ispravan. Unesite ponovo:\n ");
					}

				

				account.add(new Account(numberAccount, name, indexBook));
				System.out.printf(" Uspjesno ste kreirali racun.\n");

				break;

			case 2:

				
					isValid = false;
					try {
						input.nextLine();
						System.out.printf(" Unesite ime knjige koju zelite dodati:\n ");
						nameBook = input.nextLine();
						System.out.printf("Unesite broj knjige: ");
						numberBook = input.nextInt();

						if (numberBook < 0) {
							throw new Exception();
						} else {
							for (int i = 0; i < book.size(); i++) {
								if (book.get(i).numberBook == numberBook) {
									throw new Exception();
								}
							}
						}

						isValid = true;
					} catch (Exception e) {
						System.out.printf(" Unos broja ili imena knjige nije ispravan,unesite ponovo!\n");
					}

			

				book.add(new Book(numberBook, nameBook, statusBook));
				System.out.printf(" Uspjesno ste kreirali knjigu.\n");
				break;

			case 3:
				

					try {
						isAccount = false;
						isBook = false;
						isValid = false;

						System.out.printf(" Unesite broj racuna:\n ");
						numberAccount = input.nextInt();
						System.out.printf(" Unesite broj knjige:\n ");
						numberBook = input.nextInt();

						for (int i = 0; i < account.size(); i++) {
							if (account.get(i).numberAccount == numberAccount) {
								isAccount = true;
								indexAccount = i;
							}
						}
						for (int i = 0; i < book.size(); i++) {
							if (book.get(i).numberBook == numberBook) {
								isBook = true;
								indexBook = i;
							}
						}

						if (isBook && isAccount) {
							if (account.get(indexAccount).numberUseBook == 3) {
								System.out.printf(" Imate vec 3 posudjene knjige!\n");
								break;
							} else if (book.get(indexBook).statusBook) {
								System.out.printf("Knjiga je vec izdata.\n");
								break;
							} else {
								System.out.printf(" Uspjesno ste posudili knjigu: " + book.get(indexBook).nameBook
										+ " korisniku " + account.get(indexAccount).userName + "\n");
								useBook.add(new UseBook(numberAccount, numberBook, new Date()));
								account.get(indexAccount).numberUseBook++;
								book.get(indexBook).statusBook = true;
								isValid = true;
							}
						} else {
							throw new Exception();
						}
					} catch (Exception e) {
						System.out.printf("Unijeli ste nepostojeci broj racuna ili knjige.\n");
						input.nextLine();
						break;
					}
			
				break;

			case 4:

				do {

					try {
						isAccount = false;
						isBook = false;
						isValid = false;

						System.out.printf("Unesite broj racuna:\n ");
						numberAccount = input.nextInt();
						System.out.printf("Unesite broj knjige:\n ");
						numberBook = input.nextInt();

						for (int i = 0; i < account.size(); i++) {
							if (account.get(i).numberAccount == numberAccount) {
								isAccount = true;
								indexAccount = i;
							}
						}
						for (int i = 0; i < book.size(); i++) {
							if (book.get(i).numberBook == numberBook) {
								isBook = true;
								indexBook = i;
							}
						}

						if (isBook && isAccount) {

							if (!book.get(indexBook).statusBook) {
								System.out.printf("Ova knjiga vam nije izdata.\n");
							} else {
								System.out.printf(" Korisnik " + account.get(indexAccount).userName
										+ " je uspjesno vratio knjigu pod nazivom " + book.get(indexBook).nameBook
										+ "\n");
								for (int i = 0; i < useBook.size(); i++) {
									if (useBook.get(i).numberAccount == numberAccount
											&& useBook.get(i).numberBook == numberBook) {
										useBook.remove(i);
										book.get(indexBook).statusBook = false;
										account.get(indexAccount).numberUseBook--;
										isValid = true;
									}
								}
							}
						} else {
							throw new Exception();
						}
					} catch (Exception e) {
						System.out.printf("Unijeli ste nepostojeci broj racuna ili knjige.\n");
						input.nextLine();
						break;
					}
				} while (isTrue);

				break;

			case 5:

				System.out.printf("Detalji o svim racunima:\n ");
				if (account.size() == 0) {
					System.out.printf(" Nijedan racun jos nije kreiran.\n");
				}
				for (int i = 0; i < account.size(); i++) {
					System.out.printf(account.get(i).toString());
				}

			case 6:

				System.out.printf(" Podaci o svim knjigama u biblioteci:\n ");
				if (account.size() == 0) {
					System.out.printf("Nijedna knjiga nije kreirana!\n");
				}
				for (int i = 0; i < book.size(); i++) {
					System.out.println(book.get(i).toString());
				}

			case 7:
				System.out.printf(" Hvala na posjeti!\n");
				System.exit(0);

				break;

			}
		} while (isTrue);
	}

}
