package selenium.concepts.links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {

		//1.Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		//2. open w3schools website
		driver.get("https://www.w3schools.com/");

		//3.Get list of all links/images
		List<WebElement> links = driver.findElementsByTagName("a");
		List<WebElement> imgs = driver.findElementsByTagName("img");
		links.addAll(imgs);

        //4.Create an array list to store active links
		List<WebElement> activelinks= new ArrayList<WebElement>();

		//5. Iterate the list: Eliminate links/images not having href attribute
		for(int i =0; i<links.size();i++)

		{
			System.out.println(links.get(i).getAttribute("href"));
			if(links.get(i).getAttribute("href")!= null && !(links.get(i).getAttribute("href").contains("javascript")))
			{
				activelinks.add(links.get(i));

			}
		}



		//6.Check the URL with httpconnection api
		//200- OK
		//404 - Not found
		//500 - Internal error
		//400 - Bad request
		for(int j =0; j<activelinks.size();j++)
		{

			HttpURLConnection connection= (HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href")+"---->"+response);

		}

		//Print the total number of links
		System.out.println("Total number of links= "+links.size());
		System.out.println("Total number of links= "+activelinks.size());


	}

}
