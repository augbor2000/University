import java.util.ArrayList;

public class Registry {
	
	private String departmentName;
	private ArrayList<Course> courses = new ArrayList<>();

	public Registry(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public void addCourse(Course aCourse) {
		courses.add(aCourse);
	}
	
	public void printDepartmentInfo() {
		System.out.println("Department: " + departmentName);
		System.out.println("Course Details");
		for(int i=0; i<courses.size(); i++)
			courses.get(i).printCourseDetails();
	}

}

