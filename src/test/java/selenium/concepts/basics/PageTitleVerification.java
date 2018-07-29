//@author-Biswajit Sundara
//@date- 07/17/2018
//@desc- This is a basic program of selenium
//The code opens google.com, searches for selenium and clicks on a link
//Then verifies if the browser title matches with expected value.
//@codeverified - Yes


package selenium.concepts.basics;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitleVerification
{

	public static void main(String[] args)
	{


		//System is a class and set property is the method
		//static String setProperty(String key, String value)
		//return (String) props.setProperty(key, value);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//ChromeDriver is the class that extends RemoteWebDriver
		//Here we are creating a new instance of ChromeDriver class
		//public class ChromeDriver extends RemoteWebDriver
		//class RemoteWebDriver implements WebDriver
		//interface WebDriver extends SearchContext (interface)
		ChromeDriver driver = new ChromeDriver();

		//get is a method available in RemoteWebDriver
		//public void get(String url)
		//Doesn't return anything, it executes
		driver.get("http://www.google.com");

		//manage is a method in RemoteWebDriver class
		//public Options manage()
		//return new RemoteWebDriverOptions();
		driver.manage().window().maximize();


		//WebElement is an interface
		//findElementById is a method in RemoteWebDriver
		//public WebElement findElementById(String using)
		//return findElement("id", using);
		WebElement search = driver.findElementById("lst-ib");

		//sendKeys is a method
		//void sendKeys(CharSequence... keysToSend);
		search.sendKeys("Selenium", Keys.ENTER);

		//findElementByLinkText is a method in RemoteWebDriver
		//public WebElement findElementByLinkText(String using) {
		//return findElement("link text", using);
		driver.findElementByLinkText("Selenium - Web Browser Automation").click();

		//expectedtitle is a variable of string type.
		//actualtitle is a variable of string type.
		String expectedtitle="Selenium - Web Browser Automation";
		String actualtitle="";

		//gettitle is a method in RemoteWebDriver class
		//public String getTitle()
		//Returns value.toString(); or null
		actualtitle= driver.getTitle();

		//compares if the actual title matches with expected title
		if (actualtitle.contentEquals(expectedtitle))
		{
			System.out.println("Test Passed!");
		}
		else
		{
			System.out.println("Test Failed");
		}


		//close browser
		//This is a method in RemoteWebDriver
		//void close()
		//execute(DriverCommand.CLOSE);
		driver.close();

	}

}