package march8;

interface Bank {
	abstract void rateInterest();
	int workingDays = 27;
	
}

interface Loan {
	abstract void creditLimit();
}

class SBI implements Bank, Loan {
	public void rateInterest() {
		System.out.println("4% rate of interest");
		System.out.println("Working days "+workingDays);
	}
	public void creditLimit() {
		System.out.println("Upto 1crore for current account");
	}
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		Bank b = new SBI();
		b.rateInterest();
		System.out.println("===========================");
		SBI s = new SBI();
		s.creditLimit();
		s.rateInterest();
	}

}
