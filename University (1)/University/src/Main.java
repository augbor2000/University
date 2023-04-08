
public class Main {

	public static void main(String[] args) {
		
		Course c1 = new Course("Python", 5);
		Course c2 = new Course("Compilers", 5);
		
		Registry r1 = new Registry("Dept. Applied Informatics");
		r1.addCourse(c1);
		r1.addCourse(c2);
		
		Student s1 = new Student("Mary", "ics22037");
		Student s2 = new Student("John", "iis22109");
		Student s3 = new Student("Helen", "ics22009");
		Student s4 = new Student("Nick", "iis21012");
		Student s5 = new Student("Bob", "ics20128");
	
		ClassRoom room1 = new ClassRoom("Erg234", 32);
		ClassRoom room2 = new ClassRoom("Amf12", 80);
		
		c1.setClassRoom(room1);
		c2.setClassRoom(room2);
		
		//εγγραφή φοιτητών στο μάθημα c1
		c1.addStudent(s1);
		c1.addStudent(s2);
		c1.addStudent(s3);
		
		//εγγραφή φοιτητών στο μάθημα c2
		c2.addStudent(s4);
		c2.addStudent(s5);
		
		//c1.printCourseDetails();
		r1.printDepartmentInfo();

	}

}
