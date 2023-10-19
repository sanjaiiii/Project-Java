package SeleniumButtons;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbuttons {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
		
	/*/Method:1
		ob.findElementById("bmwcheck").click();
		Thread.sleep(3000);
		ob.findElementById("benzcheck").click();
		Thread.sleep(3000);
		ob.findElementById("hondacheck").click();
		Thread.sleep(3000);*/
		
		
	//Method:2 (There Must be a common values while we inspect it)
		//collect all the check buttons(by the common values)
		//store it in a list
        //To store it in a list we must take all the common values.(we can use it with the and operator)
		//iterate=> click
		List<WebElement> l = ob.findElementsByXPath("//*[@name='cars' and @type='checkbox']");
		//using for loop for each
		for(WebElement X:l)
		{X.click();
		Thread.sleep(1000);
		}
		
//Note- We know that if we click the check buttons which was already checked, it must be unchecked.right?
//So by clicking it again we can make sure that it works right.		
		List<WebElement> k = ob.findElementsByXPath("//*[@name='cars' and @type='checkbox']");
		//using for loop for each
		for(WebElement X:k)
		{X.click();
		Thread.sleep(1000);
		}

		ob.quit();
	}

}
