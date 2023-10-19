package SeleniumExecuteScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class S1 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("http://www.seleniumeasy.com");
		
		
		/*ob.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		ob.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);
		ob.quit();*/
		
		ob.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		ob.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(3000);
		ob.quit();
		
        
	}

}
