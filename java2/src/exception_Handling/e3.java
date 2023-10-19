package exception_Handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class e3 {

	public static void main(String[] args) //throws IOException 
	{

    /*throws
     * Syntax: throws exceptionname (in mainmethod)
     *
     * To use this u must know the exceptionname
     * 
     * (Note:uncommented the throws keyword to show you the error.)
	*/
		

	File f=new File("C:\\Eclipse\\java\\src\\filehandling\\s.txt");
	FileWriter fw=new FileWriter(f);
	BufferedWriter bfw=new BufferedWriter(fw);
	}	


}

