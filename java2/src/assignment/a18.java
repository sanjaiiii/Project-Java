package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class a18 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("http://www.bing.com");	
		
        //Resize
        Dimension
        d=new  Dimension(400, 500);
        
        ob.manage().window().setSize(d);
        
        Thread.sleep(3000);
        ob.quit();
		
	}

	
	
	
}
