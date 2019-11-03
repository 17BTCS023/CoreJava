
// 						MultiThreading
//----------------------------------------------------------------------------------------------------

// This is the second way of creating a thread, using Runnable interface 
// Runnable interface does not have an .start() function
class Hello1 {
	public void run() {
		for(int i =0; i <10 ; i++) {
			System.out.println("User Thread");
		}
	}
}

public class Runnable_Implementation implements Runnable {

	public static void main(String args[]) {
		Hello1 h = new Hello1();
		h.run();
		for(int i =0; i <10 ; i++) {
			System.out.println("Hey! This is the Main Thread");
		}
	}
}
