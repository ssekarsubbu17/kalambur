package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropg {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\workspace\\kalambur\\lib1\\chromedriver.exe");
		WebDriver driver = new WebDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		Actions put = new Actions(driver);
		Thread.sleep(2000);
		
		WebElement b = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement b1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		put.dragAndDrop(b, b1).build().perform();
		Thread.sleep(2000);
		
		WebElement f1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement f2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		put.dragAndDrop(f1, f2).build().perform();
		Thread.sleep(2000);
		
		WebElement s = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement s1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		put.dragAndDrop(s, s1).build().perform();
		Thread.sleep(2000);
		
		WebElement f21 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement f22 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		put.dragAndDrop(f21,f22).build().perform();
		Thread.sleep(2000);
		
		WebElement text =driver.findElement(By.xpath("(//a[@class='button button-green'])[1]"));
		String name = text.getText();
		System.out.println(name);
		
	}
	
}