package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class drivers {
	public static WebDriver getDriver(String browserName)
	{
		if(browserName.equals("ie"))
		{
			 String iePath="C:\\Users\\Training_B6B.01.07\\Desktop\\selenium\\jars\\IEDriverServer.exe";
             System.setProperty("webdriver.ie.driver",iePath);
             return new InternetExplorerDriver();
		}
		else if(browserName.equals("chrome"))
		{
			String chromePath="C:\\Users\\Training_B6B.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromePath);
			return new ChromeDriver();
		}
		else
			return null;
	}
}
