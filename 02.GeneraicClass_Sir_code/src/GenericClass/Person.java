package GenericClass;

public class Person {
		
		String name;
		String gender;
		int age;
		
		
		public Person (String name, String gender, int age)
		{
			this.name=name;
			this.gender = gender;
			this.age = age;
		}
		
		public String toString(){
			return "Name " +this.name+" " + "Gender "+this.gender+" " + "Age "+this.age;
		}
		
}
