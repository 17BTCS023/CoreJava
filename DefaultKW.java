package Java_Basics;

interface A{
	void m1();
	default void m2(){
		System.out.println("\n\nI am the default method\n. Interfaces are a collection of undefined methods.\n They can also have defined methods using the keyword 'Default'");
	}
}
class Guy implements A{
	public void m1(){
		System.out.println("Implementing an interface");
	}
}

public class DefaultKW {
	public static void main(String args[]) {
		Guy g = new Guy();
		g.m1();
		g.m2();
	}
}
