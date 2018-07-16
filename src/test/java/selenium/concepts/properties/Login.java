package selenium.concepts.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws IOException {


		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Create properties object
		Properties prop= new Properties();

		//Locate the file and load
		FileInputStream file1= new  FileInputStream("./src/main/java/propertiesdemo/config.properties");
		prop.load(file1);

		//Print the file contents
		Enumeration KeyValues = prop.keys();
		while (KeyValues.hasMoreElements()) {
			String key = (String) KeyValues.nextElement();
			String value = prop.getProperty(key);
			System.out.println(key + ":- " + value);
		}

		//Read the URL from property file and navigate
		String url= prop.getProperty("URL");
		driver.get(url);

		//Crate another properties object for locators
		Properties obj= new Properties();

		//Locate the file and load
		FileInputStream file2= new  FileInputStream("./src/main/java/propertiesdemo/object.properties");
		obj.load(file2);

		//Print the file contents
		Enumeration KeyValues1 = obj.keys();
		while (KeyValues1.hasMoreElements()) {
			String key1 = (String) KeyValues1.nextElement();
			String value1 = obj.getProperty(key1);
			System.out.println(key1 + ":- " + value1);
		}

		//Read the user name locator from property file and enter values
		String str1= obj.getProperty("Login.UserName.Id");
		WebElement uname=driver.findElementById(str1);
		uname.sendKeys("DemoSalesManager");

		//Read the password locator from property file and enter values
		String str2=obj.getProperty("Login.Password.Id");
		WebElement pwd=driver.findElementById(str2);
		pwd.sendKeys("crmsfa");

		//Read the locator of login button from the file and click
		String str3=obj.getProperty("Login.LoginButton.Class");
		WebElement button=driver.findElementByClassName(str3);
		button.click();

	}

}
