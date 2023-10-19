package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class a17 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("http://www.facebook.com");
        
        //Position
        System.out.println("Position: "+ob.manage().window().getPosition());
        Thread.sleep(2950);
        ob.quit();

		
	}

}
