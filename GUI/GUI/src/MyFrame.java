import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		
		//���� 1. ���������� ��������
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		
		//B��� 2. ���������� �������� ����������
		JButton button = new JButton("Press me!");
		JTextField textField = new JTextField(15);
		
		//���� 3. ���������� ����. ���������� ���� ��������
		panel.add(button);
		panel.add(textField);
		
		//���� 4. ���������� �������� ��� ��������
		this.setContentPane(panel);
		
		
	}

}
