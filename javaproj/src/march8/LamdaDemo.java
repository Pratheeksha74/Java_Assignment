package march8;

interface Eligibility {
	String checkAge(int age);
}

public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eligibility e1 = (age)->
		{
			if(age < 18)
				return "You cannot vote";
			return "You can vote";
		};
		System.out.println("Result = "+e1.checkAge(3));
	}

}
