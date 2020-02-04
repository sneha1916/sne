package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String chromePath="C:\\Users\\Training_B6B.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", chromePath);
WebDriver driver =new ChromeDriver();
driver.get("http://www.demoaut.com/");

driver.findElement(By.linkText("REGISTER")).click();
driver.findElement(By.name("firstName")).sendKeys("Rakesh");
driver.findElement(By.name("lastName")).sendKeys("Kumar");
driver.findElement(By.name("phone")).sendKeys("9988995566");
driver.findElement(By.id("userName")).sendKeys("bmc.com");



driver.findElement(By.name("address1")).sendKeys("ss");
driver.findElement(By.name("city")).sendKeys("banglore");
driver.findElement(By.name("state")).sendKeys("karnataka");
driver.findElement(By.id("postalCode")).sendKeys("560010");




Select select = new Select(driver.findElement(By.className("country")));
select.selectByVisibleText("INDIA");



driver.findElement(By.id("email")).sendKeys("bmc1232");
driver.findElement(By.name("password")).sendKeys("bmc");
driver.findElement(By.name("confirmPassword")).sendKeys("bmc");
driver.findElement(By.name("register")).click();

	}

}
