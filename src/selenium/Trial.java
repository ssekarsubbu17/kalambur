package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {
	
public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\workspace\\kalambur\\library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.flipkart.com/");
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("sekarshanthi6@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("malar123");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		login.click();
		
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[contains(@type,'text')]"));
		search.sendKeys("apple iphone13");
		
		Thread.sleep(2000);
		WebElement search1 = driver.findElement(By.xpath("//button[(@type='submit')]"));
		search1.click();
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
