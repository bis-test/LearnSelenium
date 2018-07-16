package selenium.concepts.exceptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ElementNotSelectableExceptionDemo {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_disabled");
		WebElement frm = driver.findElementById("iframeResult");
		driver.switchTo().frame(frm);
			
        WebElement ind= driver.findElementById("createLeadForm_dataSourceId");
	    Select dd = new Select(ind);
	    dd.selectByVisibleText("Conference");
	    //dd.selectByValue("IND_AEROSPACE");

	}

}
