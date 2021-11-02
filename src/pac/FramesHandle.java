package pac;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandle {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Admin\\Downloads\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https:/selenium.dev");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[text()='Downloads']")).click();
	driver.findElement(By.xpath("(//a[text()='API Docs'])[3]")).click();
	driver.findElement(By.xpath("(//a[text()='Frames'])[1]")).click();
driver.switchTo().frame("classFrame");
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
driver.switchTo().defaultContent();
WebElement wb=driver.findElement(By.xpath
		("//iframe[@src='allclasses-frame.html']"));
driver.switchTo().frame(wb);
driver.findElement(By.xpath("//a[text()='Actions']")).click();
driver.switchTo().defaultContent();
driver.switchTo().frame(2);//index starts from 0
driver.findElement(By.id("search")).sendKeys("Samantha");

}
}



