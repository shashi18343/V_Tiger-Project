package com.crm.GenericUtility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementation  implements ITestListener{

	ExtentReports report;
	ExtentTest test;
	public void onTestStart(ITestResult result) 
	//execution starts from here
	{
		String MethodName = result.getMethod().getMethodName();
		test=report.createTest(MethodName);
		Reporter.log(MethodName+"----> TestScript Execution Started <-----");
	
	
	}

	public void onTestSuccess(ITestResult result) {
	
		
		String MethodName=result.getMethod().getMethodName();
		test.log(Status.PASS,MethodName+"------->passed<------");
		Reporter.log(MethodName+"---->TestScriptExecution Successfull<----");
	
	}
	

	public void onTestFailure(ITestResult result) {
		
		String FailedScript = result.getMethod().getMethodName();
		JavaUtility jLib=new JavaUtility();
		String fs=FailedScript+jLib.getSystemDateAndTimeFormat();
		
		EventFiringWebDriver ts= new EventFiringWebDriver(BaseClass.sdriver);
		File src = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./Screenshot/"+fs+".png");
		 String filepath = dest.getAbsolutePath();
		 try
		 {
		 FileUtils.copyFile(src, dest);
		 }
		 catch (Exception e) {
			 e.printStackTrace();
		}
		 test.addScreenCaptureFromPath(filepath);
		 test.log(Status.FAIL,result.getThrowable());
		 Reporter.log("----->TestScript Execution Failed<-----");
		 
		}

	public void onTestSkipped(ITestResult result) {
	
		String MethodName=result.getMethod().getMethodName();
		test.log(Status.SKIP, MethodName+"---->Skipped");
		Reporter.log("--->TestScript Execution Skipped<---");
		
		
	}

	public void onStart(ITestContext context) {
		
		//To configure html report
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("./ExtentReport/report.html");
		htmlReport.config().setDocumentTitle("SDET-45 ExtentReport");
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.config().setReportName("VTiger Report");
		
		
		 report = new ExtentReports();
		report.attachReporter(htmlReport);
		report.setSystemInfo("Base Browser","chrome");
		report.setSystemInfo("OS","Windows");
		report.setSystemInfo("Base-Url","https://localhost:8888");
		report.setSystemInfo("Reporter Name", "shashi");
	}

	public void onFinish(ITestContext context) {
	
		//consolidate the report
		report.flush();
	}

}













