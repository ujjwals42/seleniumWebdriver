package seleniumDay26WebdriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();

		//url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//getTitle 
	System.out.println(	driver.getTitle());
		
		//getCurrentUrl()
	
	System.out.println(driver.getCurrentUrl());
	
	//page source
	
	//System.out.println(driver.getPageSource());
	
	String windowid = driver.getWindowHandle();
	//System.out.println(windowid);
	
	Thread.sleep(2000);
		
	driver.findElement(By.partialLinkText("OrangeHRM")).click();
	
	Set<String>  windid = driver.getWindowHandles(); 
	System.out.println(windid);
	
	
	
	
	
	
	
	
	}

}
