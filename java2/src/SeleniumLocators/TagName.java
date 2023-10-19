package SeleniumLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		
		//cannot be used to find single element.
		
		List<WebElement> I = ob.findElementsByTagName("img");
		System.out.println("No of TagName with images: "+I.size());
		
		List<WebElement> J = ob.findElementsByTagName("input");
		System.out.println("No of TagName with input: "+J.size());
		
		List<WebElement> K = ob.findElementsByTagName("div");
		System.out.println("No of TagName with div: "+K.size());
		
		List<WebElement> L = ob.findElementsByTagName("a");
		System.out.println("No of TagName with a: "+L.size());
		
		ob.quit();
		
	}

}
