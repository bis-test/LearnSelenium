//@author-Biswajit Sundara
//@date- 07/22/2018
//@desc- This code finds all the links on IRCTC website.
//@codeverified - Yes


package selenium.concepts.links;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCLinks {

	public static void main(String[] args) {

		//Set System Property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Launch browser
		ChromeDriver driver = new ChromeDriver();

		//Open the website
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().window().maximize();

		//Finding all links on the page.
		List<WebElement> alinks = driver.findElementsByTagName("a");

		//Determining the count of links & printing.
		int size = alinks.size();
		System.out.println(size);

		//Printing the urls
		for (WebElement linkitem : alinks) {

			String url= linkitem.getAttribute("href");
			if(url!=null)
			{
				System.out.println(url);
			}
				

		}

		//close the window
		driver.close();
	}

}
