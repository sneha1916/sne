package EXCELDEMOS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class READEXCEL2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         String chromePath="C:\\Users\\Training_B6B.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
         System.setProperty("webdriver.chrome.driver", chromePath);
         WebDriver driver =new ChromeDriver();
        
		File src=new File("C:\\Users\\Training_B6B.01.07\\Desktop\\xs.xlsx");
	    FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1 =wb.getSheetAt(0);
		
		driver.manage().window().maximize();
	    driver.get("http://www.demoaut.com/");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Actions actions=new Actions(driver);
	    String expecTitle="Welcome :Mercury Tours123";
	    String actuTitle=driver.getTitle();
	    
	    int rowCount=sheet1.getLastRowNum();
	    System.out.println("Total number of rows is: "+rowCount);
		for(int i=0;i<=rowCount;i++)
		{
			String firstName=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Firstname is :"+firstName);
			
			String user=sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println("User is :"+user); 
			
			String password=sheet1.getRow(i).getCell(2).getStringCellValue();
			System.out.println("Password is :"+password);
			
			String confirmpassword=sheet1.getRow(i).getCell(3).getStringCellValue();
			System.out.println("Confirm password is :"+confirmpassword);
		
				if(expecTitle.equals(actuTitle))
				{
					System.out.println("same");
					sheet1.getRow(0).createCell(3).setCellValue("Results");
					sheet1.getRow(0).createCell(3).setCellValue("Pass: Home page");
				}
				else
				{
					System.out.println("Not in Home");
					sheet1.getRow(0).createCell(3).setCellValue("Fail : Not in Home page");
				}
            FileOutputStream fout= new FileOutputStream("C:\\Users\\Training_B6B.01.07\\Desktop\\xs.xlsx");
            		wb.write(fout);
                    fout.close();
                    
			
		}
		wb.close();
		}
		
}
