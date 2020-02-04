package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class READEXCEL {
  @Test
  public void readExcelData() throws IOException
	{
		File src=new File("C:\\Users\\Training_B6B.01.07\\Desktop\\xs.xlsx");
	    FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1 =wb.getSheetAt(0);
		
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
		}
		
	}

 
}
