package stringBufferBuilder;

// 				StringBuffer : they are mutable  | StringBuilder
//==================================================================================================
// difference between SBF and SBL is that SBF is thread safe and SBL is not, meaning, when one thread is accessing 
// a string the other thread cannot access the same string

public class SBFMethod {
	public static void main(String args[]) {

//append
		StringBuffer sbf1 = new StringBuffer("Mello");
		sbf1.append(" Drama");
		System.out.println(sbf1);
		
//insert
	StringBuffer sbf = new StringBuffer("Hello");
	sbf.insert(1, "ysteresis");
	System.out.println(sbf);
	
//replace
	sbf.replace(1, 4, "ero");
	System.out.println(sbf);
//delete
	sbf1.delete(5, 11);
	System.out.println(sbf1);
	
	
//reverse
	sbf1.reverse();
	System.out.println(sbf1);
	sbf1.reverse();
	System.out.println(sbf1);
	
// String builder- this is method
	StringBuilder sbl =  new StringBuilder("Manisha");
	sbl.append(" Katiyar");
	System.out.println(sbl);
	
	}

}
