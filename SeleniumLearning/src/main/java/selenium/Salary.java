package selenium;

public class Salary {
	public int basic;
	public float da;
	public String empName;
	public int pf;
	public double total_Sal;
	
	
	public Salary(String empName,int basic,float da,int pf)
	{
		this.empName=empName;
		this.basic=basic;
		this.da=da;
		this.pf=pf;
	}
	public double cal_Sal()
	{
		total_Sal=basic+da-pf;
		return total_Sal;
	}
}
