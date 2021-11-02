package pac;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fb {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Admin\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.linkText("English (UK)")).click();
	driver.findElement(By.linkText("Create New Account")).click();
	WebDriverWait wait=new WebDriverWait(driver, 10);
	//wait.until(ExpectedConditions.presenceOfElementLocated
	//	(By.name("reg_email__"))).sendKeys("1234567898");
wait.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.name("reg_email__")))).sendKeys("5464785");
	}
}
