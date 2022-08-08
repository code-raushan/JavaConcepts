package Generics;

public class genericmethodspractice {
	public <E> void printArray(E[] a){ //E is a non-primitive data type.
		for(E x:a) { //Loop method
			System.out.println(""+x);
		}
	}

	public static void main(String[] args) {
		genericmethodspractice m1 = new genericmethodspractice();
		Integer[] num = new Integer[] {2,4,5,7};
		m1.printArray(num);
		String[] str = new String[] {"China", "India", "Russia", "Japan"};
		m1.printArray(str);

	}

}
