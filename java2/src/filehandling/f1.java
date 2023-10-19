package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class f1 {

	public static void main(String[] args) throws IOException {
		
		
		//creating and writing on a file
		
		//1.First create a file
		//2.Then write into it
				
//File              : reach the path    : pass path of the file 
//FileWriter        : create a file      : pass file object as input
//BufferedWrter     : write content      : pass filewriter object as input
		
//To create a file..Syntax is
	//-->File name = new File("Path of the file");
	//-->FileWriter name = new FileWriter();
	//-->BufferedWriter name = new BufferedWriter();
				
// It's non-static in nature, so create it
		
		
		 //(at the end of the path enter the name of file that u want to create)
		File f=new File("C:\\Eclipse\\java\\src\\filehandling\\s.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bfw=new BufferedWriter(fw);
		
		bfw.write("Vanakkam da");
		bfw.newLine();
		bfw.write("Namaskaaram!!");
		bfw.close();

		
		
	}

}
