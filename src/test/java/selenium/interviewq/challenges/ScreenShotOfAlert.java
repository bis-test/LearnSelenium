//@Author- Biswajit Sundara
//@Date- 07/08/2018
/*
 * This is a commonly asked interview question
 * How to take screen shot of alerts in selenium? 
 * This program takes screen shot of alert using robot class
 */


package selenium.interviewq.challenges;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenShotOfAlert {

	public static void main(String[] args) throws AWTException, IOException {


		// set the chromedriver property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Launch browser
		ChromeDriver driver = new ChromeDriver();

		//open the webpage
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();

		
		//Generate Alert
		WebElement frame1 = driver.findElementByName("iframeResult");
		driver.switchTo().frame(frame1);
		
		WebElement but = driver.findElementByXPath("//button[text()='Try it']");
		but.click();

		//Verify Alert is present
		WebDriverWait wait = new WebDriverWait(driver, 60 /*timeout in seconds*/);
		
		if(wait.until(ExpectedConditions.alertIsPresent())==null)
		    System.out.println("alert was not present");
		
		else
		    System.out.println("alert was present");

		// create object to robot class
		Robot rb = new Robot();

		// create rectangle for full screenshot
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

		// capture screen of the desktop
		BufferedImage screenFullImage= rb.createScreenCapture(screenRect);

		// save the screenshot to local system
		ImageIO.write(screenFullImage, "png", new File("./snap/Alert1.png"));


		//print the message
		System.out.println("Screenshot is captured successfully");

		//Close the webdriver
		driver.quit();
	}

}
