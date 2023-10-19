package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class A24 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		ob.findElementByLinkText("Help").click();
		
		Thread.sleep(3000);
		
		ob.quit();
		
		
	}

}
