package library.app;

public class Book {

	int numberBook;
	String nameBook;
	boolean statusBook;

	public Book() {

	}

	public Book(int numberBook, String nameBook, boolean statusBook) {

		this.numberBook = numberBook;
		this.nameBook = nameBook;
		this.statusBook = statusBook;
	}

	public int getNumberBook() {
		return numberBook;
	}

	public void setNumberBook(int numberBook) {
		this.numberBook = numberBook;
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public boolean isStatusBook() {
		return statusBook;
	}

	public void setStatusBook(boolean statusBook) {
		this.statusBook = statusBook;
	}

	@Override
	public String toString() {

		if (statusBook) {
			return  " Ime knjige " + nameBook + " pod rednim brojem " + numberBook + " izdata "+ "\n";
		}else{
			return  " Ime knjige " + nameBook + " pod rednim brojem " + numberBook + " nije izdata "+ "\n";
			
		}
	}

}
