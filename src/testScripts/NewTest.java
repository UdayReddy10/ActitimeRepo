package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
  @Test
  public void f() {
	  //Assert.assertEquals("Java","Java1");
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals("Java", "Java1");
	  System.out.println("Abc");
	  Assert.assertTrue(false,"Method is returning false");
  }
}
