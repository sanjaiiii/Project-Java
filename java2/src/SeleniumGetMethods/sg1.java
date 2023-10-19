package SeleniumGetMethods;


import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Mouse;

public class sg1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("http://www.google.com");
        
       
        
	//To get title	
	System.out.println("Title:" +ob.getTitle());
	
	//Url
	System.out.println(ob.getCurrentUrl());
	
	//Size
	System.out.println(ob.manage().window().getSize());
	
	//Position
	//x and y value of the browser(Like X and Y axis in graph)
	System.out.println(ob.manage().window().getPosition());
	
	//Browser details-->Capabilites(method are Stored under this interface)
	 Capabilities//(Importing the selenium's capabilities)
	 c= ob.getCapabilities();//its better to use with variable coz it has lots of methods in it
	 System.out.println("Browser Name is " + c.getBrowserName());
	 System.out.println("Version is "+c.getVersion());
	 System.out.println("OS is "+c.getPlatform());
	
	//to hold
		 Thread.sleep(1000);


	 
	 //It must be used in the last
	ob.quit();
	}

	

	
	
	
}
