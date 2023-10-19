package SeleniumLocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class L3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		//(CSS) -> casecade style sheet
		// manual : 7 ways
		// shortcut: copy=> copy selector
		
		//1. tagname and id          syntax: tagname#id
		//ob.findElementByCssSelector("input#user").sendKeys("hi");
		
		//2.tagname and classname    syntax: tagname.classname
		//ob.findElementByCssSelector("input.txt_log").sendKeys("hi");
		
		//3.tagname and attribute   syntax: tagname[attribute='value']
		//ob.findElementByCssSelector("input[type='text']").sendKeys("hi");
		
		/*whatever we saw while inspecting except the locators are called attributes.
		 *we know what are locators[tagname-input,div,img,a &(classname,name,id)] 
		 */
		
		//4.tagname and prefix attribute   syntax: tagname[attribute^='prefx value']
		//ob.findElementByCssSelector("input[type^='te']").sendKeys("hi");
		//^ Circumflex symbol
				
		//5.tagname and suffix attribute   syntax: tagname[attribute$='suffx value']
		//ob.findElementByCssSelector("input[type$='xt']").sendKeys("hi");
				
		//6.tagname and sub attribute   syntax: tagname[attribute*='sub value']
		//ob.findElementByCssSelector("input[type*='ex']").sendKeys("hi");
		
		//7.tagname, classname and attribute      syntax:tagname.classname[attrbute='value']
		//ob.findElementByCssSelector("input.txt_log[type='text']").sendKeys("hi");
				
	    //shortcut: copy=> copy selectors
		//ob.findElementByCssSelector("#user").sendKeys("hi");
		
		
		
		Thread.sleep(3000);
		ob.quit();
		
		

	}

	
	
}
