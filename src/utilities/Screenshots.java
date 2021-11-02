package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Screenshots implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
	}
	@Override
	public void onStart(ITestContext arg0) {
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	}
	@Override
public void onTestFailure(ITestResult result) {
String name=result.getMethod().getMethodName();
EventFiringWebDriver efs=new EventFiringWebDriver(BaseClass.driver);
File src=efs.getScreenshotAs(OutputType.FILE);
File des=new File("D:\\New folder\\Selenium-Feb\\Demo\\FailedScreen\\"
		+name+System.currentTimeMillis()+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			System.out.println("Screenshot not copied");
			e.printStackTrace();
		}		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	String name=result.getMethod().getMethodName();
EventFiringWebDriver efs=new EventFiringWebDriver(BaseClass.driver);
	File src=efs.getScreenshotAs(OutputType.FILE);
File des=new File("D:\\New folder\\Selenium-Feb\\Demo\\PassedScreen\\"
	+name+System.currentTimeMillis()+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			System.out.println("Screenshot not copied");
			e.printStackTrace();
		}	
	}

}
