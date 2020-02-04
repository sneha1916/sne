package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sampletest {
  @Test
  public void validate_Sign_on() 
  {
	  System.out.println("Validating Sign_on");
  }
  
 @Test
 public void validate_Register()
 {
	  System.out.println("Validating Register");
 }
 
 @Test
 public void validate_Support()
 {
	  System.out.println("Validating Support");
 }
 
 @Test
 public void validate_Contact()
 {
	  System.out.println("Validating Contact");
 }
  
 @BeforeClass
 public void open_browser()
 {
	  System.out.println("***Opening Browser***");
 }
 @AfterClass
 public void close_browser()
 {
	  System.out.println("***Closing Browser***");
 }
 
 @BeforeMethod
 public void Home_page()
 {
	  System.out.println("###Opening Home page###");
 }
 @AfterMethod
 public void Sign_out()
 {
	  System.out.println("###Sign out###");
 }
 
 
 
 
}
