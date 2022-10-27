package selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class prompt  {
	
	private static final int X = 0;
	private static TakesScreenshot takesscreenshot;
	private Object output;

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\workspace\\kalambur\\library\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[contains(text(),' click the button to display an  alert box')]")).click();
    Thread.sleep(3000);
    
  Alert a=driver.switchTo().alert();
  a.accept();
  
  driver.findElement(By.xpath("(//*[contains(text(),'Alert with OK')])[2]")).click();
  driver.findElement(By.xpath("//*[contains(text)(),'click the button to display a confirm box ')]")).click();
  Thread.sleep(2000);
  a.dismiss();
  
  driver.findElement(By.xpath("//*[contains(text(),'Alert with Textbox')]")).click();
  driver.findElement(By.xpath("//*[contains(text)(),'click the button to demonstrate the prompt')]")).click();
  String print =a.getText();
  System.out.println(print);
  
  Thread.sleep(3000);
  a.sendKeys("sekar");
  a.accept();
  
   TakesScreenshot tk = (TakesScreenshot)driver();
   File sor = (File) tk.getScreenshotAs(OutputType.FILE);
   File des = new file("C:\\Users\\Windows\\workspace\\kalambur\\library\\chromedriver.exe");
   
  FileUtils.copyFile(sor, des);
  
	}

	
	}



