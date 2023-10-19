package SeleniumExecuteScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class E1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("http://www.google.com");
		
		//OtherWays to get 'Title & url'
		
		System.out.println(ob.executeScript("return document.title"));		
	    System.out.println(ob.executeScript("return document.URL"));
	    
	    ob.quit();
        	  
	
	
	
	
	
	}

}