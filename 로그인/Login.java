package 로그인;

import java.awt.Color;
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

import DB.DB처리전담;

public class Login {
	JPasswordField passwordField;

	public Login() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.WHITE);
		f.setSize(480, 350);
		f.getContentPane().setLayout(null);
		f.setTitle("버스 예약 시스템");

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
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			// 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				SignUp sign = new SignUp();
				
				
			}

		});

		btnNewButton.setBounds(76, 247, 111, 41);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("로그인");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB처리전담 db = new DB처리전담();
				String t1 = textField.getText();
				String t2 = new String(passwordField.getText());
				
				try {
					boolean a = db.read(t1, t2);
					if (t1.isEmpty() || t2.isEmpty()) {
						JOptionPane.showMessageDialog(f, "아이디와 비밀번호를 입력하세요");
					}else if(a) {
						JOptionPane.showMessageDialog(f, "로그인성공");
						f.dispose();
						Main m = new Main();
					}else {
						JOptionPane.showMessageDialog(f, "아이디와 비밀번호가 존재하지 않거나 일치하지 않습니다");
					}
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				

			}
		});
		btnNewButton_1.setBounds(255, 247, 111, 41);
		f.getContentPane().add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(149, 156, 217, 25);
		f.getContentPane().add(passwordField);
		
		JLabel l1_1 = new JLabel("회원 로그인");
		l1_1.setFont(new Font("굴림", Font.BOLD, 23));
		l1_1.setBounds(162, 10, 129, 25);
		f.getContentPane().add(l1_1);

		f.setVisible(true);
	}
	
	

	public static void main(String[] args) {
		
		new Login();
		
	}
}