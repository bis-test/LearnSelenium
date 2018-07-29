package selenium.design.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCase {

	@Test
	public void check_valid_user()
	{
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://leaftaps.com/opentaps");
		LoginPage logp = PageFactory.initElements(driver, LoginPage.class);
		logp.login_leaftaps("DemoSalesManager", "crmsfa");
	}
}
