import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
			
		ArrayList<Student> students = new ArrayList<>();
		
		boolean more = true;
		while(more) {
			String name = JOptionPane.showInputDialog("Enter name: ");
			String id = JOptionPane.showInputDialog("Enter id: ");
			String answer = JOptionPane.showInputDialog("Type of Student, stud, grad, phd");
			
			Student student = null;
			
			if(answer.equals("stud")) {
				String yearText = JOptionPane.showInputDialog("Enter year: ");
				int year = Integer.parseInt(yearText);
				student = new UnderGradStudent(name, id, year);
			}
			if(answer.equals("grad")) {
				String supervisor = JOptionPane.showInputDialog("Supervisor: ");
				student = new GraduateStudent(name, id, supervisor);
			}
			if(answer.equals("phd")) {
				String thesis = JOptionPane.showInputDialog("Thesis: ");
				student = new PhDStudent(name, id, thesis);
				
			}
			students.add(student);
			
			String another = JOptionPane.showInputDialog("Another student? yes, no");
			if(another.equals("no"))
				more = false;
		}
		
		for(Student s: students)
			s.printInfo();  //** покулояжийг йкгсг **//
		
		for(Student s: students)
			s.printType();

	}

}
