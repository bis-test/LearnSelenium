package selenium.concepts.alerts;
import org.openqa.selenium.chrome.ChromeDriver;
public class ConfirmationAlert {

	public static void main(String[] args) {

		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		//go to w3 schools confirmation alert page
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame(driver.findElementById("iframeResult"));

		//click on the button
		driver.findElementByXPath("//button[text()=\"Try it\"]").click();

		//test simple alert
		String text1=driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		System.out.println("The alert text=" +text1);
		System.out.println(driver.findElementById("demo").getText());

	}

}
