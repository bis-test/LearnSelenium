//@author - Biswajit Sundara
//@Date- 07/21/2018
//@Description - Web driver program using browsers - Chrome, Firefox, IE
/*
 * WebDriver is an interface that extends another interface SearchContext
 * SearchContext is the super set of WebDriver
 *
 * WebDriver driver = new WebDriver(); doesn't work because we can't create object of an interface.
 * We can create object of classes that implements the interface
 * 
 * FirefoxDriver extends RemoteWebDriver implements WebDriver.
 * ChromeDriver extends RemoteWebDriver implements WebDriver.
 * 
 * driver is the object. Once it is created, it is a driver either for Firefox or Chrome 
 * so it will interact with that browser.
 * 
 * WebDriver driver = new FirefoxDriver();
 * WebDriver is interface
 * driver is object of firefox class
 * FireFoxDriver() is the constructor of the FirefoxDriver class.
 * 
 * @verified - 07/22/2018
 */


package selenium.concepts.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverDemo {

	public static void main(String[] args) {

		//Set the system property
		//static String setProperty(String key, String value)
		//As we can see the arguments. One is the key and other is the value.
		//So we are telling the control to set the property webdriver.ie.driver
		//And the value to be set is the path of the driver.
		//firefox doesn't require this but for chrome & IE this is required.
		//SecurityException − if a security manager exists and its checkPermission method doesn't allow setting 
		//of the specified property.
		//This is a java method. We can use this to set other properties etc.
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		String property = System.getProperty("webdriver.ie.driver");
		System.out.println(property);

		//driver is the reference variable. 
		//Having a reference variable of type WebDriver allows us to assign the driver object 
		//to different browser specific drivers. Thus allowing multi-browser testing by assigning 
		//the driver object to any of the desired browser.
		WebDriver driver;

		//creating an object of internet explorer class
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle()+" Launched Successfully");
		driver.close();

		/*****************************************************************************/

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_64bit.exe");
		//creating an object of firefox class
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//we have already seen how get method works, try navigate().to(url) this time.
		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getTitle()+" Launched Successfully");
		driver.close();

		/*****************************************************************************/ 

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//creating an object of chrome class
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle()+" Launched Successfully");
		//close browser
		//This is a method in RemoteWebDriver
		//void close()
		//execute(DriverCommand.CLOSE);
		driver.close();


	}

}
