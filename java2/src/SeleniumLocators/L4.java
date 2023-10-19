package SeleniumLocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class L4 {

	public static void main(String[] args) {


		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		
		/*xpath : xml path language
		 * 
		 *2-types: Relative & absolute xpath 
		 * 
		 *1.absolute xpath: Starts with /
		 *Start finding the element from its root (root = desired element) 
		 * 
		 * 
		 * copy => copy full xpath
		 * 
		 */
		
		//ob.findElementByXPath("/html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input").sendKeys("HI");
		
	
		
		//2.relative xpath: starts with //
		// syntax:         //*[@locator/attribute='value']    or //tagname[@locator/attribute='value']
		// shortcut :      copy=> copy xpath
		
		//shortcut:
		//ob.findElementByXPath("//*[@id=\"user\"]").sendKeys("hi");
		//ob.findElementByXPath("//*[@type='password']").sendKeys("hi");
		
	//Using Synatx for user id: //*[@locator/attribute='value']
		ob.findElementByXPath("//*[@id='user']").sendKeys("hi");
		
	//Using Synatx password: //tagname[@locator/attribute='value']
		ob.findElementByXPath("//input[@type='password']").sendKeys("1234");
		
		
	}

}
