package seleniumDay26WebdriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ConditionalMethods {
	
	public static void main(String[] args ) throws InterruptedException {
		
		
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	boolean result= driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	
	System.out.println(result);
	
	WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
	System.out.println("display status of logo"+ logo.isDisplayed());
	
	//isEnabled - allowing to enter data 
	
	WebElement fieldEnabled  = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	
	System.out.println(fieldEnabled.isEnabled());
	}
	

}
