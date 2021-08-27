package report;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class listeners extends ksrtc implements ITestListener{
	ExtentReports extent=extentksrtc.reportGeneration();
	ExtentTest test;
	
	public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getMethod().getMethodName());
		test.assignAuthor("Lalita Pawar");
	    test.assignCategory("Functional Testing");
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Passed");
		
	}

	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

}
