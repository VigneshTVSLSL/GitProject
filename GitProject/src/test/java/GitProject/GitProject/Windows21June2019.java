package GitProject.GitProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windows21June2019 {

	@Test
	public void windowhandling() throws InterruptedException {

		// WebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		// Adding New step & methods 1.
		// Adding New step & methods 2.
		// Adding New step & methods 3.
		// Adding New step & methods 4.

		// WebDriverWait wait = new WebDriverWait(driver, 60);

		// wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//a[
		// contains(@title,'Contact Us')]")));

		/*
		 * wait.until(ExpectedConditions.textToBePresentInElement(
		 * driver.findElement(By.xpath("//a[ contains(@title,'Contact Us')]")),
		 * "Contact Us"));
		 */
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@class='youtube']")).click();

		Set<String> windowsid = driver.getWindowHandles();
		Iterator<String> itr = windowsid.iterator();
		String parentID = itr.next();
		String childID = itr.next();

		driver.switchTo().window(childID);
		Thread.sleep(5000);
		/*
		 * wait.until(ExpectedConditions .elementToBeClickable(driver.findElement(By.
		 * xpath("//span[text()='Selenium Framework']"))));
		 */
		driver.findElement(By.id("search")).sendKeys("Automation");
		Thread.sleep(3000);
		driver.close();

		Thread.sleep(2000);
		driver.switchTo().window(parentID);
		/*
		 * wait.until(ExpectedConditions
		 * .elementToBeClickable(driver.findElement(By.xpath(
		 * "//li[starts-with(@class,'twitter')]"))));
		 */
		driver.findElement(By.xpath("//li[starts-with(@class,'twitter')]")).click();

		Set<String> windowsid1 = driver.getWindowHandles();

		Iterator<String> itr1 = windowsid1.iterator();
		String parentId1 = itr1.next();
		String childID1 = itr1.next();

		driver.switchTo().window(childID1);
		Thread.sleep(3000);
		driver.close();

		driver.switchTo().window(parentId1);
		Thread.sleep(3000);
		driver.close();

	}

}
