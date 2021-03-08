package march8;

@FunctionalInterface
interface Test {
	abstract void display();
//	static void display2() {
//		
//	}
//	default void display3() {
//		
//	}
}

@FunctionalInterface
interface Calculate {
	int operation(int a,int b);
}

public class FunctoinalInterfaceDemo1 {

	public static void main(String[] args) {
		Test t = ()->System.out.println("This is display method");
		t.display();
		Test t2 = ()->
		{
			System.out.println("This is multi line");
			System.out.println("This is display");
		};
		t2.display();
		System.out.println("===================================");
		//void return type for opration
//		Calculate c = (a,b)->System.out.println("Result "+(a+b));
//		c.operation(4, 5);
		
		Calculate add = (a,b)->(a+b);
		Calculate sub = (a,b)->(a-b);
		System.out.println(add.operation(5, 1));
		System.out.println(sub.operation(6, 1));
	}

}
