package exceptionHandling;

import java.util.Scanner;

//							Unchecked exception= Runtime exception
//========================================================================================

class Test{
	public void cream(int x, int y) {
		
		try{
			int z = x/y;
			
		}
		catch(ArithmeticException ae) {
			System.out.println("Not good input");
		}
	}
}

public class Unchecked {
		public static void main(String args[]) {
			//System.out.println(10/0);
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			int b = scan.nextInt();
			Test obj = new Test();
			obj.cream(a,b);

		}
	
}
