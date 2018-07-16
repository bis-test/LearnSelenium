package selenium.concepts.exceptions;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementExceptionDemo {

	public static void main(String[] args) {

				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();

				// launch Chrome and redirect it to the Base URL
				driver.get("https://www.freecrm.com/index.html");


				
				WebElement username = driver.findElementByName("username");
				driver.navigate().refresh();
				try {
					username.sendKeys("biswajitsundara");
				} catch (StaleElementReferenceException e) {
			        System.err.println("Stale Element Exception encountered");
			        
			        //relocating element again to fix the exception
			        WebElement username1 = driver.findElementByName("username");
			        username1.sendKeys("biswajitsundara");
			        
					
				}
				
				



			}

		
		
		
	}

