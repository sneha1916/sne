package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CS5 {
  @Test
  public void CS5() {
	  String chromePath="C:\\Users\\Training_B6B.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", chromePath);
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	    
	    driver.findElement(By.name("userName")).sendKeys("sneha");
	    driver.findElement(By.id("password")).sendKeys("sneha123");
	    driver.findElement(By.xpath("//input[@name='Login']")).click();
	    driver.findElement(By.id("myInput")).sendKeys("head");
	    driver.findElement(By.xpath("//form//input[@name='val']")).click();
	    driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Cart')]")).click();
	    driver.findElement(By.partialLinkText("Checko")).click();
	    driver.close();
	    
  }
}
