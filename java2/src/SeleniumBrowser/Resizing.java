package SeleniumBrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resizing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("http://www.google.com");
        
        //Size related information or methods will be present in Dimension class
        /*
         * First we need to import dimension(interface).
         * 
         * create a class for Dimension class
         * 
         * Pass the height and width you want
         * 
         * Then apply it on the windows
         */
        
        
        //(Importing the selenium's Dimension)
        Dimension d=new Dimension(300,400);
        ob.manage().window().setSize(d);
        
        
        

	}

}
