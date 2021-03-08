package march8;
class SavingsAccount{
	private int balance;
	private int interest;
	public SavingsAccount(int balance, int interest) {
		this.balance = balance;
		this.interest = interest;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
		//return balance;
	}
	public void deposit(int amount) {
		balance += amount;
		//return balance;
	}
	public int interest() {
		balance += balance * interest/100;
		return balance;
		
	}
}
public class TesterClass {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(1000,4);
		System.out.println("Your balance : "+sa.interest());
		sa.deposit(3000);
		System.out.println("Your balance: "+sa.interest());
		sa.withdraw(200);
		System.out.println("Your balance: "+sa.interest());	
	}

}
