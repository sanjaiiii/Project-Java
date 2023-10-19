package SeleniumButtons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("https://www.letskodeit.com/practice");
		
		//create an object for select class
		// pass dropdown box as input
		// select the options
		// index/value/visible text
		
		// single=> select
		// multiple options cannot be selected
		// dselection is not possible 
		WebElement ele = ob.findElementById("carselect");
		Select s= new Select(ele);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("benz");
		Thread.sleep(1000);
		s.selectByVisibleText("Honda");
		Thread.sleep(1000);
		ob.quit();
	
	}

}
