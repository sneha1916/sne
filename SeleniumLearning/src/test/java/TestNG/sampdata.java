package TestNG;

import org.testng.annotations.DataProvider;

public class sampdata {
 
  @DataProvider
  public static Object[][] dp() {
    return new Object[][] {
      new Object[] { 25, "Ram" },
      new Object[] { 30, "Raj" },
      new Object[] { 31, "bmc" },
    };
  }
}
