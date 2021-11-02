package pac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Admin\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://monster.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath
		("(//a[@title='Click to upload your resume'])[1]")).click();
	Thread.sleep(3000);
	WebElement wb=driver.findElement(By.xpath
			("(//button[text()='Or select file to upload'])[1]"));
	Actions act=new Actions(driver);
	act.moveToElement(wb).click(wb).perform();
	String filePath="D:\\test\\Test.pdf";
	FileUpload.uploadFile(filePath);
	}
public static void uploadFile(String filePath) throws Exception
	{
	//Take the data to transfer
	StringSelection sel=new StringSelection(filePath);
	//Get the System clipboard control and set the contents to copy
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(1500);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
