package SeleniumMouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class M2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://jqueryui.com/droppable/");
		
		//If the webelements are present inside the frame
				// We need to switch our control to that frame
				
		// switch the control by using id, name or index
		        ob.switchTo().frame(0);
				
				
				
				WebElement ele1 = ob.findElementById("draggable");
				WebElement ele2 = ob.findElementById("droppable");
				Actions ac= new Actions(ob);
				ac.dragAndDrop(ele1, ele2).build().perform();
	}

}
