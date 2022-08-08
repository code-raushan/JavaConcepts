package Multithreading;
// Runnable Implementation
class A implements Runnable{
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("Thread A"+i);
		}
	}
}
class B implements Runnable{
	public void run() {
		for(int j=0; j<=10; j++) {
			System.out.println("Thread B"+j);
		}
	}
}

public class runnableimpl {

	public static void main(String[] args) {
		Thread t1 = new Thread(new A());
		Thread t2 = new Thread(new B());
		t1.start();
		t2.start();
	}

}
