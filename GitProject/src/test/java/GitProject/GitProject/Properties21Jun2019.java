package GitProject.GitProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Properties21Jun2019 {

	public static Properties prop = new Properties();
	public static String projectpath = System.getProperty("user.dir");

	public Properties21Jun2019() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		getValueFromPropertyFile();
		setValueInToPropertyFile();

	}

	public static void getValueFromPropertyFile() throws IOException

	{

		try {

			InputStream propfile = new FileInputStream(projectpath + "\\TestData\\config.properties");
			prop.load(propfile);
			String propvalue = prop.getProperty("name");
			System.out.println("Property Value is :" + propvalue);

		} catch (FileNotFoundException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void setValueInToPropertyFile() throws IOException

	{

		FileOutputStream propsetvalue = new FileOutputStream(projectpath + "\\TestData\\config.properties");

		prop.setProperty("MobileNo", "1234456");
		prop.store(propsetvalue, projectpath);

		System.out.println(prop.getProperty("MobileNo"));

	}

}
