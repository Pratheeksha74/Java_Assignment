package march8;


interface Vehicle {
	abstract void numberOfWheels();
}

class Bike implements Vehicle {

	@Override
	public void numberOfWheels() {
		System.out.println("It has 2 wheels");	
	}
}

class Car implements Vehicle {

	@Override
	public void numberOfWheels() {
		System.out.println("Car has 4 wheels");		
	}	
}

class Bus implements Vehicle {

	@Override
	public void numberOfWheels() {
		System.out.println("Bus has 8 wheels");		
	}	
}
public class nterfaceDemo2 {

	public static void main(String[] args) {
		Vehicle v = new Bus();
		v.numberOfWheels();

	}

}
