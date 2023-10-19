package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class A26 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.seleniumeasy.com");
		
		
		ob.findElementByLinkText("Maven").click();
		
		Thread.sleep(2000);
		
		ob.quit();
		
	}

}
