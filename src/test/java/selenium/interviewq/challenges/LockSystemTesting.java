//@Author- Biswajit Sundara
//@Date- 07/08/2018
/*
 * This is a commonly asked interview question
 * Can we execute selenium test cases when system is locked.
 * This program demonstrates how we can achieve that.
 */

package selenium.interviewq.challenges;

import java.io.File;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

public class LockSystemTesting {

	public static void main(String[] args) throws InterruptedException {
		// set the chrome driver property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");


		//Launch browser
		ChromeDriver driver = new ChromeDriver();

		//open the webpage
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		//Manually Lock your system
		System.out.println("Lock your system and go");
		Thread.sleep(3000);
		
		
		//Search in google
		driver.findElementByName("q").sendKeys("President Of India");
		driver.findElementByName("q").sendKeys(Keys.ENTER);
		
		
		//Open the link
		Thread.sleep(3000);
		driver.findElementByLinkText("Welcome to the website of The President of India").click();

		//Manually Unlock your system
		System.out.println("Unlock your system and check");
		
		//print the browser title
		System.out.println(driver.getCurrentUrl());
		
		//Close the browser
		driver.quit();
		
		
		
		
		

	}

}
