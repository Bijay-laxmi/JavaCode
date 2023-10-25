package collections;

public class Employee {

	//declared the variable 
	private int empId;
	private String empName;
	private double salary;
	
	//getter and setter methods 
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}
	public String getEmpName()
	{
	return empName; 
	}
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	//argument constructor 
	public Employee(int empId, String empName, double salary )
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	//no-args constructor
	public Employee()
	{
		super();
	}
	
	//toString method 
	
	public String toString()
	{
		return "Employee [empId=" + empId + ",empName=" + empName + ",salar"+ salary +"] ";
	}
}
