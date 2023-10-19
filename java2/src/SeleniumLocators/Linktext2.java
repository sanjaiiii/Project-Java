package SeleniumLocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("http://www.facebook.com");

	
    
        //LinkText
	//ob.findElementByLinkText("Forgotten password?").click();
	
	//Partial Linktext
	ob.findElementByPartialLinkText("Forgotten pa").click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}



}
