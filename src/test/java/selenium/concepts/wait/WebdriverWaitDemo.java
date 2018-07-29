package selenium.concepts.wait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverWaitDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Set the webdriver wait
		//WebDriverWait is a class extends FluentWait class
		//public class WebDriverWait extends FluentWait<WebDriver>
		//WeDriverWait() is the constructor with two arguments
		//public WebDriverWait(WebDriver driver, long timeOutInSeconds)
		WebDriverWait wait=new WebDriverWait(driver, 20);

		//Declare variables
		String eTitle = "Insurance Broker System - Login";
		String aTitle = "" ;

		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/" );

		//Maximizes the browser window
		driver.manage().window().maximize() ;



		//Wait for the element until it becomes clickable.
		WebElement ele = driver.findElementByXPath("//a[text()='Insurance Project']");
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();

		//get the actual value of the title
		aTitle = driver.getTitle();


		//compare the actual title with the expected title
		if (aTitle.equals(eTitle))
		{
			System.out.println( "Test Passed") ;
		}
		else {
			System.out.println( "Test Failed" );
		}
	}

}


