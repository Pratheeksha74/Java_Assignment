package day8;

class Anu extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Anu "+ i);
		}
	}
}

class Ani extends Thread {
	public void run() {
		for(int i=10;i<20;i++) {
			System.out.println("Ani "+ i);
		}
	}
}

class Ashu extends Thread {
	public void run() {
		for(int i=20;i<30;i++) {
			System.out.println("Ashu "+ i);
		}
	}
}

public class MultitaskingDemo {

	public static void main(String[] args) {
		Anu anu = new Anu();
		Ani ani = new Ani();
		Ashu ashu = new Ashu();
		
		anu.start();
		ani.start();
		ashu.start();

	}

}
