package pac;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BulkElements {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Admin\\Downloads\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://amazon.in");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	List<WebElement>lst=driver.findElements(By.tagName("a"));
	for(int i=0;i<lst.size();i++)
	{
		System.out.println(lst.get(i).getText());
	}
	System.out.println("Total links="+lst.size());
	
}
}
