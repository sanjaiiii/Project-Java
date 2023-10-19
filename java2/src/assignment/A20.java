package assignment;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class A20 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        
        
		Point p=new Point(400,100);
		
		ob.manage().window().setPosition(p);
        
		Thread.sleep(2500);
		ob.quit();
		
		
		
	}

	
	
	
	
	
}
