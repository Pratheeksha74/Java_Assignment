package march8;

interface College {
	void department();
	
	default void Lab() {
		System.out.println("This is default Lab");
	}
	
//	default void display2() {
//		System.out.println("This is default method 2");
//	}
}
class Mech implements College {

	@Override
	public void department() {
		System.out.println("Department");
		
	}
	public void Lab() {
		System.out.println("It is a must");
	}
	
}

public class InterfaceNewFeature {

	public static void main(String[] args) {
		Mech m = new Mech();
		m.department();
		m.Lab();

	}

}
