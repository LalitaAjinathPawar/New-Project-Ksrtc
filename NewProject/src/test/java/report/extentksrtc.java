package report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentksrtc {
	static ExtentReports extent;
	
	public static ExtentReports reportGeneration()
	{   extent = new ExtentReports();
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter("report.html");
		sparkReporter.config().setReportName("KSRTC");
		sparkReporter.config().setDocumentTitle("TestReportKSRTC");
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Host Name", "Selenium-Webdriver");
        extent.setSystemInfo("Environment", "QA");
       extent.setSystemInfo("Tester Name", "Lalita Pawar");
       
       
       return extent;
	}

}
