package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.SeleniumUtils;

public class HomePage {
@FindBy(id="logoutLink")
public WebElement logoutLink;

@FindBy(xpath="//div[text()='Tasks']")
public WebElement tasksTab;
@FindBy(xpath="//div[@title='All Customers']")
public WebElement allCustomersTitle;

public void logout()
{
	if(logoutLink.isEnabled()&&logoutLink.isDisplayed())
	{
	logoutLink.click();
	}
}
public void navigateToTask()
{
	tasksTab.click();
	SeleniumUtils.waitTillElementVisible(allCustomersTitle);
}
}
