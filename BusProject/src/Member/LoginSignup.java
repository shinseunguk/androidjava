package Member;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import DB.DB처리전담;

public class LoginSignup {
	JPasswordField passwordField;

	public LoginSignup() {
		JFrame f = new JFrame();
		f.setSize(480, 350);
		f.getContentPane().setLayout(null);
		f.setTitle("버스 예약 시스템");
		f.setLocation(200, 200);

		JLabel l1 = new JLabel("아이디 :");
		l1.setFont(new Font("굴림", Font.BOLD, 16));
		l1.setBounds(37, 99, 100, 25);
		f.getContentPane().add(l1);
		JLabel l2 = new JLabel("비밀번호 :");
		l2.setFont(new Font("굴림", Font.BOLD, 16));
		l2.setBounds(37, 155, 100, 25);
		f.getContentPane().add(l2);

		JTextField textField = new JTextField();
		textField.setBounds(149, 100, 217, 25);
		f.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.addActionListener(new ActionListener() {
			// 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
			@Override
			public void actionPerformed(ActionEvent e) {
				new Signup(); // 클래스 newWindow를 새로 만들어낸다
			}

		});

		btnNewButton.setBounds(76, 247, 111, 41);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("로그인");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String t1 = textField.getText();
				String t2 = new String(passwordField.getText());
				if (t1.isEmpty() || t2.isEmpty()) {
					JOptionPane.showMessageDialog(f, "아이디와 비밀번호를 입력하세요");

				} else {
					JOptionPane.showMessageDialog(f, "로그인성공");
					
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
	
	class Main extends JFrame {
		public Main() {
		
		JFrame f = new JFrame();
		f.setSize(800, 600);
		f.setTitle("버스 예약 시스템");
		f.getContentPane().setLayout(null);

		JLabel l1 = new JLabel("버스 예약 시스템입니다.");
		l1.setForeground(Color.BLUE);
		l1.setFont(new Font("굴림", Font.BOLD, 23));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(113, 0, 565, 62);
		f.getContentPane().add(l1);

		JLabel l2 = new JLabel();
		l2.setBounds(60, 56, 654, 391);
		
		
		ImageIcon img = new ImageIcon("bus.png");

		l2.setIcon(img);
		
		f.getContentPane().add(l2);

		JButton btnNewButton = new JButton("버스예매");

		btnNewButton.setBounds(12, 471, 233, 62);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("예매확인");
		btnNewButton_1.setBounds(265, 471, 233, 62);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("프로그램 종료");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); //모든창 닫기
			}
		});
		btnNewButton_2.setBounds(515, 471, 233, 62);
		f.getContentPane().add(btnNewButton_2);

		f.setVisible(true);
		
	}
	
	}

	public static void main(String[] args) {
		
		new LoginSignup();
	}

}

class Signup extends JFrame {
	// 버튼이 눌러지면 만들어지는 새 창을 정의한 클래스
	Signup() {
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

//				String t2 = new String(passwordField.getText());
				String user_id = textField.getText();
				String user_pw = new String(passwordField_1.getText());
				String user_pwchk = new String(passwordField_2.getText());
				String user_name = textField_3.getText();
				String user_birth = textField_4.getText();
				String user_pnumber = textField_5.getText();
				String user_email	= textField_6.getText();

				if (user_id.isEmpty() || user_pw.isEmpty() ||user_birth.isEmpty() || user_birth.isEmpty() 
						|| user_pnumber.isEmpty() || user_email.isEmpty() ||user_pwchk.isEmpty() ) {
					JOptionPane.showMessageDialog(f, "회원정보를 빠짐없이 입력하세요.");
				}
//				else if(user_pw != user_pwchk) {
//					
//					JOptionPane.showMessageDialog(f, "비밀번호와 비밀번호 확인이 동일하지 않습니다.");
//				}
				else {
					JOptionPane.showMessageDialog(f, "회원가입 완료."); // 안나옴.
					DB처리전담 db = new DB처리전담();
					try {
						db.create(user_id, user_pw, user_name,user_birth,user_pnumber,user_email);
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					f.dispose();
				}

			}
		});
		btnNewButton_1.setBounds(256, 406, 134, 34);
		f.getContentPane().add(btnNewButton_1);

		f.setVisible(true);
	}
}
