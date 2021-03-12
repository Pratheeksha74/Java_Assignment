package Lab;

/* Validate the age of a person and display proper message by using user defined exception.
 *  Age of a person should be above 15.
 */

class AgeException extends RuntimeException {
	public AgeException(String msg) {
		super(msg);
	}
}

public class Lab_5_1 {
	
	public void checkAge(int age) throws AgeException {
		if(age < 15) 
			throw new AgeException("You must be above 15.");
		else 
			System.out.println("You are above 15.");
	}
	public static void main(String[] args) throws AgeException {
		Lab_5_1 obj = new Lab_5_1();
		obj.checkAge(20);
	}

}
