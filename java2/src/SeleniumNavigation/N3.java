package SeleniumNavigation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;

public class N3 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http:\\www.google.com");
	    
	    driver.executeScript("window.open('http:\\www.youtube.com','_blank');");
	    
	    driver.executeScript("window.open('http:\\www.facebook.com')");
	    
	    String G = driver.getWindowHandle();
	    Set<String> F = driver.getWindowHandles();
	    
	    Iterator<String> i = F.iterator();
	    
	    
	    while(i.hasNext()) 
	    {
	      String CW = i.next();
	      
	      if(!i.equals(CW)) 
	      {
	    	  driver.switchTo().window(CW);
	    	  Thread.sleep(3000);
	    	  System.out.println(driver.getTitle());
	    	  Capabilities a = driver.getCapabilities();
	    	  System.out.println("Browser Name: "+a.getBrowserName());
	    	  System.out.println("Version: "+a.getVersion());
	    	  Thread.sleep(3000);
	    	  driver.close();
	      }
	    	
	    	
	    }
	    
	    
	    
	    
	    
	 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
