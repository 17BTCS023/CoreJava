package Java_Basics;

public class Method_Chaining {
	private String CandyName;
	private int ExpDate;
	
	public Method_Chaining setName(String Candy) {
		this.CandyName=Candy;
		return this;
	}
	public Method_Chaining setDate(int Date) {
		this.ExpDate=Date;	
		return this;
	}
	
	public Method_Chaining display() {
		System.out.println("The candy is "+ CandyName+ " Eat it before: "+ 	ExpDate);
		return this;
	}
	public static void main(String args[]) {
		Method_Chaining Ayeo = new Method_Chaining();
		Ayeo.setName("Kit Kat ").setDate(2020);
	}
	
}
