package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Constants;
import utilities.SeleniumUtils;

public class LoginPage {
@FindBy(id="username")
public WebElement userNametxtBox;

@FindBy(name="pwd")
public WebElement passwordTxtBox;

@FindBy(id="loginButton")
public WebElement loginButton;

/*
 * This method is to perform login operation
 * @author->EmpId
 *
 */
public void login()
{
	SeleniumUtils.enterValue(userNametxtBox, Constants.USERNAME);
	SeleniumUtils.enterValue(passwordTxtBox, Constants.PASSWORD);
	loginButton.click();
}
}
