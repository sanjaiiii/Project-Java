package SeleniumExecuteScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class Scroller {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("http://www.seleniumeasy.com");
		
		
		
		/*
		 * vertical scroller: move along y axis, x value will be 0
		 *                    down: +y
		 *                    up  : -y
		 *                    
		 * horizontal scroller: move along x axis, y value will be 0
		 *                   right:+x
		 *                   left : -x
		  * 
		 * */
		
		
		//pageup and page down
		/*ob.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		ob.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);*/
		
		//We can scroll upto a specific value:
		ob.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		ob.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(3000);
		
		
		
		
	}

}
