package SeleniumBrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;

public class Re_Sizing_and_Positioning {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwsa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		EdgeDriver ob = new EdgeDriver();
		ob.get("https://www.youtube.com");
		ob.manage().window().fullscreen();
		Thread.sleep(3000);
		Dimension d= new Dimension(500, 600);
		ob.manage().window().setSize(d);
		Thread.sleep(3000);
		Point p= new Point(100,500);
		ob.manage().window().setPosition(p);
		
		ob.quit();
		
	}

}
