package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class NewTest{
  @Test(dataProvider = "dp")
  public void dp( String user,String pwd,String confPwd) throws InterruptedException {
	  String chromePath="C:\\Users\\Training_B6B.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", chromePath);
	  WebDriver driver =new ChromeDriver();
	  
	  driver.get("http://demoaut.com/");
	  
	  driver.findElement(By.partialLinkText("REGISTER")).click();
	  driver.findElement(By.id("email")).sendKeys(user);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.name("confirmPassword")).sendKeys(confPwd);
	  
	  Thread.sleep(3000);
	  driver.close();
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"bmc" , "bmc123", "bmc123"},
      new Object[] {"cmb" , "abc123","abc123" },
      new Object[] { "Rajkumar", "acb123", "acb123"},
    };
  }
}
