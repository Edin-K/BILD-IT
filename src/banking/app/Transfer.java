package banking.app;

import java.util.ArrayList;

/***************************************************
*                    Transfer                      *
*--------------------------------------------------*
* -sourceAccount: int                              *
* -targetAccount: int                              *
* -money: double                                   *
* -------------------------------------------------*
* +Target()                                        *
* +Target(sourceAccount: int,targetAccount: int  , *
* money: double)                                   *
* +getSourceAccount(): int                         *
* +setSourceAccount(sourceAccount: int)            *
* +getTargetAccount(): int                         *
* +setTargetAccount(targetAaccount: int)           *                    
* +getMoney(): double                              *
* +setMoneyt(money: double) 	                   *
***************************************************/

public class Transfer extends Account {

	int sourceAccount; // broj racuna sa kojeg se prebacuje novac
	int targetAccount; // broj racuna na koji se prebacuje novac
	double money; // iznos koji se prebacuje

	public Transfer() {
		super();
	}

	public Transfer(int sourceAccount, int targetAccount, double money) {

		this.sourceAccount = sourceAccount;
		this.targetAccount = targetAccount;
		this.money = money;
	}

	public Transfer(int id, String name, double deposit, int sourceAccount, int targetAccount, double money) {
		super(id, name, deposit);
		this.sourceAccount = sourceAccount;
		this.targetAccount = targetAccount;
		this.deposit = deposit;
	}

	public int getSourceAccount() {
		return sourceAccount;
	}

	public void setSourceAccount(int sourceAccount) {
		this.sourceAccount = sourceAccount;
	}

	public int getTargetAccount() {
		return targetAccount;
	}

	public void setTargetAccount(int targetAccount) {
		this.targetAccount = targetAccount;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	public static void transfer(ArrayList<Account> account, int sourceAccount, int targetAccount, double money) {

		boolean isTrue = true;

		for (int i = 0; i < account.size(); i++) {
			if (account.get(i).getId() != targetAccount && !isTrue) {


			}

		}
		for (int i = 0; i < account.size(); i++) {
			if ((account.get(i).getId() == sourceAccount) && isTrue && (account.get(i).getDeposit() >= money)) {
				int sub = (int) (account.get(i).getDeposit() - money);
				account.get(i).setDeposit(sub);
			}
		}
		for (int i = 0; i < account.size(); i++) {
			if ((account.get(i).getId() == targetAccount) && isTrue && (account.get(i).getDeposit() >= money)) {
				int add = (int) (account.get(i).getDeposit() + money);
				account.get(i).setDeposit(add);
			}
		}

	}
}




