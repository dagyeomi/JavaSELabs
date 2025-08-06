package workshop.account.entity;

public class account {
	private String custID;
	private String acctID;
	private int balance;
	
	public void setBalance(int balance) {
		this.balance = balance;
		
	}
	
	public int getBalance() {
		return balance;
	}

	public String getCustID() {
		return custID;
	}

	public void setCustID(String custID) {
		this.custID = custID;
	}

	
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
	
	public String getAcctId() {
		return acctId;
	}
	
	//입금
	public void deposit(int amount) {
		this.balance += amount;
	}
	//출금
	public void withdraw(int amount) {
		this.balance -= amount;
	}
	
}
