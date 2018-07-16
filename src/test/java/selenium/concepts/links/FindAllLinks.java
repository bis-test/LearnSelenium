package selenium.concepts.links;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

	public static void main(String[] args) {

		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		//open google website
		driver.get("https://www.w3schools.com/");

		//Find all links on the page
		List<WebElement> links = driver.findElementsByTagName("a");

		//Print the total number of links
		System.out.println("Total number of links= "+links.size());

		//Print all the links
		for (int i = 1; i<=links.size(); i=i+1)

		{

			System.out.println(links.get(i).getText());

		}

	}

}
