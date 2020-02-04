package TestNG;

import org.testng.annotations.Test;

public class MultipleTestCase {

	
@Test(priority=1)
public void c_test()
{
	System.out.println("Inside test C");
}
@Test(priority=10)
public void a_test()
{
	System.out.println("Inside test A");
}
@Test(priority=2)
public void b_test()
{
	System.out.println("Inside test B");
}


}
