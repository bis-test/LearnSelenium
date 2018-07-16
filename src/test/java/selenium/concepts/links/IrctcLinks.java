package selenium.concepts.links;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcLinks {

	public static void main(String[] args) {

		//Launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//open the website
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().window().maximize();

		List<WebElement> alinks = driver.findElementsByTagName("a");
		int size1 = alinks.size();
		System.out.println(size1);


		for (WebElement linkitem : alinks) {

			String url= linkitem.getAttribute("href");
			if(url!=null)
			{
				System.out.println(linkitem.getAttribute("href"));
			}
		}

	}

}
