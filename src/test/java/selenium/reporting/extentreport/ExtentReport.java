package selenium.reporting.extentreport;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) throws IOException {
		
		ExtentHtmlReporter html= new ExtentHtmlReporter("./Report/Result.html");
		html.setAppendExisting(true);

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		ExtentTest test = extent.createTest("TC001_Create Lead", "Create a new lead in leaftaps");
		test.pass("The data DemoSalesManager entered successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img.png").build());
	    test.fail("The Data crmsfa is not entered successfully");
		
		extent.flush();
		test.assignCategory("Smoke Testing");
	    test.assignAuthor("Biswajit Sundara");
	    
	    System.out.println("Report Generated Successfully");
	
	}

}
