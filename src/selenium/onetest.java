package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class onetest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\workspace\\kalambur\\lib1\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.flipkart.com/");

	}

}
