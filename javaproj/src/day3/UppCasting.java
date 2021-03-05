package day3;

class Bank {
	void rateOfInterest() {
		System.out.println("Not yest assigned");
	}
}

class Sbi extends Bank {
	void rateOfInterest() {
		System.out.println("SBI 4%");
	}
}

class Axis extends Bank {
	void rateOfInterest() {
		System.out.println("Axis 7%");
	}
}

public class UppCasting {

	public static void main(String[] args) {
		Bank sbi = new Axis();
		sbi.rateOfInterest();
	}

}
