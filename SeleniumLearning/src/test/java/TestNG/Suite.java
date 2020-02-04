package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Suite {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("Inside before youe method");
  }
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("Inside after youe method");
  }
  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("Inside before youe class");
  }
  @AfterClass
  public void afterClass()
  {
	  System.out.println("Inside before youe class");
  }
  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("Inside before youe test");
  }
  @AfterTest
  public void aftertest()
  {
	  System.out.println("Inside before youe test");
  }
}
