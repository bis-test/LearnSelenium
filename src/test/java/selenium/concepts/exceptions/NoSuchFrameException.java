package selenium.concepts.exceptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class NoSuchFrameException{

	public void login() {


		//Launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//open the website
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_close");
		driver.manage().window().maximize();


		WebElement frame = driver.findElementById("iframeResult");	
		driver.switchTo().frame(frame);
		driver.switchTo().frame(2);

	}

}