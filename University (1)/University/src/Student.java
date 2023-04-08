
public class Student {
	
	private String name;
	private String id;
	
	public Student(String aName, String someId) {
		name = aName;
		id = someId;
	}
	
	public void printData() {
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
	}

}
