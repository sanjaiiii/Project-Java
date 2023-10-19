package SeleniumButtons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("https://www.letskodeit.com/practice");
		
		//create an object for select class
		// pass listbox box as input
		// select the options
		// index/value/visible text
		
		
		// multiple options can be selected
		// dselection is possible 
		WebElement ele = ob.findElementById("multiple-select-example");
		Select s= new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("orange");
		s.selectByVisibleText("Peach");
		Thread.sleep(2000);
		
		// dselection is possible 
		s.deselectByIndex(1);
		Thread.sleep(1000);
        
	}

}
