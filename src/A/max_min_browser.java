package A;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class max_min_browser {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",":c:\\Users\\Ashwini Shivshette\\Downloads\\chromedriver_win32.zip\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.amazon.com/");//
		Driver.manage().window().maximize();//maximize
		Thread.sleep(4000);
		Driver.manage().window().minimize();//minimize
		//setsize()
		Dimension d = new
		Dimension(100,200);
		Driver.manage().window().setSize(d);
		//setposition
		Point p = new Point(300,400);
		Driver.manage().window().setPosition(p);
		
		
	}

}
