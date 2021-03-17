package day9;

class Engagement extends Thread {
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class Marriage extends Thread {
	public void run() {
		for(int i=10;i<=15;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class Family extends Thread {
	public void run() {
		for(int i=10;i<=15;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}


public class ThreadDemo {

	public static void main(String[] args) {
		Engagement e = new Engagement();
		Marriage m = new Marriage();
		Family f = new Family();
		
		e.start();

	}

}
