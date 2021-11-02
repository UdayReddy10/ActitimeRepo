package testScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.TasksPage;
import utilities.BaseClass;
import utilities.ExcelLib;

public class RegressionTest extends BaseClass{
	
	@Test
	public void createCustomerTest() throws Exception
	{
		HomePage hp=PageFactory.initElements(BaseClass.driver, HomePage.class);
		hp.navigateToTask();
		Thread.sleep(5000);
		System.out.println(BaseClass.driver.getTitle());
		System.out.println("actiTIME -  Task List");
		Assert.assertEquals(BaseClass.driver.getTitle(), "actiTIME - Task List","Title is not matching");
		Reporter.log("Navigated to Tasks page",true);
		ExcelLib exe=new ExcelLib();
		String customerName=exe.readStringData("Customer", 2,0);
		TasksPage tp=PageFactory.initElements(BaseClass.driver, TasksPage.class);
		tp.createCustomer(customerName);
		Reporter.log("Customer created Successfully");
	}

}
