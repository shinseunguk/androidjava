package Member;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginSignup {
	JPasswordField passwordField;

	public LoginSignup() {
		JFrame f = new JFrame();
		f.setSize(480, 350);
		f.getContentPane().setLayout(null);
		f.setTitle("���� ���� �ý���");
		f.setLocation(200, 200);

		JLabel l1 = new JLabel("���̵� :");
		l1.setFont(new Font("����", Font.BOLD, 16));
		l1.setBounds(37, 99, 100, 25);
		f.getContentPane().add(l1);
		JLabel l2 = new JLabel("��й�ȣ :");
		l2.setFont(new Font("����", Font.BOLD, 16));
		l2.setBounds(37, 155, 100, 25);
		f.getContentPane().add(l2);

		JTextField textField = new JTextField();
		textField.setBounds(149, 100, 217, 25);
		f.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("ȸ������");
		btnNewButton.addActionListener(new ActionListener() {
			// ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
			@Override
			public void actionPerformed(ActionEvent e) {
				
				SignUp sign = new SignUp();
				sign.signup();
				
			}

		});

		btnNewButton.setBounds(76, 247, 111, 41);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("�α���");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String t1 = textField.getText();
				String t2 = new String(passwordField.getText());
				if (t1.isEmpty() || t2.isEmpty()) {
					JOptionPane.showMessageDialog(f, "���̵�� ��й�ȣ�� �Է��ϼ���");

				} else {
					JOptionPane.showMessageDialog(f, "�α��μ���");
					
					new Main();
				}

			}
		});
		btnNewButton_1.setBounds(255, 247, 111, 41);
		f.getContentPane().add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(149, 156, 217, 25);
		f.getContentPane().add(passwordField);

		f.setVisible(true);
	}
	
	

	public static void main(String[] args) {
		
		new LoginSignup();
	}

}

