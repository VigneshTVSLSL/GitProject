package GitProject.GitProject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile21June2019 {
	@Test
	public void UploadFile() throws InterruptedException, IOException

	{

		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://my.naukri.com/account/createaccount?othersrcp=23531&wExp=N&gclid=EAIaIQobChMImJC-i8L64gIVVYyPCh11XwIhEAAYASAAEgJBBfD_BwE");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@value='fresher']")).click();
		Thread.sleep(5000);
		System.out.println("Came to File Upload page");
		driver.findElement(By.xpath("//input[@name='uploadCV']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\Upload\\21 June 2019\\FileUploadScript21June2019.exe");
		Thread.sleep(5000);
		/*
		 * String actualElement =
		 * driver.findElement(By.xpath("span[text()='File uploaded successfully']")).
		 * getText(); String expectedText = "File uploaded successfully";
		 * 
		 * if (actualElement == expectedText)
		 * 
		 * {
		 * 
		 * System.out.println("File Uploaded Successfully");
		 * 
		 * }
		 * 
		 * else
		 * 
		 * { System.out.println("File Not Uploaded"); }
		 */

		/*
		 * Assert.assertEquals(actualElement, expectedText);
		 * 
		 * System.out.println("File Uploaded successfully");
		 */
		// span[text()='File uploaded successfully']
		// span[contains(text(),'File uploaded successfully')]
		// span[starts-with(text(),'File uploaded successfully')]

	}
}
