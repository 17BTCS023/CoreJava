
public class TryCatch {
	public static void main(String args[]) {
		try {
			System.out.println(10/0);
		}
		catch(NullPointerException e) {   // if Exception e is taken first it will give an error, the parent is only allowed after child
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
