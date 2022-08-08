package Multithreading;
//Every thread has a priority. Threads with higher priority are executed in preference to 
//  threads with lower priority. 
// Thread Class Implementation
class C extends Thread{
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("i= "+i+" Thread A");
		}
	}
}
class D extends Thread{
	public void run() {
		for (int i=0; i<=10; i++) {
			System.out.println("i= "+i+" Thread B");
		}
	}
}
class E extends Thread{
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("i="+i+" Thread C");
		}
	}
}
public class classimpl {

	public static void main(String[] args) {
		//1. Creating thread
		//2. Attach code to the Thread
		//3. Executing Threading
		C o1 = new C();
		o1.start();
		D o2 = new D();
		o2.start();
		E o3 = new E();
		o3.start();
		
		

	}

}
