package SeleniumMouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("https://jqueryui.com/slider/");
        
        ob.switchTo().frame(0);
        WebElement ele = ob.findElementById("slider");
        Actions a=new Actions(ob);
        a.dragAndDropBy(ele, 90, 0).build().perform();
        Thread.sleep(2500);
        a.dragAndDropBy(ele, 0, 70).build().perform();
        
	}

}
