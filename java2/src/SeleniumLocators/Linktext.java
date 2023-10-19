package SeleniumLocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("http://www.google.com");
	
        
        /*LinkText-- word/words-click on it, a new url will be opened
         *Partial LinkText - substring of linktext
         * 
         *a
         * 
         * Code inspection not required
         */
        
        
	
        //find element by linktext
	ob.findElementByLinkText("Images").click();
	
	//find element by partial linktext
	ob.findElementByPartialLinkText("Pri").click();
	
	//again find element by linktext
	ob.findElementByXPath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div[2]/div[3]/c-wiz/div[3]/div/div[1]/a").click();
	
	
	
	}

}
