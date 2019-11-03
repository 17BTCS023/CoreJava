
class Fly extends Thread{
	public void run() {
		{	for(int i = 0; i < 5; i++) {
			System.out.println("User Thread");
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}
}

public class Join_Method {
	public static void main(String args[]){
		Fly f= new Fly();
		f.start();
		try {
			f.join();	
			}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		for(int i = 0; i < 5; i++) {
			System.out.println("User Thread");
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
		
	}
	
	
}
