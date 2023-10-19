package SeleniumNavigation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class N4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");    //Opened first website
		
		driver.executeScript("window.open('http://www.Yahoo.com','_blank');");  //Opened Second website
		
		driver.executeScript("window.open('http://www.opensubtitles.com');");   //Opened Third website
		
		driver.executeScript("window.open('http://www.facebook.com')");         //Opened fourth website
		
		
		//Using getWindowHandle() we can get single website's control.
		//Using getWindowHandles() we can get all the website's control.
		
		String a = driver.getWindowHandle(); //(control of google website has been taken )
		Set<String> b = driver.getWindowHandles(); //(Google, Yahoo, Opensubtitles, facebook controls's are taken))
//Note(//U can notice when u declare a variable, automatically declared as String for getWindowHandle and for 
//..getWindowHandles it has been declared as set because there is group of websites))		
		
		Iterator<String> i = b.iterator();//Using iterator to itearte the websites
		

		//Using while loop to put the websites in the loop mood
		while(i.hasNext()) // hasnext=> whether content is there
		{
			String w = i.next(); // next -> read the content 
			if(!a.equals(b))
			{
			 Thread.sleep(1000);
			 driver.switchTo().window(w);
			 Thread.sleep(1000);
			 driver.navigate().refresh();
			 System.out.println("Title: "+driver.getTitle()); 
			 System.out.println("Session Id: "+driver.getSessionId());
			 driver.close();
			  
			}
		
		}
		
		
		
		
	}

}
