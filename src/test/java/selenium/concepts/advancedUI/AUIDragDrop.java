package selenium.concepts.advancedUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AUIDragDrop {

	public static void main(String[] args) {
		
		//Launch browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
				//open the website
				driver.get("https://jqueryui.com/draggable/");
				driver.manage().window().maximize();
				
              WebElement frame = driver.findElementByClassName("demo-frame");
              driver.switchTo().frame(frame);
              
              WebElement box1 = driver.findElementByXPath("//p[text()='Drag me around']");
              
              Actions builder= new Actions(driver);
              
              
              builder.dragAndDropBy(box1, 100, 100).perform();
	}

}
