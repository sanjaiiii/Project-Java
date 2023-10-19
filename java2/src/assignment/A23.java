package assignment;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A23 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.yahoo.com");
		
		List<WebElement> d = ob.findElementsByTagName("div");
		System.out.println("No of elements by div tag name: "+d.size());
		ob.quit();
		
		
		
		

	}

}
