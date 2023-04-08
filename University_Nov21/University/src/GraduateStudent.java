
public class GraduateStudent extends Student {
	
	private String supervisor;

	public GraduateStudent(String name, String id, String supervisor) {
		super(name, id);
		this.supervisor = supervisor;
	}
	
	//επικάλυψη/ επαναορισμός μεθόδου
	public void printInfo() {
		super.printInfo();
		System.out.println("Supervisor: " + supervisor);
	}
	
	public void printType() {
		System.out.println("Hello I am a graduate student");
	}

}
