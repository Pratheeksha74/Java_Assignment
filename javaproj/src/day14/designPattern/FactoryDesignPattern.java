package day14.designPattern;

interface Car {
	void capacity();
}

class HatchBack implements Car{

	@Override
	public void capacity() {
		System.out.println("4 people");
		
	}	
}

class Van implements Car {

	@Override
	public void capacity() {
		System.out.println("6 people");
		
	}
	
}

class Suv implements Car {

	@Override
	public void capacity() {
		System.out.println("4 comfortable");
		
	}
	
}

class CarFactory {
	Car getCar(String type) {
		if(type.equalsIgnoreCase("hatchBack")) {
			return new HatchBack();
		} else if(type.equalsIgnoreCase("Van")) {
			return new Van();
		} else if(type.equalsIgnoreCase("suv")) {
			return new Suv();
		}
		return null;
	}
}

public class FactoryDesignPattern {

	public static void main(String[] args) {
		CarFactory cf = new CarFactory();
		Car car = cf.getCar("suv");
		car.capacity();

	}

}
