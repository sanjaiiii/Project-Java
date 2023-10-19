package SeleniumButtons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePicker {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://jqueryui.com/datepicker/");
		
        ob.switchTo().frame(0);
        
        //date 
        ob.findElementById("datepicker").click();
        
        //novem
        for(int i=0;i<2;i++)
        {
       	 ob.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
        }
        /*We can also use double click as per the requirement.
         * WebElement m = ob.findElementByXPath("/html/body/div/div/a[1]/span");
        Actions A= new Actions(ob);
        A.doubleClick(m).build().perform();
	 ob.findElementByXPath("/html/body/div/table/tbody/tr[4]/td[6]/a").click();
	    */
        
        //nov 2date
        ob.findElementByCssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(1) > td:nth-child(5) > a").click();

	}

}
