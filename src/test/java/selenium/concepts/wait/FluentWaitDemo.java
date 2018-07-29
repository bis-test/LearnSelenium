package selenium.concepts.wait;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	//private static final TimeUnit SECONDS = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Declare variables
		String eTitle = "Insurance Broker System - Login";
		String aTitle = "" ;

		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/" );

		//Maximizes the browser window
		driver.manage().window().maximize() ;

		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				//.withTimeout(30, TimeUnit.SECONDS)
				//.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement ele= wait.until(new Function<WebDriver, WebElement>(){

			public WebElement apply(WebDriver driver ) {
				return driver.findElement(By.xpath("//a[text()='Insurance Project']"));
			}
		});
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


