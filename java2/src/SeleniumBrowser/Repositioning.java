package SeleniumBrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Repositioning {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("http://www.google.com");
        
        
        /*Position x and y
         * It is under the Point class, so create an object for point
         */
        
        Point p= new Point(300,100);
        ob.manage().window().setPosition(p);
        
        
        Thread.sleep(3000);
        
        ob.quit();	}

}
