package pac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Admin\\Downloads\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement submitBtn=driver.findElement(By.name("submit"));
	submitBtn.submit();
	Alert alt=driver.switchTo().alert();
	String errorMsg=alt.getText();
	System.out.println(errorMsg);
	Thread.sleep(2000);
	alt.dismiss();
	Thread.sleep(2000);
	submitBtn.submit();
	alt=driver.switchTo().alert();
	Thread.sleep(2000);
	alt.accept();
}
}
