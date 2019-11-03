
//		 		Yield() method in class Thread
//===========================================================================
// If one thread calls the yield function then it allows the other Thread to execute
// which has the same priority


class Poppy extends Thread{
	public void run()
	{	for(int i = 0; i < 5; i++) {
		Thread.yield();
		System.out.println("Child Thread");
	}
	}
}


public class Yield_Method {
	public static void main(String args[]) {
		Poppy p1 = new Poppy();
		p1.start();
		for(int i = 0; i <5; i ++) {
			System.out.println("Main Thread");
		}
	}
}
