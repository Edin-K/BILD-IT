package library.app;

import java.util.Date;

public class UseBook {
	
	int numberAccount;
	int numberBook;
	Date date; // datum posudivanja 
	public UseBook() {
		
	}
	public UseBook(int numberAccount, int numberBook, Date date) {
		
		this.numberAccount = numberAccount;
		this.numberBook = numberBook;
		this.date = date;
	}
	public int getNumberAccount() {
		return numberAccount;
	}
	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}
	public int getNumberBook() {
		return numberBook;
	}
	public void setNumberBook(int numberBook) {
		this.numberBook = numberBook;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

}
