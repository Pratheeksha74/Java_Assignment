package day4.exception;

class LateException extends RuntimeException {
	public LateException(String msg) {
		super(msg);
	}
}

class Employee {
	public void login(int time) throws LateException {
		if(time <= 9) {
			System.out.println("Your are present");
		} else {
			throw new LateException("You are absent");
		}
	}
}

public class CustomException1 {

	public static void main(String[] args) throws LateException {
		Employee e = new Employee();
		e.login(11);

	}
}
