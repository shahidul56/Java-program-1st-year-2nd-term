package info;

public class CollegeStudent extends Student{
	private String year;
	private String group;
	
	public CollegeStudent(String name, int age, String gender, String id, float gpa, String year, String group){
		super(name, age, gender, id, gpa);
		this.year = year;
		this.group = group;
	}
	
	public String getYear(){
		return this.year;
	}
	
	public String getGroup(){
		return this.group;
	}

}
