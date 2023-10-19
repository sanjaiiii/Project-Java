package SeleniumLocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class L33 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver ob = new ChromeDriver();
	ob.get("http://www.facebook.com");
	
	/*Using css selector for fb page
	 *The 7 ways
	 *
	 *Way-1 tagname and id Syntax:tagname#id 
	 *Way-2 tagname and classname Syntax:tagname.classname
	 *Way-3 tagname and attribute Syntax:tagname[attribute='value']
	 *Way-4 tagname and prefix attribute Syntax:tagname[attribute^='prefix value']
	 *Way-5 tagname and suffix attribute Syntax:tagname[attribute$='suffix value']
	 *Way-6 tagname and sub attribute Syntax:tagname[attribute*='sub value']
	 *Way-7 tagname, classname & attribute Syntax:tagname.classname[attribute='value']
	 *
	 *Shortcut-> copy=> copy selectors
	 */
		
	//ob.findElementByCssSelector("input#email").sendKeys("9345523819");
	//ob.findElementByCssSelector("input#pass").sendKeys("sanjay123");
	
	//no output
	//ob.findElementByCssSelector("input.inputtext _55r1 _6luy").sendKeys("9345523819");	
	
	//ob.findElementByCssSelector("input[type='text']").sendKeys("9345523819");
	
	//ob.findElementByCssSelector("input[type^='te']").sendKeys("9345523819");
	
	//ob.findElementByCssSelector("input[type$='xt']").sendKeys("9345523819");
	
	//ob.findElementByCssSelector("input[type*='ex']").sendKeys("9345523819");
	
	//no output
	//ob.findElementByCssSelector("input.inputtext _55r1 _6luy[type='text']").sendKeys("9345523819");
	
	//Shortcut:
	//ob.findElementByCssSelector("#email").sendKeys("9345523819");
	
	}

	
}
