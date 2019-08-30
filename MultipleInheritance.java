package Java_Basics;

interface K{
	void mm1();
}
interface J{
	void mm2();
}

class MultipleInheritance1 implements K,J{
	
	public void mm1{
		System.out.println("From interface Aaam");
	}
	public void m2{
		System.out.println("Form interface Jaam");
	}
	public static void main(String args[]) {
		MultipleInheritance1 m = new MultipleInheritance1();
		m.m1();
		m.m2();
	}

}
