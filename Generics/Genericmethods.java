package Generics;

public class Genericmethods {
	public <E> void printArray(E[] a) {
		for(E x:a) {
			System.out.println(""+x);
		}
	}

	public static void main(String[] args) {
		Genericmethods e1 = new Genericmethods();
		String[] countries = new String[] {"India", "Nepal", "Bhutan", "China"};
		Integer[] rank = new Integer[] {1,3,4,2};
		e1.printArray(countries);
		e1.printArray(rank);

	}

}
