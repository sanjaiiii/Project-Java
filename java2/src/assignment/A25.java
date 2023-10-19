package assignment;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A25 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.jqueryui.com");
		
		List<WebElement> i = ob.findElementsByTagName("input");
		System.out.println("No of elements as input tagname :"+i.size());	
		
		ob.quit();
	}

}
