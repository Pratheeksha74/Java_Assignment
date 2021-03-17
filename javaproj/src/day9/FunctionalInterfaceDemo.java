package day9;

@FunctionalInterface
interface Demo {
	void add(int a,int b);
}

@FunctionalInterface
interface Demo2 { 
	int sub(int a,int b);
}

interface Demo3 {
	String largest(int a,int b);
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Demo d1 = (a,b)->System.out.println("Addition of a and b is "+a+b);
		d1.add(2, 4);
		
		Demo2 d2 = (a,b)->a-b;
		System.out.println("Subtraction "+d2.sub(6, 3));
		
		Demo3 d3 = (a,b)->
		{
			if(a>b)
				return a+" is greater than "+b;
			return b+" is greater than "+a;
		};
		System.out.println(d3.largest(5, 6));
	}

}
