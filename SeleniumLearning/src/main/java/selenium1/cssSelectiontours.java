package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectiontours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromePath="C:\\Users\\Training_B6B.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		
		
		driver.findElement(By.cssSelector("input[name=\"userName\"]")).sendKeys("mercury");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("mercury");
		driver.findElement(By.cssSelector("input[name=\"login\"]")).click();
		driver.findElement(By.cssSelector("a[href='mercurywelcome.php']")).click();
	}

}
