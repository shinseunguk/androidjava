package 로그인;

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

import java.awt.Color;

@SuppressWarnings("serial")
class SignUp extends JFrame {
	// 버튼이 눌러지면 만들어지는 새 창을 정의한 클래스
	public SignUp() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.WHITE);
		f.setSize(600, 500);
		f.getContentPane().setLayout(null);
		f.setTitle("버스 예약 시스템");

		JLabel l1 = new JLabel("아이디 :");
		l1.setFont(new Font("굴림", Font.BOLD, 20));
		l1.setBounds(46, 67, 103, 25);
		l1.setHorizontalAlignment(SwingConstants.LEFT);
		f.getContentPane().add(l1);

		JLabel l1_1 = new JLabel("회원가입");
		l1_1.setFont(new Font("굴림", Font.BOLD, 20));
		l1_1.setBounds(220, 10, 134, 25);
		l1_1.setHorizontalAlignment(JLabel.CENTER);
		f.getContentPane().add(l1_1);

		JLabel l1_2 = new JLabel("비밀번호 :");
		l1_2.setHorizontalAlignment(SwingConstants.LEFT);
		l1_2.setFont(new Font("굴림", Font.BOLD, 20));
		l1_2.setBounds(46, 112, 133, 25);
		f.getContentPane().add(l1_2);

		JLabel l1_2_1 = new JLabel("비밀번호확인 :");
		l1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		l1_2_1.setFont(new Font("굴림", Font.BOLD, 20));
		l1_2_1.setBounds(46, 160, 174, 25);
		f.getContentPane().add(l1_2_1);

		JLabel l1_2_1_1 = new JLabel("이름 :");
		l1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		l1_2_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		l1_2_1_1.setBounds(46, 206, 87, 25);
		f.getContentPane().add(l1_2_1_1);

		JLabel l1_2_1_2 = new JLabel("생년월일(6자리) :");
		l1_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		l1_2_1_2.setFont(new Font("굴림", Font.BOLD, 20));
		l1_2_1_2.setBounds(46, 253, 174, 25);
		f.getContentPane().add(l1_2_1_2);

		JLabel l1_2_2 = new JLabel("전화번호 :");
		l1_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		l1_2_2.setFont(new Font("굴림", Font.BOLD, 20));
		l1_2_2.setBounds(46, 299, 133, 25);
		f.getContentPane().add(l1_2_2);

		JLabel l1_2_1_3 = new JLabel("이메일 주소  :");
		l1_2_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		l1_2_1_3.setFont(new Font("굴림", Font.BOLD, 20));
		l1_2_1_3.setBounds(46, 346, 174, 25);
		f.getContentPane().add(l1_2_1_3);

		JTextField textField = new JTextField();
		textField.setBounds(232, 67, 199, 25);
		f.getContentPane().add(textField);
		textField.setColumns(10);

		JPasswordField passwordField_1 = new JPasswordField();
		passwordField_1.setColumns(10);
		passwordField_1.setBounds(232, 114, 199, 25);
		f.getContentPane().add(passwordField_1);

		JPasswordField passwordField_2 = new JPasswordField();
		passwordField_2.setColumns(10);
		passwordField_2.setBounds(232, 162, 199, 25);
		f.getContentPane().add(passwordField_2);

		JTextField textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(232, 208, 199, 25);
		f.getContentPane().add(textField_3);

		JTextField textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(232, 255, 199, 25);
		f.getContentPane().add(textField_4);

		JTextField textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(232, 301, 199, 25);
		f.getContentPane().add(textField_5);

		JTextField textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(232, 348, 199, 25);
		f.getContentPane().add(textField_6);

		JButton btnNewButton = new JButton("로그인 화면으로");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				Login name = new Login();
			}
		});
		btnNewButton.setBounds(120, 406, 134, 34);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("회원가입");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String user_id = textField.getText();
				String user_pw = new String(passwordField_1.getText());
				String user_pwchk = new String(passwordField_2.getText());
				String user_name = textField_3.getText();
				String user_birtha =textField_4.getText();
				String user_pnumber = textField_5.getText();
				String user_email	= textField_6.getText();
			
					
				if (user_id.isEmpty() || user_pw.isEmpty() || user_pwchk.isEmpty() || user_name.isEmpty() || user_pnumber.isEmpty() || user_email.isEmpty()||
						user_birtha.isEmpty()) {
					JOptionPane.showMessageDialog(f, "회원정보를 빠짐없이 입력하세요.");
				}
				
				else if(!(user_pw.equals(user_pwchk))) { 
					JOptionPane.showMessageDialog(f, "비밀번호와 비밀번호 확인이 동일하지 않습니다.");
				}
				
				else {
					int user_birth = Integer.parseInt(textField_4.getText());
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
		btnNewButton_1.setBounds(308, 406, 134, 34);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("중복확인");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB처리전담 db = new DB처리전담();
				String user_id = textField.getText();
				try {
					if(user_id.isEmpty()){
						JOptionPane.showMessageDialog(f, "아이디를 입력하세요.");
					}else if(db.read(user_id)) {
						JOptionPane.showMessageDialog(f, "사용가능한 아이디입니다.");
					}else {
						JOptionPane.showMessageDialog(f, "아이디가 존재합니다.");
					}
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 12));
		btnNewButton_2.setBounds(448, 70, 103, 23);
		f.getContentPane().add(btnNewButton_2);

		f.setVisible(true);
	}
}