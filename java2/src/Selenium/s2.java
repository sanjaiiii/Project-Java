package Selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class s2 {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.edge.driver", "C:\\Users\\wwwsa\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
	EdgeDriver ob = new EdgeDriver();
	ob.get("https://www.youtube.com");
	
	//ob.manage().window().maximize();
	
	//ob.manage().window().fullscreen();
	
	ob.navigate().refresh();
	
	Thread.sleep(2500);
	ob.quit();

	}

	
	
	
}
