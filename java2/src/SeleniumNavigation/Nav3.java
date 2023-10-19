package SeleniumNavigation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.edge.EdgeDriver;

public class Nav3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\wwwsa\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.letskodeit.com/practice");
		
		driver.manage().window().maximize();
		
		//Opening a new website in the same browser on a new tab
		driver.executeScript("window.open('https://jqueryui.com','_blank');");
		
		//new website with same browser on another tab
		driver.executeScript("window.open('http://www.facebook.com','_blank')");
		
		
		
		String ek = driver.getWindowHandle();
		String thow = driver.getWindowHandle();
		Set<String> ekthowtheen = driver.getWindowHandles();
		
		Iterator<String> i = ekthowtheen.iterator();
		
		while(i.hasNext()) 
		{
			String store = i.next();
			
			if(!ek.equals(store)) 
			{
				driver.switchTo().window(store);
				Thread.sleep(2000);
				System.out.println("Title :"+driver.getTitle());
				System.out.println("Position :"+driver.manage().window().getPosition());
				Thread.sleep(1000);
				driver.close();
			}
			
			else if(!thow.equals(store)) 
			{
				Thread.sleep(2000);
				driver.switchTo().window(store);
				System.out.println("Title :"+driver.getTitle());
				System.out.println("Position :"+driver.manage().window().getPosition());
			driver.close();
			} 
		}
		
		driver.switchTo().window(ek);
		System.out.println("Title :"+driver.getTitle());
		System.out.println("Position :"+driver.manage().window().getPosition());
	driver.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
