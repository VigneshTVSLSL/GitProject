package testPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windows22June2019 {

	/*
	 * @BeforeMethod System.setProperty("webdriver.chrome.driver",
	 * ".\\BrowserDrivers\\chromedriver.exe")
	 * 
	 */ @Test
	public void f() throws InterruptedException

	{

		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//li[starts-with(@class,'youtube')]")).click();

		Set<String> windowsID = driver.getWindowHandles();

		Iterator<String> itr = windowsID.iterator();

		String parentID = itr.next();
		String childID = itr.next();

		driver.switchTo().window(childID);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Thread.sleep(3000);

		driver.close();

		driver.switchTo().window(parentID);
		Thread.sleep(3000);
		driver.close();

	}
}
