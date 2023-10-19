package SeleniumExecuteScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class E3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		
		/*
		 * 
		 *find
		 *getElementById
		 *getElementsByName
		 *
		 */
		
		ob.executeScript("document.getElementById('user').value='hi'");
		ob.executeScript("document.getElementsByName('pass')[0].value='hello'");
		
		
		
		
	}

}
