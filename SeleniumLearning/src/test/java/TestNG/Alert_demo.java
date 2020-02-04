package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        String chromePath="C:\\Users\\Training_B6B.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        WebDriver driver =new ChromeDriver();
        
        driver.get("http://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("mngr1234");
        driver.findElement(By.name("password")).sendKeys("Ezvfh");
        driver.findElement(By.name("btnLogin")).submit();
        
        Alert alert=driver.switchTo().alert();
        
        String alertMessage=driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        
        alert.accept();
        
      
  }
}
