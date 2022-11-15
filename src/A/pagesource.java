package A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagesource {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashwini Shivshette\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	//page source
	String allelements=driver.getPageSource();
	System.out.println(allelements);
	String title = driver.getTitle();
	System.out.println(title);
	}

}
