package SeleniumLocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class L2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("http://www.facebook.com");
       
        ob.findElementByName("email").sendKeys("9345523819");
        
        ob.findElementById("pass").sendKeys("sanjay123");
        
        ob.findElementByName("login").click();
        
        
        

	}

}
