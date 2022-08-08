package Generics;
// Traditional class
class Mydata{
	Integer i;
	public void add(Integer i1) {
		i = i1;
	}
	public Integer get() {
		return(i);
	}
}
// Generic Class
class Genericdata<T>{ //T is non-primitive data type: takes data type of obj reference
	T j; //j is the object of data-type T
	public void addnew(T j1) {
		j = j1;
	}
	public T getnew() {
		return(j);
	} 
}


public class Genericclass {

	public static void main(String[] args) {
		// traditional class implementation; only single data-type operation allowed
		Mydata data = new Mydata();
		data.add(5);
		System.out.println(data.get()); 
		//generic class implementation; all obj reference data-types allowed
		//example 1 of Generic class: using integer data type 
		Genericdata<Integer> data2 = new Genericdata<>();
		data2.addnew(44);
		System.out.println(data2.getnew());
		//example 2 of Generic class: using String data type
		Genericdata<String> data3 = new Genericdata<>();
		data3.addnew("Raushan is happy");
		System.out.println(data3.getnew());
	}

}
