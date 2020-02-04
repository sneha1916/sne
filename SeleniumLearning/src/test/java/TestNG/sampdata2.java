package TestNG;

import org.testng.annotations.Test;

public class sampdata2 {
  @Test(dataProvider="getData", dataProviderClass=sampdata.class)
  public void client1Test(Integer p,String p1) {
	  System.out.println("Client1 testing: Data(" + p +","+"String is "+"-"+p1+")");
  } 
  @Test(dataProvider="getData1", dataProviderClass=sampdata.class)
  public void client2Test(Integer x,String y) {
	  System.out.println("Client2 testing: Data(" + x +","+"String is "+"-"+y+")");
  }
}
