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
import 좌석선택.ImagePanel;

import java.awt.SystemColor;
import javax.swing.JSpinner;

public class Login {
	JPasswordField passwordField;

	public Login() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 255));
		f.setSize(711, 546);
		f.getContentPane().setLayout(null);
		f.setTitle("버스 예약 시스템");

		JTextField textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 23));
		textField.setBounds(68, 157, 353, 56);
		f.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 17));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			// 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				SignUp sign = new SignUp();
				
				
			}

		});

		btnNewButton.setBounds(68, 391, 582, 65);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("로그인");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 17));
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
						Main m = new Main(t1);
					}else {
						JOptionPane.showMessageDialog(f, "아이디와 비밀번호가 존재하지 않거나 일치하지 않습니다");
					}
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				

			}
		});
		btnNewButton_1.setBounds(468, 157, 182, 188);
		f.getContentPane().add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("굴림", Font.PLAIN, 23));
		passwordField.setBounds(68, 289, 353, 56);
		f.getContentPane().add(passwordField);
		
		JLabel l1_1 = new JLabel("회원 로그인");
		l1_1.setFont(new Font("굴림", Font.BOLD, 28));
		l1_1.setBounds(257, 10, 190, 56);
		f.getContentPane().add(l1_1);
		
		JLabel lblNewLabel = new JLabel("아이디 : ");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 22));
		lblNewLabel.setBounds(67, 96, 112, 56);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호 : ");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 22));
		lblNewLabel_1.setBounds(68, 223, 129, 56);
		f.getContentPane().add(lblNewLabel_1);

		f.setVisible(true);
	}
	
	

	public static void main(String[] args) {
		
		new Login();
		
	}
}