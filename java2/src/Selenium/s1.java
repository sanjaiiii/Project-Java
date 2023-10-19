package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class s1 {
/*To add the library in the project.
 * 
 *Project->Rightclick->Properties->Java Buildpath->Libraries->click classpath
 *->Add External jars->select Selenium Jar->Open->Apply and close..
 *
 *You can see the "Referenced Libraries" added to the in the project.
 *
 *adding the library once to the project is enough, to use it throughout the project.
 * */
	
	public static void main(String[] args) throws InterruptedException {
		//Configuring the chromedriver(To let compiler know the location of chromedriver)
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        //Creating an object for ChromeDriver class
		ChromeDriver ob=new ChromeDriver();
		//Visiting the website using the get()method
        ob.get("http://www.google.com");
        
        
        //To maximize
        //ob.manage().window().maximize();
        
        //To get full screen
        //ob.manage().window().fullscreen();
        
        //To refresh
        ob.navigate().refresh();
       
        //To hold
        Thread.sleep(3000);
        
        //To close it..(Note-It must be used in the last)
        ob.quit();
	}

	
	
	
}
