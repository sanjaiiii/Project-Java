package SeleniumExecuteScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		
		//Using this we will only get 'ok' option to click automatically
		//ob.executeScript("alert('time out')");
		
		//Using this we will be asked for confirmation..
		ob.executeScript("window.confirm('Time Out')");
		
		//Switvhing our control to alert
		//Accept or dismiss
		
		Thread.sleep(3000);
		Alert a = ob.switchTo().alert();
		a.dismiss();
		ob.quit();
		
		
		
		
		
		
		
	}

}
