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

import DB.DB처리전담;

@SuppressWarnings("serial")
class SignUp extends JFrame {
	// 버튼이 눌러지면 만들어지는 새 창을 정의한 클래스
	public SignUp() {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		f.setTitle("버스 예약 시스템");
		f.setLocation(200, 200);

		JLabel l1 = new JLabel("아이디 :");
		l1.setFont(new Font("굴림", Font.BOLD, 20));
		l1.setBounds(12, 69, 103, 25);
		l1.setHorizontalAlignment(SwingConstants.LEFT);
		f.getContentPane().add(l1);

		JLabel l1_1 = new JLabel("회원가입");
		l1_1.setFont(new Font("굴림", Font.BOLD, 20));
		l1_1.setBounds(167, 10, 134, 25);
		l1_1.setHorizontalAlignment(JLabel.CENTER);
		f.getContentPane().add(l1_1);

		JLabel l1_2 = new JLabel("비밀번호 :");
		l1_2.setHorizontalAlignment(SwingConstants.LEFT);
		l1_2.setFont(new Font("굴림", Font.BOLD, 20));
		l1_2.setBounds(12, 114, 133, 25);
		f.getContentPane().add(l1_2);

		JLabel l1_2_1 = new JLabel("비밀번호확인 :");
		l1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		l1_2_1.setFont(new Font("굴림", Font.BOLD, 20));
		l1_2_1.setBounds(12, 162, 174, 25);
		f.getContentPane().add(l1_2_1);

		JLabel l1_2_1_1 = new JLabel("이름 :");
		l1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		l1_2_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		l1_2_1_1.setBounds(12, 208, 87, 25);
		f.getContentPane().add(l1_2_1_1);

		JLabel l1_2_1_2 = new JLabel("생년월일(6자리) :");
		l1_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		l1_2_1_2.setFont(new Font("굴림", Font.BOLD, 20));
		l1_2_1_2.setBounds(12, 255, 174, 25);
		f.getContentPane().add(l1_2_1_2);

		JLabel l1_2_2 = new JLabel("전화번호 :");
		l1_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		l1_2_2.setFont(new Font("굴림", Font.BOLD, 20));
		l1_2_2.setBounds(12, 301, 133, 25);
		f.getContentPane().add(l1_2_2);

		JLabel l1_2_1_3 = new JLabel("이메일 주소  :");
		l1_2_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		l1_2_1_3.setFont(new Font("굴림", Font.BOLD, 20));
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

		JButton btnNewButton = new JButton("로그인 화면으로");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		btnNewButton.setBounds(68, 406, 134, 34);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("회원가입");
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
					JOptionPane.showMessageDialog(f, "회원정보를 빠짐없이 입력하세요.");
				}
				
				else if(!(user_pw.equals(user_pwchk))) { // 확인필요
					JOptionPane.showMessageDialog(f, "비밀번호와 비밀번호 확인이 동일하지 않습니다.");
				}
				
				else {
					DB처리전담 db = new DB처리전담();
					try {
						db.create(user_id, user_pw, user_name,user_birth,user_pnumber,user_email);
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					JOptionPane.showMessageDialog(f, "회원가입 완료."); // 안나옴.
					
					f.dispose();
				}

			}
		});
		btnNewButton_1.setBounds(256, 406, 134, 34);
		f.getContentPane().add(btnNewButton_1);

		f.setVisible(true);
	}
}