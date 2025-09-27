package seleniumDay22Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoblaze.com/");
		Thread.sleep(2000);
		List<WebElement> NumberOfLinks = driver.findElements(By.tagName("a"));
		System.out.println(NumberOfLinks.size());
		
		//Thread.sleep(2000);
		List<WebElement> NumberOfImages = driver.findElements(By.tagName("img"));	
		System.out.println(NumberOfImages.size());
		
		
		
		// linktext and partialLink text 
	//	driver.findElement(By.linkText("Contact")).click();
		
		driver.findElement(By.linkText("Laptops")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Hom")).click();
		
		//driver.quit();
	

	}

}
