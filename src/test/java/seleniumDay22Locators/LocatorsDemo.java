package seleniumDay22Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;



// id 
// name 
// linkText
// partialLinkText

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromiumDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2500);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2500);
		
		
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		// using tag Name 
		//driver.findElement(By.tagName("button")).click();
		
		
		//using className
		

		List<WebElement> buttonLinks = driver.findElements(By.className("orangehrm-login-button"));
		System.out.println(buttonLinks.size());
		buttonLinks.get(0).click();
		
		
	
		
		
	}

}
