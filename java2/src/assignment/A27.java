package assignment;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A27 {

	public static void main(String[] args) throws InterruptedException {


	System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	
	ChromeDriver ob=new ChromeDriver();
    ob.get("https://demo.automationtesting.in/Register.html");
	
    ob.manage().window().maximize();
    //1st name
    ob.findElementByCssSelector("input[type='text']").sendKeys("Sanjay");
    //2ndname
    ob.findElementByCssSelector("input[placeholder='Last Name']").sendKeys("Sanjaii");
    //Adress
    ob.findElementByXPath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea").sendKeys("3/21,Silver Street,Thudiyalur,Cbe.");
    //email
    ob.findElementByCssSelector("input[type='email']").sendKeys("www.sanjay@gmail.com");
    //phone
    ob.findElementByCssSelector("input[type='tel']").sendKeys("9345523819");
    //radioButtons
  	List<WebElement> L = ob.findElementsByXPath("//*[@type='radio' and @name='radiooptions']");
  	for(WebElement X: L)
  	{
  		X.click();
  		Thread.sleep(1000);
  	}
  	//checkbox
  	ob.findElementById("checkbox1").click();
  	ob.findElementById("checkbox2").click();
  	ob.findElementById("checkbox3").click();
    
    //ListBox
  	WebElement K = ob.findElementById("Skills");
    Select s=new Select(K);
    s.selectByIndex(15);
    Thread.sleep(1000);
    s.selectByValue("Software");
    Thread.sleep(1000);
    

    /*select country
    WebElement C = ob.findElementByXPath("//*[aria-expanded='false']");
    Select a=new Select(C);
    a.selectByIndex(4);*/
    
    //DOB
    WebElement yr = ob.findElementById("yearbox");
    Select b=new Select(yr);
    b.selectByValue("2000");
    
    WebElement mn = ob.findElementByCssSelector("#basicBootstrapForm > div:nth-child(11) > div:nth-child(3) > select");
    Select g=new Select(mn);
    g.selectByValue("July");
    
    WebElement dt = ob.findElementById("daybox");
    Select d=new Select(dt);
    d.selectByValue("22");
    
    
    //Password
    ob.findElementByCssSelector("input[type='password']").sendKeys("12345");
    //cnfrm pass
    ob.findElementById("secondpassword").sendKeys("12345");
    
    //submit
    ob.findElementById("submitbtn").click();
    
    
    
	}

}
