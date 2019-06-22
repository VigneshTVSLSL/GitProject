package testPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Properties22June2019 {

	@Test(priority = 0)
	public void getValueFromPropertyFile() throws IOException {

		Properties prop = new Properties();

		String projectpath = System.getProperty("user.dir");

		FileInputStream propfis = new FileInputStream(projectpath + "\\TestData\\config.properties");

		prop.load(propfis);

		String filevalue = prop.getProperty("name");

		System.out.println("Property file value is" + filevalue);

	}

	@Test(priority = 1)
	public static void putValueInPropertFile() throws IOException

	{
		Properties prop = new Properties();

		String projectpath = System.getProperty("user.dir");

		FileOutputStream fileops = new FileOutputStream(projectpath + "\\TestData\\config.properties");

		prop.setProperty("date", "22June2019");

		prop.store(fileops, projectpath);

		String setValue = prop.getProperty("date");

		System.out.println("Values defined in Prperty file is:  " + setValue);

	}

}
