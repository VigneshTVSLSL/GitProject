package GitProject.GitProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test001_OpenChromeBrowser {

	@Test

	public void OpenChromeBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		driver.manage().window().maximize();
		Thread.sleep(4000);

		driver.close();

		System.out.println("Browser Opened & Closed");

	}
}
