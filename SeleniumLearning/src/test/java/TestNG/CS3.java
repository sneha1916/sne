package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CS3 {
  @Test
  public void CS3() {
	  String chromePath="C:\\Users\\Training_B6B.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", chromePath);
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
	    
	    driver.findElement(By.name("userName")).sendKeys("sneha");
	    driver.findElement(By.xpath("//span[@id='err']")).click();
	    
	    String str=driver.findElement(By.tagName("h3")).getText();
	    
	    if(str.equals("Available"))
	    {
	    	driver.findElement(By.id("firstName")).sendKeys("sneha");
	    	driver.findElement(By.id("lastName")).sendKeys("nn");
	    	driver.findElement(By.id("password")).sendKeys("sneha123");
	    	driver.findElement(By.id("pass_confirmation")).sendKeys("sneha123");
	    	driver.findElement(By.xpath("(//input[@id='gender'])[2]")).click();
	    	driver.findElement(By.id("emailAddress")).sendKeys("sneha@gmail.com");
	    	driver.findElement(By.id("mobileNumber")).sendKeys("8867626373");
	    	driver.findElement(By.xpath("(//input[@id='dob'])")).sendKeys("16/04/1996");
	    	driver.findElement(By.id("address")).sendKeys("banglorebanglore");
	    	Select sq =new Select(driver.findElement(By.id("securityQuestion")));
	    	sq.selectByValue("411010");
	    	driver.findElement(By.id("answer")).sendKeys("sankeshwar");
	    	driver.findElement(By.xpath("//input[@name='Submit']")).click();
	    	System.out.println("user registered successfully");
	    	
	    }
	    else
	    {
	    	System.out.println("program failed");
	    }
  }
}
