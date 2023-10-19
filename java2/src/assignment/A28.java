package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A28 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		
		Thread.sleep(3000);
		ob.manage().window().maximize();
		
		ob.findElementByCssSelector("body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(1) > button").click();
		
		Thread.sleep(1000);
		WebElement D = ob.findElementByXPath("/html/body/div/div/div[2]/div/form/div/select");
		Select s=new Select(D);
		s.selectByIndex(2);
		
		ob.findElementByXPath("/html/body/div/div/div[2]/div/form/button").click();
		
		Thread.sleep(2000);
		ob.findElementByCssSelector("body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(2)").click();
		Thread.sleep(2000);
		ob.findElementByCssSelector("input[type='number']").sendKeys("5000");
		Thread.sleep(2000);
		ob.findElementByCssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button").click();
		
		
		ob.findElementByXPath("/html/body/div/div/div[2]/div/div[3]/button[3]").click();
		Thread.sleep(2000);
		ob.findElementByCssSelector("input[type='number']").sendKeys("2500");
		Thread.sleep(2000);
		ob.findElementByCssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button").click();
		
		Thread.sleep(2000);
		ob.findElementByXPath("/html/body/div/div/div[2]/div/div[3]/button[1]").click();
	    Thread.sleep(4000);
	    ob.findElementByXPath("/html/body/div/div/div[1]/button[2]").click();
		
	    ob.executeScript("window.confirm('Customer Login is Automated Successfully')");
		Alert a = ob.switchTo().alert();
		Thread.sleep(3000);
		a.accept();
		
	    
		ob.findElementByCssSelector("body > div > div > div.box.mainhdr > button.btn.home").click();
		Thread.sleep(1000);
		ob.findElementByXPath("/html/body/div/div/div[2]/div/div[1]/div[2]/button").click();
		Thread.sleep(1000);
		ob.findElementByXPath("/html/body/div/div/div[2]/div/div[1]/button[1]").click();
		Thread.sleep(1000);
		ob.findElementByCssSelector("input[ng-model='fName']").sendKeys("Sanjay");
		Thread.sleep(1000);
		ob.findElementByCssSelector("input[ng-model='lName']").sendKeys("Thangavel");	
		Thread.sleep(1000);
		ob.findElementByCssSelector("input[ng-model='postCd']").sendKeys("641664");	
		Thread.sleep(1000);
		ob.findElementByXPath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button").click();
		
       

	
	
	
	
	
	
	
	}
	



}
