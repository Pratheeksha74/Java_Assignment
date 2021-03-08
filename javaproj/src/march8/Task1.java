package march8;

class Cars {
	private int yearModel;
	private String make;
	private int speed;
	Cars(int yearModel, String make) {
		this.yearModel = yearModel;
		this.make = make;
		this.speed = 0;
	}
	public int getYearModel() {
		return yearModel;
	}
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void accelerate() {
		speed += 5;
	}
	void brake() {
		speed -= 5;
		if(speed < 0) 
			speed = 0;
	}
}

public class Task1 {

	public static void main(String[] args) {
		Cars c = new Cars(1965, "Bat Mobile");
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		System.out.println("===============================");
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());

	}

}
