package library.app;

public class Account {

	int numberAccount;
	String userName;
	int numberUseBook;

	public Account() {
		
	}

	public Account(int numberAccount, String userName, int numberUseBook) {
		
		this.numberAccount = numberAccount;
		this.userName = userName;
		this.numberUseBook = numberUseBook;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getNumberUseBook() {
		return numberUseBook;
	}

	public void setNumberUseBook(int numberUseBook) {
		this.numberUseBook = numberUseBook;
	}

	@Override
	public String toString() {
		return " Korisnik " + userName + " sa brojem racuna " + numberAccount + " ima posudenih knjiga:" + numberUseBook
				+ "\n";
	}

}
