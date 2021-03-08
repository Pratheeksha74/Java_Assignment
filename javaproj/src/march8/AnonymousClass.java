package march8;

class Bank2 {
	void rateInterest() {
		System.out.println("5% roi");
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
		Bank2 b = new Bank2()
		{
			void rateInterest() {
				System.out.println("7% ROI");
			}
		};
		b.rateInterest();

	}

}
