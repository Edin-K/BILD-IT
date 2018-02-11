package banking.app;

/***************************************************
*                     Account                      *
*--------------------------------------------------*
* -id: int                                         *
* -name: String                                    *
* -deposit: double                                 *
* -------------------------------------------------*
* +Account()                                       *
* +Account(id: int, name: String, deposit: double) *
* +getId(): int                                    *
* +setId(id: int)                                  *
* +getName(): String                               *
* +setName(name: String)                           *
* +getDeposit(): double                            *
* +setDeposit(deposit: double) 	                   *
***************************************************/


public class Account {

	int id; // broj racuna
	String name; // ime vlasnika racuna
	double deposit; // iznos na racunu

	public Account() {

	}

	public Account(int id, String name, double deposit) {

		this.id = id;
		this.name = name;
		this.deposit = deposit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

}
