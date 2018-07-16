package selenium.concepts.alerts;
import org.openqa.selenium.chrome.ChromeDriver;
public class PromptAlert {

	public static void main(String[] args) {

		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		//go to w3 schools prompt alert page
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame(driver.findElementById("iframeResult"));

		//click on the button
		driver.findElementByXPath("//button[text()=\"Try it\"]").click();

		//test prompt alert
		//driver.switchTo().alert().sendKeys("Biswajit");
		//driver.switchTo().alert().accept();;

		System.out.println(driver.findElementById("demo").getText());

	}

}
