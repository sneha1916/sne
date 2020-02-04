package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new drivers().getDriver("chrome");
		driver.get("https://google.co.in");
	}

}
