package testScripts;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.BaseClass;
@Listeners(utilities.Screenshots.class)
public class SmokeTest extends BaseClass{
@Test
public void ST_001()
{
	Reporter.log("Smoke Test and regression",true);
}

}
