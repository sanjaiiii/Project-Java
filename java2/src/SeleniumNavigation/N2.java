package SeleniumNavigation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class N2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http:\\www.google.com");
	    
	    driver.executeScript("window.open('http:\\www.seleniumeasy.com','_blank');");
	    
	    
	    String g = driver.getWindowHandle();//(Got the control of Google)
	    Set<String> s = driver.getWindowHandles();//(Got the control of Google, Seleniumeasy)
	    
	    
	    Iterator<String> I = s.iterator();
	    
	    while(I.hasNext()) 
	    {
	    	String CW = I.next();
	    	if(!g.equals(CW))
	    	{
	    		driver.switchTo().window(CW);
	    		System.out.println(driver.getTitle());
	    		Thread.sleep(2000);
	    		driver.findElementByLinkText("Maven").click();
	    		Thread.sleep(1000);
	    		driver.close();
	    		
	    	}
	    	
	    }
	    
	    driver.switchTo().window(g);
    	System.out.println(driver.getTitle());
    	Thread.sleep(2000);
    	driver.findElementById("APjFqb").sendKeys("rolex surya");
    	Thread.sleep(2000);
    	driver.findElementByCssSelector("#c7mM1c > div.wM6W7d > span").click();
    	Thread.sleep(500);	
	    driver.manage().window().fullscreen();
	driver.close();
	}
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}


