package info;

public class Student extends Person implements BasicInfo{
	private String id;
	private float CGPA;
	public Student(String name, int age, String gender, String id, float gpa){
		super(name, age, gender);
		this.id = id;
		this.CGPA = gpa;
	}
	
	public String getName() {
		
		return super.Name;
	}
	
	public int getAge() {
		
		return super.age;
	}
	
	public String getGender() {
		
		return super.Gender;
	}
	
	public String getId(){
		return this.id;
	}
	public float getCGPA(){
		return this.CGPA;
	}

}
