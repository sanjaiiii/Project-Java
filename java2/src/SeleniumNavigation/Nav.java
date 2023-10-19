package SeleniumNavigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Nav {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http:\\www.google.com");
	    driver.manage().window().maximize();
	    
	   //open seleniumeasy.com in new tab   
	 driver.executeScript("window.open('https://www.seleniumeasy.com','_blank');");
	 
	 //step2:
	 // getting the control of first tab : parent : google tab:   driver.getwindowhandle()
	 //getting tje control of both tabs : s1={google.com, seleniumeasy.com} : driver.getwindowhandles();
	 
	 
	 
	String parent=driver.getWindowHandle();// control will be in the parent window //google
	 // collecting all the handle
	  java.util.Set<String> s1 = driver.getWindowHandles();// 2(both the tabs = collected)
	  
	  
	  //Step:3
	 // iterate through the elements present in set
	 
	  java.util.Iterator<String> I1 = s1.iterator();  // hasNext , next()

	  // hasnext=> whether content is there
	  // next -> read the content 
	  
	  
	  while(I1.hasNext())// whether any content is there 
	    {
	      String child_window=I1.next();
	      if(!parent.equals(child_window))// picking the seleniumeasy.com
	    	  { // control is moved to child window 
	        driver.switchTo().window(child_window);
	        System.out.println(driver.getTitle());
	        Thread.sleep(4000);
	        driver.findElementByLinkText("Maven").click();
	        Thread.sleep(4000);
	        driver.close();
	      }
	      
	     /*parent=google    s1={google.com,seleniumeasy.com}
	      * first iteration: I1 points to first element in set
	      *    I1 points to google.com
	      *    I1.hasnext
	      *       I1.next reads google.com and store it in child_wndow
	      *       child_window=google
	      *       if parent!=child_window
	      *          google!=google
	      *          terminate
          *second iteration: I1 points to second element in set
          *    I1 points to seleniumeasy.com
          *      I1.hasnext
      *         I1.next reads seleniumeasy.com and store it in child_window
      *         childW_ndow=seleniumeasy.com
      *            if parent!=child_window
      *               google!=seleniumeasy.com
      *                  switching control to child_window
      *                  moving  cursor to seleniumeasy.com
      *                    title
      *                    4 seconds
      *                    Maven
      *                    click
      *                    4 seconds
      *                    close: tab which is in focus will be closed
      * third iteration: I1 point to null terminate 
      *                      * 
      * */

	    }

	    driver.switchTo().window(parent);//google 
	    System.out.println(driver.getTitle());// google
	    //driver.findElement(By.linkText("Images")).click();
	    Thread.sleep(5000);
	    driver.findElementByLinkText("Images").click();
	    Thread.sleep(5000);
	    driver.quit();
	}

	      
	      
	      
	      
	      
	      
	      
	      
	      
	    }

