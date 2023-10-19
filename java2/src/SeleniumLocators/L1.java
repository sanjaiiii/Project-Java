package SeleniumLocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class L1 {

	/*Locators: Helps to find the elements present on the webpage.[Elements eg:textbox,button,etc.]
	 *There are 8 Types Locators:
	 *1.id
	 *2.name 
	 *3.class(Not preferable) 
	 *4.Linkedtext
	 *5.Partial Linkedtext
	 *6.Tagname
	 *7.CSS selector
	 *8.Xpath
	 */
	
	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
        ob.get("http://www.mycontactform.com");
        
       /*Step1-Right click and select "inspect"
        *
        *Step2-Now click on the arrow mark shows on the left corner (or) Ctrl+shift+C
        *
        *Step3-Now u can go ahead click on the browser's Login textbox
        *U can see that a new screen is opened on the right side
        *
        *Step4-From the selected tab choose one locator
        *
        *Step5-Now in the coding area select the findElementBy with the locator you choose
        *and enter the input(input the same exact words with the locator u choose) 
        *
        *Step6-Now using the sendkeys(),enter the credential u want to use
        *
        *Step7-The same will be applicable to the next as well(Password textbox)
        *
        *Step8-Now again with the login button using the same step but
        *instead of using sendkeys() here we use click(),
        */
        
       
      //using name 
        ob.findElementByName("user").sendKeys("Dhivyakarthi123");
        //using id
        ob.findElementById("pass").sendKeys("12345");
        //using class name
        ob.findElementByClassName("btn_log").click();
    
           
       
       
	}

}
