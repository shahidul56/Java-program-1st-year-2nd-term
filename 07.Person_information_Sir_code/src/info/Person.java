package info;

public class Person {
	
	public String Name;
	public int age;
	public String Gender;
	
	public Person(String name, int age, String gender){
		this.Name = name;
		this.age = age;
		this.Gender = gender;
	}
	
	void setName(String name){
		this.Name = name;
	}
	
	void setAge(int age){
		this.age = age;
	}
	void setGender(String gender){
		this.Gender = gender;
	}

}
