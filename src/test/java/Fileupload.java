import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://the-internet.herokuapp.com/upload"); // sample upload site

	        // Locate file upload element
	        WebElement upload = driver.findElement(By.id("file-upload"));

	        // Provide full file path (absolute path)
	        upload.sendKeys("C:\\learn\\Oops.pdf");

	        // Click submit
	        driver.findElement(By.id("file-submit")).click();

	        System.out.println("File uploaded successfully!");
	        
	}

}
