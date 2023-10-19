package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class A21 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("https://www.facebook.com");
        
        
        ob.executeScript("document.body.style.zoom='150%'");
        Thread.sleep(3000);
        ob.quit();
        
        
        
        
        
	}

}
