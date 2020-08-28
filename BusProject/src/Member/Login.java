package Member;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Member.LoginSignup.Main;

public class Login {
	

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(664, 585);
		f.getContentPane().setLayout(null);
		f.setTitle("버스 예약 시스템");
		f.setLocation(200, 200);
		
		JTextField textField;
		JTextField textField_1;

		JLabel l1 = new JLabel("아이디 :");
		l1.setFont(new Font("굴림", Font.BOLD, 22));
		l1.setBounds(76, 182, 139, 25);
		f.getContentPane().add(l1);
		JLabel l2 = new JLabel("비밀번호 :");
		l2.setFont(new Font("굴림", Font.BOLD, 22));
		l2.setBounds(76, 254, 127, 25);
		f.getContentPane().add(l2);

		textField = new JTextField();
		textField.setBounds(289, 182, 263, 32);
		f.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.addActionListener(new ActionListener() {
			// 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Signup(); // 클래스 newWindow를 새로 만들어낸다
			}

		});

		btnNewButton.setBounds(76, 436, 176, 79);
		f.getContentPane().add(btnNewButton);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(289, 254, 263, 32);
		f.getContentPane().add(passwordField);
		
		JButton btnNewButton_1 = new JButton("로그인");
		btnNewButton_1.setBounds(355, 436, 176, 79);
		f.getContentPane().add(btnNewButton_1);

		f.setVisible(true);
	}
}
