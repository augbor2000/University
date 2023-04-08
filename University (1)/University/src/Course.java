import java.util.ArrayList;

public class Course {
	
	private String name;
	private int ects;
	private ArrayList<Student> enrolledStudents;
	private ClassRoom classRoom;
	
	public void setClassRoom(ClassRoom aClassRoom) {
		classRoom = aClassRoom;
	}
	
	public Course(String name, int ects) {
		this.name = name;
		this.ects = ects;
		enrolledStudents = new ArrayList<>();
	}
	
	public void printCourseDetails() {
		
		System.out.println("Course: " + name);
		System.out.println("ECTS: " + ects);
		System.out.println("takes place at: " + classRoom.getLocation());
		System.out.println("Enrolled Students");
		//αποστολή μηνύματος printData στους εγγεγραμμένους φοιτητές
		for(int i=0; i<enrolledStudents.size(); i++) {
			enrolledStudents.get(i).printData();
		}
	}
	
	public void addStudent(Student aStudent) {
		if(enrolledStudents.size() < classRoom.getCapacity()) {
		    enrolledStudents.add(aStudent);
		    System.out.println("Student has been enrolled");
		}
		else
			System.out.println("Sorry, the course is full");
	}
	
}
