package objects2;

public class Account {

	// 속성(필드)
	public int balance;
	public final int MIN_BALANCE = 0;
	public final int MAX_BALANCE = 1000000;

	// 생성자

	// 기능(메소드)

	public int getBalance() {
		if (balance > MIN_BALANCE && balance < MAX_BALANCE) {
		}
		return balance;
	}

	public void setBalance(int balance) {
		if (balance > MIN_BALANCE && balance < MAX_BALANCE) {
			this.balance  = balance;
		}
	}

}
