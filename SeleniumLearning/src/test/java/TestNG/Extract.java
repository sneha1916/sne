package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Extract {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl="http://www.demoaut.com/";
        String chromePath="C:\\Users\\Training_B6B.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        WebDriver driver =new ChromeDriver();
        driver.get(baseUrl);
        
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.titleContains("Welcome: Mercury Tours"));
        
        List<WebElement> linkList =driver.findElements(By.tagName("a"));
        
        System.out.println("Number of links:-" + linkList.size());
        for(WebElement link : linkList) {
        	System.out.println(link.getText()+":-"+ link.getAttribute("href"));
        }
        
       
  }
}
