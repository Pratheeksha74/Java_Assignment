package day4.exception;

public class ThrowDemo {
	
	void checkEligibility(int age) {
		if(age < 18) {
			throw new ArithmeticException("You cannot vote");
		} else {
			System.out.println("You can vote");
		}
	}
		
	public static void main(String[] args) {
		//System.out.println("Start");
		//throw new ArithmeticException("I have thrown a new Exception");
		ThrowDemo t = new ThrowDemo();
		t.checkEligibility(2);
	}

}
