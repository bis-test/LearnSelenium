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
		WebElement frame1 = driver.findElementById("iframeResult");
		driver.switchTo().frame(frame1);
		driver.findElementByXPath("//button[text()=\"Try it\"]").click();
		System.out.println("Frame by webelement is tested");
		
		

	}

}
