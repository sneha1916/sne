package TestNG;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindow {
	public static void main(String args[]) throws InterruptedException {
		
    String chromePath="C:\\Users\\Training_B6B.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", chromePath);
    WebDriver driver = new ChromeDriver();
    
    driver.get("http://demo.guru99.com/popup.php");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    driver.findElement(By.xpath(".//a[contains(text(),'Click Here)]")).click();
    
    String MainWindow=driver.getWindowHandle();
    System.out.println("main window unique no"+MainWindow);
    
    Set<String> s1=driver.getWindowHandles();
    
    for (String string : s1) {
    	String ChildWindow=string;
    	System.out.println("child Window unique no"+ChildWindow);
    	
    	driver.switchTo().window(ChildWindow);
    }
    driver.findElement(By.name("email")).sendKeys("abc@.com");
    
    driver.findElement(By.name("btnLogin")).click();
    
    driver.switchTo().window(MainWindow);
    

  }
}
