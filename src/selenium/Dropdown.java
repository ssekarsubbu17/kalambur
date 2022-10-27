package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) {
		
	}
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\workspace\\kalambur\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
}       Thread.sleep(3000);
}

		
		//driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		//Thread.sleep(2000);
		
		//WebElement day = driver.findElement(By.name("birthday_day"));
		//Select s= new Select (day);
		//s.selectByIndex(4);
		//Thread.sleep(2000);
		//s.selectByValue("10");
		//Thread.sleep(2000);
		//s.selectByVisibleText("20");
		
	//	WebElement month = driver.findElement(By.name("birthday_month"));
		//Select s1= new Select(month);
		//s1.selectByVisibleText("jun");
		//List<WebElement> print =s1.getOptions();
		 //System.out.println(print.size);
		//System.out.println(print.get(0));
		//for (WebElement all: print){
			//String a = all.getText();
			//System.out.println(a);
		
		
			
		}
		
		


	
	


]