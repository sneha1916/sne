package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromePath="C:\\Users\\Training_B6B.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.demoaut.com/");
		
		
		
		driver.findElement(By.xpath("//td[2]/inpit")).sendKeys("mercury");
		driver.findElement(By.xpath("//tr[3]/td[2]input")).sendKeys("mercury");
		driver.findElement((By.xpath("//div/input"))).click();
		
		
		driver.findElement(By.xpath("//a[contains(@href,'mercurywelcome.php')]")).click();
		
	}

}
