package SeleniumMouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class M1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		/*Automating Mouse Actions
		 *using this we can:
		 *Click
		 *Double Click
		 *Right Click(contextclick)
		 *Click hold and release
		 *Mosue Hovering
		 *drag and drop 
		 *drag and drop by
		 *
		 *Create an object for action class
		 *Pass driver instance as input to the action object
		 * 
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		WebElement ele = ob.findElementByName("btnSubmit");
		Actions ac= new Actions(ob);
		//ac.click(ele).build().perform();
		//ac.doubleClick(ele).build().perform();
		//ac.contextClick(ele).build().perform();
		//ac.moveToElement(ele).click().build().perform();
		ac.clickAndHold(ele).build().perform();
		Thread.sleep(3000);
		ac.release(ele).build().perform();
		
		
	}

}
