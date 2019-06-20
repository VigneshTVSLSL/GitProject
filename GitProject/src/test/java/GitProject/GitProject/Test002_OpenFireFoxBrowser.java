package GitProject.GitProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test002_OpenFireFoxBrowser {
	@Test
	public void OpenFireFoxBrowser() throws InterruptedException

	{

		System.setProperty("webdriver.gecko.driver", ".\\BrowserDrivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.close();

	}
}
