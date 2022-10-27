package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\workspace\\kalambur\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://demo.automationtesting.in/Alerts.html");
		 
		 driver.findElement(By.xpath("(//button[@onclick='alertbox()'])")).click();
	}
}
