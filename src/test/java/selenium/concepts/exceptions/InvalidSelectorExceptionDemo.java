package selenium.concepts.exceptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class InvalidSelectorExceptionDemo {


	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_disabled");
		WebElement frm = driver.findElementById("iframeResult");
		driver.switchTo().frame(frm);
		WebElement ele = driver.findElementByXPath("/button[text()=='Click Me!']");
        ele.getText();


	}


}


