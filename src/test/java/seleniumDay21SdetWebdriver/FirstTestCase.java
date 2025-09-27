package seleniumDay21SdetWebdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/* test cases 
 1. launch browser
 2.open url https://demo.opencart.com
 3.Validate title should be "your store"
 4. close browser
 */



public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("day 1 of selenium ");
		
	//	ChromeDriver driver = new ChromeDriver();
	WebDriver driver = new ChromeDriver();	
	
	driver.get("https://demo.opencart.com");
	Thread.sleep(20000);
		
	String title= driver.getTitle();
	if(title.equals("Your Store")) {
		System.out.println("test case passed");
	}
	else {
		System.out.println("test case failed");
	}
	driver.close();
	//driver.quit();
	}

}
