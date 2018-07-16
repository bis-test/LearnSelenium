package selenium.concepts.webtable;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo1 {

	public static void main(String[] args) {
		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		//go to w3 schools confirmation alert page
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");

		List<WebElement> col = driver.findElementsByXPath("//*[@id=\"leftcontainer\"]/table/thead/tr/th");

		System.out.println("Number of columns are ="+col.size());


		List<WebElement> row = driver.findElementsByXPath("	//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]");

		System.out.println("Number of rows are ="+row.size());


	}

}
