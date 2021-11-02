package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {

public static void pageload(long time)
{
	BaseClass.driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
}
public static void enterValue(WebElement element,String value)
{
	if(element.isDisplayed()&& element.isEnabled())
	{
		element.sendKeys(value);
	}
}
public static void waitTillElementVisible(WebElement element)
{
	WebDriverWait wait=new WebDriverWait(BaseClass.driver, 30);
	wait.until(ExpectedConditions.visibilityOf(element));
}
}
