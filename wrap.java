package Java_Basics;

//					Wrapper classes are used to convert the primitive data types into object
// ----------------------------------------------------------------------------------------------------------------
// 1. let us convert a primitive type to an Object:(Used to store them in data structures)
class p2w{
	void displayInt() {
		int x = 10; 
		Integer y = Integer.valueOf(x);  // called as boxing
		System.out.println(x + "<- value of x & value of y->"+ y);
		
	}
	void displayChar() {
		char c = 'M';
		Character d = Character.valueOf(c);
		System.out.println(c + "<- value of x & value of y->"+ d);
	}
}

//2. converting the Objects into Primitive types

class w2p{
	void displayInt() {
		Integer p = 10;,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
		int i = p.intValue();
		System.out.println(i+" "+p);
	}
}

public class wrap {
	public static void main(String args[]) {
		w2p a1 = new w2p();
		p2w a2 = new p2w();
		a1.displayInt();
		a2.displayChar();
		a2.displayInt();
	}
	}


