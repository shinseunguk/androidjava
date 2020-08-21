package Member;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class Lo {
	private JPasswordField passwordField;

	public Lo() {
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
				// TODO Auto-generated method stub
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
				if (t1.isEmpty() && t2.isEmpty()) {
					JOptionPane.showMessageDialog(f, "아이디와 비밀번호를 입력하세요");

				} else {
					JOptionPane.showMessageDialog(f, "로그인성공");
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

		new Lo();
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

		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(191, 114, 199, 25);
		f.getContentPane().add(textField_1);

		JTextField textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(191, 162, 199, 25);
		f.getContentPane().add(textField_2);

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

				String s1 = textField.getText();
				String s2 = textField_1.getText();
				String s3 = textField_2.getText();
				String s4 = textField_3.getText();
				String s5 = textField_4.getText();
				String s6 = textField_5.getText();

				if (s1.isEmpty() && s2.isEmpty() && s3.isEmpty() && s4.isEmpty() && s5.isEmpty() && s6.isEmpty()) {
					JOptionPane.showMessageDialog(f, "회원정보를 빠짐없이 입력하세요.");
				} else {
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
