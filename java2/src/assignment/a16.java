package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class a16 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("http://www.yahoo.com");
        
        //title
        System.out.println("Title: "+ob.getTitle());
        //url
        System.out.println("URL: "+ob.getCurrentUrl());
        //size
        System.out.println("Size: "+ob.manage().window().getSize());
       
		ob.quit();
		
		
		
	}

}
