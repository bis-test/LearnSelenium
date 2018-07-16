package selenium.concepts.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo2 {

	public static void main(String[] args) {

		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		//go to w3 schools confirmation alert page
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");


		WebElement baseTable = driver.findElement(By.tagName("table"));

		//To find third row of table
		WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));

		String rowtext = tableRow.getText();
		System.out.println("Third row of table : "+rowtext);

		//to get 3rd row's 3rd column data
		WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[3]"));

		String valueIneed = cellIneed.getText();
		System.out.println("Cell value is : " + valueIneed); 
		driver.close();

	}

}
