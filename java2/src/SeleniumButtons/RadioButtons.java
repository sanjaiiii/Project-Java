package SeleniumButtons;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");

		
		// method1
				/*ob.findElementById("bmwradio").click();
				Thread.sleep(3000);
				ob.findElementById("benzradio").click();
				Thread.sleep(3000);
				ob.findElementById("hondaradio").click();
				Thread.sleep(3000);*/
				
				//method2 
				// collect all the radio buttons(by the common values)
				//store it in a list
		        //To store it in a list we must take all the common values.(we can use it with the and operator)
				//iterate=> click
	List<WebElement> l = ob.findElementsByXPath("//*[@name='cars'and @type='radio']");//[name='cars' & type='radio'.These two are the common values.]
				//for each: for(datatype tempvariable: nameofthecollection)
				for(WebElement x:l)
				{
					x.click();
					Thread.sleep(3000);
				}

	}

}
