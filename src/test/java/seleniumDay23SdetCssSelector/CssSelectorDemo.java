package seleniumDay23SdetCssSelector;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CssSelectorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//using tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("abc");
		//tag is optional
		
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("abc");
		
		//using className - tag.classname
		
	//	driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("xyz");
		
		
		// using tag attribute - tag[attribute='values'];
	//	driver.findElement(By.cssSelector("input[aria-label='Search store']")).sendKeys("def");
		
		
		//using tag class attribute 
		
		driver.findElement(By.cssSelector("input.search-box-text[aria-label='Search store']")).sendKeys("how are you");
		Thread.sleep(2000);
		
		
		driver.quit();
	}
	
	

}
