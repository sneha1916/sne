package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebElementToursDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String iePath="C:\\Users\\Training_B6B.01.07\\Desktop\\selenium\\jars\\IEDriverServer.exe";
  System.setProperty("webdriver.ie.driver", iePath);
  WebDriver driver =new InternetExplorerDriver();
  driver.get("http://newtours.demoaut.com/");
  String title=driver.getTitle();
  System.out.println(title);
  
  WebElement Uname =driver.findElement(By.className("userName"));
  Uname.sendKeys("mercury");
  Uname.clear();
  
  WebElement Pwd =driver.findElement(By.name("password"));
  Pwd.sendKeys("mercury");
  
  WebElement signIn = driver.findElement(By.name("login"));
  signIn.click();
  
  WebElement home =driver.findElement(By.linkText("Home"));
  String text=home.getText();
  System.out.println(text);
  home.click();
	}

}
