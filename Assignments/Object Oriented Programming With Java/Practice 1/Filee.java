import java.io.*;
public class Filee {

	public static void main(String[] args) {
		
		try {
			FileReader f = new FileReader("abc.txt");
		}
		
		catch(FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
