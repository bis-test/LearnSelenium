package selenium.concepts.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Set the implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		//Declare variables
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;

		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/" );
		
		//Maximizes the browser window
		driver.manage().window().maximize() ;
		
		//get the actual value of the title
		aTitle = driver.getTitle();
		
		//compare the actual title with the expected title
		if (aTitle.equals(eTitle))
		{
			System.out.println( "Test Passed") ;
		}
		else {
			System.out.println( "Test Failed" );
		}
	}

}
