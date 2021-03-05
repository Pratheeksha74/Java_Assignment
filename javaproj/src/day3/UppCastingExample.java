package day3;

class Account {
	void minBalance() {
		System.out.println("Set the minimum balance");
	}
}

class Current extends Account {
	void minBalance() {
		System.out.println("Balance is 25,000");
	}
}

class Savings extends Account {
	void minBalance() {
	System.out.println("Balance is 10,000");
	}
}

public class UppCastingExample {
	public static void main(String args[]) {
	Account a = new Current();
	a.minBalance();
	}
}
