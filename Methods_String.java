package stringsMethod;

// 26th August 2019

// 	All the methods of the Strings
//=============================================================================

public class Methods_String {
	public static void main(String args[]) {
// 1. + operator
	
	String s1= "Manisha"+ " Katiyar";
	String s2 = 10+20 + "Oreo" + 30;
	System.out.println(s1);
	System.out.println(s2);
	
// 2. concat() method
	
	String a = "Hello";
	String b = "World!";
	System.out.println(a.concat(b));
	
// 3. SubString
	
	String c = a+b;
	System.out.println(c.substring(5));
	System.out.println(c.substring(0, 6));
// 4. toUpperCase
	
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());

// 5. trim -  removes the white space
	
	String d = "                            Doggy";
	System.out.println(d);
	System.out.println(d.trim());
	
	
// 6. startsWith(), endsWith()  - gives a boolean value
	System.out.println(a.startsWith("H"));  // it is case sensitive
	System.out.println(a.endsWith("o"));
	
// 7. charAt()
	System.out.println(s1.charAt(0));
	System.out.println(s1.charAt(8));
// 8. length()
	System.out.println(s1.length()+ s2.length());
// 9. replace()
	System.out.println(s1.replace("Manisha", "Vikash"));
	System.out.println(s1.replaceAll(s1, "Hi"));
	System.out.println(s1);
	System.out.println("\n"+s1.contains("sha"));
	System.out.println("\n"+s1.indexOf("a", 4));

}
}
