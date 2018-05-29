package info;

public class Information {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Student stdnt = new Student("x", 17, "M", "01", (float)3.44);
		CollegeStudent clgstu = new CollegeStudent("y", 17, "F", "02", (float)3.44, "2nd", "Science");
		try{
			
		System.out.println("ID: " + stdnt.getId());
		System.out.println(" CGPA: " + stdnt.getCGPA());
		}catch(NullPointerException ne){
			System.out.println(ne + " create student object properly");
		}
		
		try{
			System.out.println("Student name: " + clgstu.getName());
			System.out.println("Student year: " + clgstu.getYear());
			System.out.println("Student group: " + clgstu.getGroup());
		clgstu.setName("update name");
		System.out.println("Upadetd name: " + clgstu.getName());

		}catch(NullPointerException ne){
			System.out.println(ne + " create college student object properly");

		}
		
		BasicInfo bsin= new CollegeStudent("y", 17, "F", "02", (float)3.44, "2nd", "Science");
		try{
		System.out.println(bsin.getName());
		System.out.println(bsin.getAge());
		System.out.println(bsin.getGender());
		}catch(NullPointerException ne){
			System.out.println(ne + " create base info object properly");

		}
	}

}
