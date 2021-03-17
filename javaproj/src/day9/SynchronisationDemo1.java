package day9;

class WaterBottel {
	public void drinking(int time) {
		
		synchronized(this) { //block synchronization
			for(int i=1;i<=time;i++) {
				System.out.println(Thread.currentThread().getName()+" is drinking "+i);
			}
		}
		
		for(int i=1;i<=time;i++) {
			System.out.println(Thread.currentThread().getName()+" is eating "+i);
		}
	}
}

class MyClass extends Thread {
	WaterBottel wb = new WaterBottel();
	public void run() {
		wb.drinking(5);
	}
}

public class SynchronisationDemo1 {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		
		Thread t1 = new Thread(mc);
		Thread t2 = new Thread(mc);
		
		t1.setName("Sachin");
		t2.setName("Rahul");
		
		t1.start();
		t2.start();
	}

}
