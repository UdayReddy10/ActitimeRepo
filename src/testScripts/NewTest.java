package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Reporter;
public class NewTest {
  @Test
  public void f() {
	  
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals("Java", "Java1");
	  Reporter.Log("Abc");
	  
  }
}
