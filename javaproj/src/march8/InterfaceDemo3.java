package march8;


interface Vehicle1 {
	int speedLimit = 180;
	void wheel();
}
interface Engine extends Vehicle1{
	int speedLimit = 200;
	void engine();
}

class TestDrive {
	void drive() {
		System.out.println("Test drive");
	}
}

class Car1 extends TestDrive implements Engine {

	@Override
	public void wheel() {
		System.out.println("Its has 4 wheels");
		System.out.println(Vehicle1.speedLimit);
		System.out.println(Engine.speedLimit);
		
		
	}

	@Override
	public void engine() {
		System.out.println("Petrol engine");
		
	}
	
}
public class InterfaceDemo3 {

	public static void main(String[] args) {
		Car1 c = new Car1();
		c.drive();
		c.wheel();
		c.engine();

	}

}
