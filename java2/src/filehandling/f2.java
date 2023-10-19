package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class f2 {

	public static void main(String[] args) throws IOException {
		//creating and writing on a file

		File f=new File("C:\\Eclipse\\java\\src\\filehandling\\s2.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bfw= new BufferedWriter(fw);
		

		bfw.write("dei mental");
		bfw.newLine();
		bfw.write("poda ##");
		bfw.close();

		
	}

}
