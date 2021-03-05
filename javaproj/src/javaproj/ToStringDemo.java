package javaproj;

class Car{
	int year;
	String BrandName;
	Car(int year, String BrandName) {
		this.year = year;
		this.BrandName = BrandName;
	}
	public String toString() {
		return "Year = "+ year + " Brand Name = "+BrandName;
	}
}
public class ToStringDemo {

	public static void main(String[] args) {
		Car c1 = new Car(1995, "Maruthi Suzuki");
		Car c2 = new Car(2006, "Hyundaij");
		System.out.println(c1);
		System.out.println(c2);

	}

}
