import java.io.FileInputStream;
import java.io.FileNotFoundException;

//										Checked Exception
// ----------------------------------------------------------------------------------------------------------------------

public class PipelineChecked {
	public static void main(String args[]) {
		try {
			System.out.println("hello");
			FileInputStream fs = new FileInputStream("ab.txt");
			Thread.sleep(1000);// if this statement is not there, there will be an exception
		}
		catch(FileNotFoundException|InterruptedException e) {
			System.out.println(e);
		}
}
}
