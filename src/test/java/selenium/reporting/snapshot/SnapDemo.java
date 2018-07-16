package selenium.reporting.snapshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDemo {

	public static void main(String[] args) throws IOException {

		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		//go to google.com
		driver.get("https://www.google.com/");
		driver.findElementById("lst-ib").sendKeys("hello");

		//Take snap shot
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/img.png");
		FileUtils.copyFile(src, dest);



	}

}