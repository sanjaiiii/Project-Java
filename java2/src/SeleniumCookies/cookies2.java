package SeleniumCookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookies2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("http://www.facebook.com");
		
		
		Set<Cookie> c = ob.manage().getCookies();
        System.out.println("No of cookies before deletion: "+ c.size());
        
        for(Cookie x:c)
        {
        	System.out.println("Name: " + x.getName());
        	System.out.println("Path: "+x.getPath());
        	System.out.println("Value: "+x.getValue());
        	System.out.println("Class: "+x.getClass());
        	System.out.println("Expiry date: "+x.getExpiry());
        	
        }
        
        
        
        
        ob.manage().deleteAllCookies();
        
        Set<Cookie> c1 = ob.manage().getCookies();
        System.out.println("No of cookies after deletion: "+ c1.size());
        ob.quit();

	}

}
