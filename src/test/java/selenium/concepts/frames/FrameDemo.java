package selenium.concepts.frames;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {

		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		//Open w3 schools
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");


		//select frame using web element id
		//Approach-1
		//Using webElement
		WebElement frame1 = driver.findElementById("iframeResult");
		driver.switchTo().frame(frame1);
		driver.findElementByXPath("//button[text()=\"Try it\"]").click();
		System.out.println("Frame by webelement is tested");

		//Move back to the parent frame
		driver.switchTo().alert().accept();
		driver.switchTo().parentFrame();

		//comment the above two lines and uncomment the below line
		//Approach -2
		//Using name or id.
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()=\"Try it\"]").click();
		System.out.println("Frame by webelement is tested");



		//Move back to the parent frame
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();

		//comment the above two lines and uncomment the below line
		//Approach -3
		//Using index
		driver.switchTo().frame(1);
		driver.findElementByXPath("//button[text()=\"Try it\"]").click();
		System.out.println("Frame by webelement is tested");



	}

}
