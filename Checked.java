package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked {
	public static void main(String args[]) {
		try {
			FileInputStream fs = new FileInputStream("ab.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
