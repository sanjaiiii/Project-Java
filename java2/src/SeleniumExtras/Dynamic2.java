package SeleniumExtras;

import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.mycontactform.com");
		
		
		
	    //using 'following' & 'perceding method' to find one element with the help of other element
		//To use this we must know the tag name of the element that we want to find
	    
	    //1.following->Forward to backward(after Elements)
		//driver.findElementByXPath("//*[@id='user']//following::input[2]").click();		
		
		//2.preceding->backward to forward(before Elements)
		//driver.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input//preceding::input[1]").sendKeys("hi");
		
		
		//using 'parent' & 'child' method to find child element with the help of parent element
		
		//1.child to parent
		//driver.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[4]//parent::div").click();
		//2.parent to child
		//driver.findElementByXPath("//*[@id=\"right_col_bottom\"]//child::p[1]").click();
		
		
		////using 'sibling' method to find one element with the help of other element
		//1.use following-sibling(to get forward)
		//driver.findElementByXPath("//*[@id=\"right_col_bottom\"]/img//following-sibling::p[2]").click();
		//2.use preceding-sibling(to get backwards)
		driver.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[4]//preceding-sibling::img").click();
		
		
		
		
		
		

	}

}
