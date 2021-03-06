package day5;


class Bank {
	void rateOfInterest() {
		System.out.println("Not yest assigned");
	}
	static void display() {
		System.out.println("This is parent");
	}
}

class Sbi extends Bank {
	void rateOfInterest() {
		System.out.println("SBI 4%");
	}
	static void display() {
		System.out.println("This is SBI");
	}
}

class Axis extends Bank {
	void rateOfInterest() {
		System.out.println("Axis 7%");
	}
	static void display() {
		System.out.println("This is Axis");
	}
}

public class UppCastingDemo {

	public static void main(String[] args) {
		Bank a = new Sbi();
		a.rateOfInterest();
		a.display();

	}

}
