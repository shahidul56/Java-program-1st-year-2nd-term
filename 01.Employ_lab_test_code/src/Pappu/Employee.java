package Pappu;

public class Employee extends Department implements EmployeeInterface{
	
	String Emp_Name;
	int Empno;
	String DOB;
	String Designation;
	double PreviousSalary;
	double CurrentSalary;
	public Employee(String depmntid, String depnam, String name, int empno,String dob,String designation,double presalary,double currsalary)
	{
		super(depmntid, depnam);
		
		Emp_Name = name;
		Empno=empno;
		DOB=dob;
		Designation=designation;
		PreviousSalary=presalary;
		CurrentSalary=currsalary;
	}
	
	public void setEmployee()
	{
		
	}
	public String getName()
	{
		return Emp_Name;
	}
	public void giveincrement()
	{
		PreviousSalary = CurrentSalary;
		
		CurrentSalary=CurrentSalary+(CurrentSalary*0.02);
	}
  //override
	public double getCurrentSalary() 
	{
		return CurrentSalary;
	
	}

	//Override
	public double getPreviouSalary() 
	{
		//System.out.println("PreviousSalary :"+PreviousSalary);
		return PreviousSalary;
	}
/*public void Print()
	{
		System.out.println("Name  :"+Name);
		System.out.println("EmpNo :"+Empno);
		System.out.println("Department :"+DepartmentID);
		System.out.println("DOB :"+DOB);
		System.out.println("Designation :"+Designation);
		System.out.println("PreviousSalary :"+PreviousSalary);
		System.out.println("CurrentSalary :"+CurrentSalary);
	}*/
}
