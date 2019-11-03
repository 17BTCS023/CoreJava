// 1. using pipleline we can catch many exceptions using single catch

//							Unchecked Exception
public class Pipeline_ {
	public static void main(String args[]) {
		try {
			System.out.println("hello");
			System.out.println(10/0);
		}
		catch(NullPointerException|ArithmeticException e) {
			System.out.println(e);
		}
		catch(ClassCastException|ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	
	
	
}
