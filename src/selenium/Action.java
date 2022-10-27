package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\workspace\\kalambur\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

        driver.get("https://www.flipkart.com/");
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("9566244396");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("malar123");
		//double click
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		ac.doubleClick(email).build().perform();
		
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		ac.click(login).build().perform();
		
		//move to element
		Thread.sleep(2000);
		WebElement electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
		ac.moveToElement(electronics).build().perform();
		
		//context click(right click
		ac.contextClick().build().perform();
		//driver.close
		driver.close();
		System.out.println("code completed");
		//driver.quit
		driver.quit();
}
	
}
