package selenium.concepts.alerts;
import org.openqa.selenium.chrome.ChromeDriver;
public class SimpleAlert {

	public static void main(String[] args) {

		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		//go to w3 schools simple alert page
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.switchTo().frame(driver.findElementById("iframeResult"));

		//click on the button
		driver.findElementByXPath("//button[text()=\"Try it\"]").click();

		//test simple alert
		String text1=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println("The alert text=" +text1);

	}

}
