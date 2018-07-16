//@Author- Biswajit Sundara
//@Date- 07/08/2018
/*
 * This is a commonly asked interview question
 * Can we upload documents in selenium?
 * This program demonstrates how we can achieve that.
 */

package selenium.interviewq.challenges;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDocuments {

	public static void main(String[] args) throws InterruptedException {

		// set the chromedriver property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Launch browser
		ChromeDriver driver = new ChromeDriver();

		//open the webpage
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//Upload document
		//WebElement upload = driver.findElementByXPath("//input[@value='Upload CV']");
		//upload.click();
		
		
		//Upload the document
		WebElement file = driver.findElementByXPath("//input[@type='file']");
		file.sendKeys("C:\\RESUME.docx");
		
		//Print the message
		System.out.println("File uploaded successfully");

		//Close the browser
		driver.quit();
	}

}
