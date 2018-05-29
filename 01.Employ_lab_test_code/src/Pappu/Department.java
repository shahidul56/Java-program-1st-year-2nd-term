package Pappu;

public class Department {

	String DepartmentID;
	String DepatmentName;
	public Department(String depmntid,String depname)
	{
		DepartmentID=depmntid;
		DepatmentName=depname;
	}
	public String getName()
	{
		return DepatmentName;
	}
}
