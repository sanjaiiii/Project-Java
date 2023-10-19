package SeleniumMouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("https://jqueryui.com/slider/");
		
		//horizontal slider: move along x axis, y value will be 0
		//vertical slider: move along y axis, x value will be 0
         ob.switchTo().frame(0);
         Actions ac= new Actions(ob);
         WebElement ele = ob.findElementById("slider");
         ac.dragAndDropBy(ele, 60, 0).build().perform();
         Thread.sleep(1500);
         ac.dragAndDropBy(ele, 0, 90).build().perform();

		
	}

}
