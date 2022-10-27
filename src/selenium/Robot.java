package selenium;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\workspace\\kalambur\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement email= driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		email.sendKeys("9566244396");
	
		Robot r = new Robot();
		
		r.keypress(KeyEvent.VK_CONTROL);
		r.keypress(KeyEvent.VK_A);
	
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		Thread.sleep(2000);
		
		r.keypress(KeyEvent.VK_CONTROL);
		r.keypress(KeyEvent.VK_C);
	
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
		
		r.keypress(KeyEvent.VK_CONTROL);
		r.keypress(KeyEvent.VK_TAB);
	
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keypress(KeyEvent.VK_CONTROL);
		r.keypress(KeyEvent.VK_V);
	
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
	}

		
	}
		
	
