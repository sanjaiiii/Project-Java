package assignment;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A22 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.mycontactform.com");

		
		List<WebElement> f = ob.findElementsByTagName("img");
		
		System.out.println("No.of.images: "+f.size());
		
		ob.quit();
		
		
	}

}
