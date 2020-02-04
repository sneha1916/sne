package Groups;

import org.testng.annotations.Test;

public class groups {
	
	
	
    @Test (groups = {"Car"})
     public void CarTest()
     {
    	 System.out.println("Batch Scooter- Test scooter 1"); 
     }
     @Test (groups = {"Scooter"})
    public void ScooterTest()
    {
          System.out.println("Batch Scooter- Test scooter 2"); 
    }
    @Test (groups = {"Scooterbike"})
    public void ScooterBike()
    {
         System.out.println("Batch Scooterbike- Test scooter 3"); 
    }
    @Test (groups = {"Car","Sedan"})
    public void Sedan()
    {
         System.out.println("Batch SedanCar- Test scooter 3"); 
    }
    	    	     

}
