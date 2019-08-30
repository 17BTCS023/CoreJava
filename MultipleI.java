package Java_Basics;

interface K{
	void mm1();
}
interface J{
	void mm2();
}

public class MultipleI implements K,J{
	
	public void mm1()
	{
		System.out.println("From interface Aaam");
	}
	public void mm2()
	{
		System.out.println("Form interface Jaam");
	}
	public static void main(String args[]) {
		MultipleI m = new MultipleI();
		m.mm1();
		m.mm2();
	}
}


