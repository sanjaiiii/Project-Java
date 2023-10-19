package assignment;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class a19 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("http://www.bing.com");
        
        Set<Cookie> c = ob.manage().getCookies();
        System.out.println("Cookies: "+c.size());
        
        for(Cookie x:c)
        {
        	System.out.println("Name: "+x.getName());
        	System.out.println("Value: "+x.getValue());
        }
        ob.quit();
        
	}

}
