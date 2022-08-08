package Generics;

public class practice {
	public <E> void printArray(E[] a) {		
		for(E x:a) {
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		practice p1 = new practice();
		Integer[] numbers = new Integer[]{1,2,3,4,5,6,7};
		p1.printArray(numbers);
		String[] countries = new String[] {"USA", "Russia", "China", "India"};
		p1.printArray(countries);
		practice p2 = new practice();
		Integer[] num = new Integer[] {767, 7565, 98, 45};
		p2.printArray(num);
		
		
		
		
	}

}
