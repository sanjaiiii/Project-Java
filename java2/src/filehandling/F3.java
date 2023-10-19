package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class F3 {

	public static void main(String[] args) throws IOException {
		
		//Reading the lines of a created file
		
//Here Everything is same like file writing but instead of writer use..
//..(reader)here 
		
//Even the Syntax is also the same but remember instead of using..
//..writer use (reader) here like FileReader, BufferedReader
		
	
		
		
		File f=new File("C:\\Eclipse\\java\\src\\filehandling\\s.txt");
		FileReader fr=new FileReader(f);
		BufferedReader bfr=new BufferedReader(fr);
		
		//Remember While loop
		String line;//Initialization
		while((line=bfr.readLine())!=null)//While(condition)
		{System.out.println(line);
		}
		
		//look how it works
		
		//bfr reads the first line   line=hi    line!=null  hi!=null ---> print hi
		//bfr reads the 2ndline   line=hello    line!=null  hello!=null ---> print hi
		//bfr reads nothing now   line=null //here the loop terminated
		
		//--->applicable for only txt files
	}

}
