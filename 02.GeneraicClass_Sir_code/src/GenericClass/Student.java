package GenericClass;

public class Student extends Person{
		int id;
		double cg;
		
		public Student (String name, String gender, int age,int id, double cg){
			super (name,gender, age);
			this.id= id;
			this.cg= cg;
		}
	public String toString (){
		return super.toString()+" "+"Id: "+this.id+" "+"CGPA: "+this.cg;
	}
}
