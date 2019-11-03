// 			Lambda Expression and Anonymous class
//======================================================================================================

/*A class that is not being declared, whose object is used only once, has only one method - Inefficient
Use Anonymous class- At the place of declaring object, write the whole code of the method
*/

public class Lambda_Expression_MT {
public static void main(String args[]) {
		Thread t1 = new Thread( () -> {
			for(int i =0; i <5 ; i++) {
				Thread.yield();
				System.out.println("Hello");
				try{Thread.sleep(500);} catch(Exception e){} // Handling Interrupted Thread exception
			}
		}	);
		Thread t2 = new Thread( ()->{
			for(int i =0; i <5 ; i++) {
				Thread.yield();
				System.out.println("Hi");
				try{Thread.sleep(500);} catch(Exception e){}
			}
		}	);
		t2.start();
		try{Thread.sleep(10);} catch(Exception e){}
		t1.start();
		
		System.out.println("Bye");
		
		
}
}

