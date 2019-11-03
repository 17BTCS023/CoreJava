
// 						MultiThreading
//=======================================================================================================
// One main thread have many sub threads to divide work load

class Apple extends Thread{
	
	public void run() {
		
		for(int i =0; i <5 ; i++) {
			System.out.println("Hi! This is thread");
		}
	}
}

public class ThreadExtension {
	public static void main(String args[]) {
		Apple a = new Apple();
		a.start();    // A new thread gets created
		for(int i = 0; i <5 ; i++) {
			System.out.println("Main Thread");
		}
	}
	
	
}
