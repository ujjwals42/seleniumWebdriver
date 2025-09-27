package SSdetDay27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver  driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait mywait=  new WebDriverWait(driver, Duration.ofSeconds(10));
		

		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	//	Thread.sleep(2000);
		WebElement name = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		name.sendKeys("Admin");
		//driver.findElement(By.name("username")).sendKeys("Admin");
		

	}

}
