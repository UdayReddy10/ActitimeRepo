package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.SeleniumUtils;

public class TasksPage {
@FindBy(xpath="//div[text()='Add New']")
public WebElement addNewBtn;

@FindBy(xpath="//div[contains(text(),'New Customer')]")
public WebElement newCustomerBtn;

@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
public WebElement customerNameTxtBox;

@FindBy(xpath="//div[text()='Create Customer']")
public WebElement createCustomerBtn;

public void createCustomer(String customerName)
{
addNewBtn.click();
newCustomerBtn.click();
SeleniumUtils.waitTillElementVisible(customerNameTxtBox);
SeleniumUtils.enterValue(customerNameTxtBox, customerName);
createCustomerBtn.click();
}
}
