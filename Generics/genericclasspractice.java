package Generics;
//Traditional Class
class Name {
	public String name;

	Name(String name){
		this.name = name;
	}
	void printName() {
		System.out.println(name);
	}
}
//Generic Class
class GenericName<T>{
	T name;
	GenericName(T name){
		this.name = name;
	}
	public void printName() {
		System.out.println(name);
	}
	public T print() { //Another implementation for function data type in Generic Class.
		return(name);
	}
}
public class genericclasspractice {

	public static void main(String[] args) {
		//Traditional Class's object creation and implementation
		Name n = new Name("Raushan Kumar");
		n.printName();
		//Generic Class's object creation and implementation.
		GenericName <Integer>g = new GenericName<>(55);
		g.printName();
		GenericName <String> gStr = new GenericName<String>("Raushan is my name"); 
		//In object creation reference, <String> or <T> is optional.
		gStr.printName();
		System.out.println(gStr.print());
		
		

	}

}
