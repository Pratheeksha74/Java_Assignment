package day9;

class BankBalance {
	
	synchronized void doTransaction(int time) { //method synchronization 
		for(int i=0;i<time;i++) {
			System.out.println(Thread.currentThread().getName()+" ");
		}
	}
}

class Transaction extends Thread{
	BankBalance bb = new BankBalance();
	public void run() {
		bb.doTransaction(5);
	}
}

public class DepositWithdraw {

	public static void main(String[] args) {
		Transaction t = new Transaction();
		
		Thread deposit = new Thread(t);
		Thread withdraw = new Thread(t);
		
		deposit.setName("Deposit");
		withdraw.setName("Withdraw");
		
		deposit.start();
		withdraw.start();

	}

}
