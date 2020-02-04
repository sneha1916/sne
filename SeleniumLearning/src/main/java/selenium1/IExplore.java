package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IExplore {
	public static void main(String args[])
	{

  String iePath="C:\\Users\\Training_B6B.01.07\\Desktop\\selenium\\jars\\IEDriverServer.exe";

	System.setProperty("webdriver.ie.driver",iePath);
	WebDriver driver=new InternetExplorerDriver();
	
	driver.get("http://www.demoaut.com/");
	
	}
}
