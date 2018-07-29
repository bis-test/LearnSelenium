package selenium.concepts.webelements;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();


		//go to the website
		driver.get("http://demo.guru99.com/test/newtours/register.php");


		//Locate the drop down
		WebElement drpcountry = driver.findElementByName("country");
		
		//Select is a class and dd is the object
		Select dd= new Select(drpcountry);


		//Print the drop down size
		int size = dd.getOptions().size();
		System.out.println("Number of items in the drop down=" +size);

		//Print all the options under the drop down
		List<WebElement> alloptions = dd.getOptions();
		for(WebElement eachoption: alloptions)
		{
			System.out.println(eachoption.getText());
		}

		//First way- Select drop down by value.
		dd.selectByVisibleText("INDIA");


		//Second way - Select drop down by value
		//In this example text and values are same, refer to the html code
		//<option value="GUAM">GUAM</option> 
		dd.selectByValue("GUAM");

		//Third way - Select drop down by index
		//For the first value index starts with zero and continues.
		dd.selectByIndex(3);  


		//close the driver
		driver.close();

	}

}







