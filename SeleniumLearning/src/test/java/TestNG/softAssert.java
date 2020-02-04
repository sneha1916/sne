package TestNG;

import org.testng.asserts.SoftAssert;

public class softAssert {
  public void SoftasserEx()
  {
	  SoftAssert sa = new SoftAssert();
		  
		  System.out.println("*** test case two started ***");
	      sa.assertEquals("hello","Hello","First soft assert failed");
	      
	      System.out.println("hard assert success......");
	      
	      sa.assertTrue("hello".equals("hello"), "Second soft assert failed");
	      sa.assertTrue("Welcome".equals("welcome"), "Third soft assert failed");
	      
	      System.out.println("*** test case two executed successfully ***");
	      sa.assertAll();
	      
  }
  
}
