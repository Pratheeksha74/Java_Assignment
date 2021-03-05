package day3;

class Demo{
	void details() {
		System.out.println("This is default");
	}
	void details(int modelNumber) {
		System.out.println("You are searching with a model number "+modelNumber);
	}
	void details(int modelNumber, String BrandName) {
		System.out.println("You are searching with a model number "+modelNumber+" and brand name "+BrandName);
	}
	void details(String BrandName) {
		System.out.println("Brand Name "+BrandName);
	}
	void details(String BrandName, int ModelNumber) {
		System.out.println("Brand Name "+ BrandName+" Model Number "+ModelNumber);
	}
	
}

public class OverloadingDemo {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.details("Samsung");
	}

}
