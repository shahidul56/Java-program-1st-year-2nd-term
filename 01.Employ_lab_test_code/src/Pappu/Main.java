package Pappu;

import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		
		
		/*Department[] d = new Department[4];
		d[0] = new Department("01", "Admin");
		d[1] = new Department("02", "HR");
		d[2] = new Department("03", "Development");
		d[3] = new Department("04", "R&D");*/
		
		
		
		Employee[] em = new Employee[4];
		em[0] = new Employee("01", "Admin","Karim",120,"1/1/1980","Manager",30000,40000);
		em[1] = new Employee("01", "Admin","Rahim",230,"2/2/1990","Officer",12000,15000);
	    em[2] = new Employee("03", "HR","Helal",122,"1/1/1980","Officer",15000,16000);
		em[3] = new Employee("01", "Admin","David",233,"2/2/1990","Officer",12000,15000);
		
		for(int i=0; i<4; i++)
		{
			if(em[i].CurrentSalary>12000)
				em[i].giveincrement();
		}
		
		for(int i=0; i<4; i++)
		{
			if(em[i].DepartmentID.equals("01"))
			{
				System.out.println("Name  :"+em[i].Emp_Name);
			}
		}
		
	}

}
