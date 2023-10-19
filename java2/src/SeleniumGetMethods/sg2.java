package SeleniumGetMethods;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.edge.EdgeDriver;

public class sg2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\wwwsa\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver ob = new EdgeDriver();
		ob.get("https://www.youtube.com");

		System.out.println(ob.getTitle());
		System.out.println(ob.getCurrentUrl());
		System.out.println(ob.getSessionId());
		
		ob.manage().window().getPosition();
		ob.manage().window().getSize();
		
		Capabilities
		c= ob.getCapabilities();
		System.out.println("Browser Name: " + c.getBrowserName());
		System.out.println("Verson: "+c.getVersion());
		System.out.println("OS: "+c.getPlatform());
		
		ob.quit();
	}

}
