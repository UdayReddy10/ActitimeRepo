package pac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Admin\\Downloads\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Admin/Desktop/Demo.html");
	WebElement dropDwn=driver.findElement(By.id("food"));
	Select drop=new Select(dropDwn);
	System.out.println(drop.isMultiple());
	int total=drop.getOptions().size();
	for(int i=0;i<total;i=i+2)
	{
		drop.selectByIndex(i);
	}
	WebElement first=drop.getFirstSelectedOption();
	System.out.println("First Selected option="+first.getText());
	List<WebElement> all=drop.getAllSelectedOptions();
	System.out.println("Displaying all selected options");
	for(int i=0;i<all.size();i++)
	{
		System.out.println(all.get(i).getText());
	}
	
}
}