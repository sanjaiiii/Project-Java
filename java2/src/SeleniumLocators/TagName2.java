package SeleniumLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName2 {
	
	/*TagName cannot be used to find single element
	 *It is not unique
	 * 
	 * Images:img
	 * Elements:div,input
	 * Links:a 
	 */
	
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("http://www.facebook.com");

        
        List<WebElement> f = ob.findElementsByTagName("img");
        System.out.println("No of tag names with img: "+f.size());
        
        List<WebElement> f1 = ob.findElementsByTagName("a");
        System.out.println("No of tag names with a: "+f1.size());
        
        List<WebElement> f2 = ob.findElementsByTagName("div");
        System.out.println("No of tag names with div: "+f2.size());
        
        List<WebElement> f3 = ob.findElementsByTagName("input");
        System.out.println("No of tag names with input: "+f3.size());
        
        
        ob.quit();
        
        
        
        
        
        
	}

}
