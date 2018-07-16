//@Author- Biswajit Sundara
//@Date- 07/08/2018
/*
 * This is a commonly asked interview question
 * How to take screen shot of popups in selenium? 
 * This program takes screen shot of pop up using robot class
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
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShotOfPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		// set the chromedriver property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Launch browser
		ChromeDriver driver = new ChromeDriver();

		//open the webpage
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		// create object to robot class
		Robot rb = new Robot();

		// create rectangle for full screenshot
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

		// capture screen of the desktop
		BufferedImage screenFullImage= rb.createScreenCapture(screenRect);

		// save the screenshot to local system
		ImageIO.write(screenFullImage, "png", new File("./snap/Alert2.png"));

		//print the message
		System.out.println("Screenshot is captured successfully");

		//Close the webdriver
		System.out.println("Browser is closed");
		driver.quit();

	}

}
