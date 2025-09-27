package seleniumDay24SdetXpath;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//*[@id='twotabsearchtextbox']
		///*[@placeholder='Search Amazon.in']
		///
		
		
		//xpath with single attribute 
		
		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("pixel 9a");
		
		//xpath with multiple attribute 
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button'][@type='submit']")).click();
		
		// using and operator 
		
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @type='submit']")).click();
		
		// using or operator 
	
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button' or @type='bsmit']")).click();
	 Thread.sleep(2000);
	 
	 
	 //using inner text
	 //    //tagname[text()='Google Pixel 9A (Porcelain, 256 GB) (8 GB RAM)']
	 driver.findElement(By.xpath("//span[text()='Google Pixel 9A (Porcelain, 256 GB) (8 GB RAM)']")).click();
	 Thread.sleep(2000);
	 driver.close();
	//   driver.quit();
	 
	}

}
