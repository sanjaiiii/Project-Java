package SeleniumCookies;

import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("http://www.facebook.com");
        
        
        /*Cookies are temporary information stored by the browser
         * 
         * Using the set method
         * 
         */
        
        Set<Cookie> c = ob.manage().getCookies();
        System.out.println("FB doesn't has cookies: "+c.isEmpty());
        System.out.println("No of cookies : "+ c.size());
        System.out.println(c.hashCode());
        ob.quit();
        
        
        
        //To get the details of cookies
        //Iterate through the cookies
        //Using for loop
        //Syntax: for(datatype temp_name: collection_name)
        
        for(Cookie x:c) 
        {
        	System.out.println("Name: "+x.getName());
        	System.out.println("Value: "+x.getValue());
        	System.out.println("Class: "+x.getClass());
        	System.out.println("Expiry Date: "+x.getExpiry());
        	System.out.println("Secure Enough?: "+x.isSecure());
        	System.out.println(x.hashCode());
        	x.getPath();
        }
        
        
        Thread.sleep(2000);
        
        ob.quit();

	}

}
