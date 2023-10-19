package SeleniumExecuteScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class Zooming {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("http://www.google.com");
        
        /*Greater than 100% - zoom in
         * 
         * Less than 100% - zoom out
         * 
         * Normal = 100%
         */
        
   
        ob.executeScript("document.body.style.zoom='200%'");
        Thread.sleep(3000);
        ob.executeScript("document.body.style.zoom='20%'");
        Thread.sleep(3000);
        ob.executeScript("document.body.style.zoom='100%'");
        Thread.sleep(3000);
        ob.quit();
        
	}

}
