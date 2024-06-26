package base;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.ExtentReporter;

public class LearnReport {

	public static void main(String[] args) throws IOException {
		
		//Step1: set up the ph for reports folder
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/result.html");
		
		//Step2:Create object for ExtentReports class

		ExtentReports extent=new ExtentReports();

		//Step3: attach the data with the file
		extent.attachReporter(reporter);

		//Step4:Create Testcases and assign test details
		//TestName //TestDescription
		ExtentTest test = extent.createTest("CreateLead", "CreateLead with multiple data");
		test.assignAuthor("Vineeth");
		test.assignCategory("Sanity");

		//Step5: add step level status
		test.pass("Username is entered successfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/username.jpeg").build());
		test.pass("Password is entered successfully");
		test.pass("Login Button is clicked successfully");


		//Step6:flush()-Mandatory step

		extent.flush();

		System.out.println("Done");
	}

}
