package SeleniumExtras;

import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.mycontactform.com");
		
		
		
		// username=> login
		driver.findElementByXPath("//*[@id='user']//following::input[2]").click();
		
		//login=> username
		//driver.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input//preceding::input[2]").sendKeys("hi");

	
		// finding parent from child
		driver.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[4]//parent::div").click();
		
        // finding child from parent
	    //driver.findElementByXPath("//*[@id=\"right_col_bottom\"]//child::p[4]").click();
	
	
		// sibling: child of same parent
		
		driver.findElementByXPath("//*[@id=\"right_col_bottom\"]/img//following-sibling::p[3]").click();
			
	    //driver.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[4]//preceding-sibling::p[1]").click();
	
	
	
	
	
	
	}

}
