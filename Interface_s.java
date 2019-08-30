package Java_Basics;


	interface Apple {
		void print();
	}
	public class Interface_s implements Apple{
	
		public void print(){
			System.out.println("I am a method inside interface Apple \n"
					+ "But I am being defined insede a class Interface_s");
		}
		public static void main(String args[]) {
			Interface_s b = new Interface_s();
			b.print();
		
	}
}
