package Member;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import DB.DBó������;

@SuppressWarnings("serial")
class SignUp extends JFrame {
	// ��ư�� �������� ��������� �� â�� ������ Ŭ����
	public SignUp() {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		f.setTitle("���� ���� �ý���");
		f.setLocation(200, 200);

		JLabel l1 = new JLabel("���̵� :");
		l1.setFont(new Font("����", Font.BOLD, 20));
		l1.setBounds(12, 69, 103, 25);
		l1.setHorizontalAlignment(SwingConstants.LEFT);
		f.getContentPane().add(l1);

		JLabel l1_1 = new JLabel("ȸ������");
		l1_1.setFont(new Font("����", Font.BOLD, 20));
		l1_1.setBounds(167, 10, 134, 25);
		l1_1.setHorizontalAlignment(JLabel.CENTER);
		f.getContentPane().add(l1_1);

		JLabel l1_2 = new JLabel("��й�ȣ :");
		l1_2.setHorizontalAlignment(SwingConstants.LEFT);
		l1_2.setFont(new Font("����", Font.BOLD, 20));
		l1_2.setBounds(12, 114, 133, 25);
		f.getContentPane().add(l1_2);

		JLabel l1_2_1 = new JLabel("��й�ȣȮ�� :");
		l1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		l1_2_1.setFont(new Font("����", Font.BOLD, 20));
		l1_2_1.setBounds(12, 162, 174, 25);
		f.getContentPane().add(l1_2_1);

		JLabel l1_2_1_1 = new JLabel("�̸� :");
		l1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		l1_2_1_1.setFont(new Font("����", Font.BOLD, 20));
		l1_2_1_1.setBounds(12, 208, 87, 25);
		f.getContentPane().add(l1_2_1_1);

		JLabel l1_2_1_2 = new JLabel("�������(6�ڸ�) :");
		l1_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		l1_2_1_2.setFont(new Font("����", Font.BOLD, 20));
		l1_2_1_2.setBounds(12, 255, 174, 25);
		f.getContentPane().add(l1_2_1_2);

		JLabel l1_2_2 = new JLabel("��ȭ��ȣ :");
		l1_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		l1_2_2.setFont(new Font("����", Font.BOLD, 20));
		l1_2_2.setBounds(12, 301, 133, 25);
		f.getContentPane().add(l1_2_2);

		JLabel l1_2_1_3 = new JLabel("�̸��� �ּ�  :");
		l1_2_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		l1_2_1_3.setFont(new Font("����", Font.BOLD, 20));
		l1_2_1_3.setBounds(12, 348, 174, 25);
		f.getContentPane().add(l1_2_1_3);

		JTextField textField = new JTextField();
		textField.setBounds(191, 67, 199, 25);
		f.getContentPane().add(textField);
		textField.setColumns(10);

		JPasswordField passwordField_1 = new JPasswordField();
		passwordField_1.setColumns(10);
		passwordField_1.setBounds(191, 114, 199, 25);
		f.getContentPane().add(passwordField_1);

		JPasswordField passwordField_2 = new JPasswordField();
		passwordField_2.setColumns(10);
		passwordField_2.setBounds(191, 162, 199, 25);
		f.getContentPane().add(passwordField_2);

		JTextField textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(191, 208, 199, 25);
		f.getContentPane().add(textField_3);

		JTextField textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(191, 255, 199, 25);
		f.getContentPane().add(textField_4);

		JTextField textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(191, 301, 199, 25);
		f.getContentPane().add(textField_5);

		JTextField textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(191, 348, 199, 25);
		f.getContentPane().add(textField_6);

		JButton btnNewButton = new JButton("�α��� ȭ������");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		btnNewButton.setBounds(68, 406, 134, 34);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("ȸ������");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String user_id = textField.getText();
				String user_pw = new String(passwordField_1.getText());
				String user_pwchk = new String(passwordField_2.getText());
				String user_name = textField_3.getText();
				int user_birth = Integer.parseInt(textField_4.getText());
				String user_pnumber = textField_5.getText();
				String user_email	= textField_6.getText();

				if (user_id.isEmpty() || user_pw.isEmpty() || user_pwchk.isEmpty() || user_name.isEmpty() || user_pnumber.isEmpty() || user_email.isEmpty()) {
					JOptionPane.showMessageDialog(f, "ȸ�������� �������� �Է��ϼ���.");
				}
				
				else if(!(user_pw.equals(user_pwchk))) { // Ȯ���ʿ�
					JOptionPane.showMessageDialog(f, "��й�ȣ�� ��й�ȣ Ȯ���� �������� �ʽ��ϴ�.");
				}
				
				else {
					DBó������ db = new DBó������();
					try {
						db.create(user_id, user_pw, user_name,user_birth,user_pnumber,user_email);
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					JOptionPane.showMessageDialog(f, "ȸ������ �Ϸ�."); // �ȳ���.
					
					f.dispose();
				}

			}
		});
		btnNewButton_1.setBounds(256, 406, 134, 34);
		f.getContentPane().add(btnNewButton_1);

		f.setVisible(true);
	}
}