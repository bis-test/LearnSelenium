package selenium.concepts.alerts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popup {

	public static void main(String[] args) {
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Browser options
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(op);
		//open the website
		driver.get("https://www.redbus.in/bus-tickets/");
		driver.manage().window().maximize();

	}

}
