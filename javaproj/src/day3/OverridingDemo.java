package day3;

class Parent2{
	void breakFast() {
		System.out.println("Idli");
	}
	void Vehicle() {
		System.out.println("Hyundai");
	}
}
class Childe2 extends Parent2{
	void breakFast() {
		super.breakFast();
		System.out.println("Maggie");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		Childe2 c = new Childe2();
		c.breakFast();
		c.Vehicle();

	}

}
