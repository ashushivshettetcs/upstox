package A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class max_min {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashwini Shivshette\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.google.com/");
		Driver.manage().window().maximize();
		Thread.sleep(2000);
		Driver.manage().window().minimize();
	}

}
