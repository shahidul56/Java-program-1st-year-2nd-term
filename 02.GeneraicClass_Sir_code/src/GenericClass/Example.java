package GenericClass;

import java.util.*;

public class Example {

	
	public static void main(String[] args) {
		
			Template <Person> pr = new Template<Person>(); 
			
			//Template<Student> st = new Template<Student>();
			
			Person pr1 = new Person("Y", "M", 25);
			Student st1 = new Student ("X","F",25, 2 , 3.5);
			
			
			pr.set(pr1);
			Object element1 = pr.get();
			System.out.println(element1.toString());
			
			pr.set(st1);
			Object element2 = pr.get();
			System.out.println(element2.toString());
			
			ArrayList<Integer> arry = new ArrayList<Integer>();
			arry.add(12);
			arry.add(45);
			arry.add(123);
			System.out.println(arry.size());
//			arry.remove(1);
//			System.out.println(arry.size());
//			for (int i=0; i< arry.size(); i++)
//			{
//				System.out.println(arry);
//			}
			Iterator itr = arry.iterator();
			while (itr.hasNext()){
				System.out.println("Data: "+itr.next());
			}
			
	}

}
