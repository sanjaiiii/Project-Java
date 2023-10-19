package SeleniumLocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class L44 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		/*
		 * Xpath=xml path language
		 * 
		 * 2types: absolute & relative
		 * 
		 * absolute Xpath starts with /
		 * relative Xpath starts with //
		 * 
		 */
		
//absolute Xpath: It has only shortcut
//copy => copy full xpath
	
//used for user id
//ob.findElementByXPath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input").sendKeys("9345523819");
		
	
		
//relative Xpath: has both shortuct and syntax
//shortuct-> copy => copy xpath
		
//Shortcut:
//used for password	
//ob.findElementByXPath("//*[@id=\"pass\"]").sendKeys("sanjay123");

//Syntax for user id : //*[@locator/attribute='value']
ob.findElementByXPath("//*[@type='text']").sendKeys("abcd");

//Syntax for password : //tagname[@locator/attribute='value']
ob.findElementByXPath("//input[@id='pass']").sendKeys("12345");
		
	}

}
