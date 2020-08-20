package Member;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(310, 180);
		f.getContentPane().setLayout(null);
		f.setTitle("버스 예약 시스템");

		JLabel l1 = new JLabel("아이디 :");
		l1.setFont(new Font("굴림", Font.BOLD, 12));
		l1.setBounds(29, 26, 100, 25);
		f.getContentPane().add(l1);
		JLabel l2 = new JLabel("비밀번호 :");
		l2.setFont(new Font("굴림", Font.BOLD, 13));
		l2.setBounds(29, 56, 100, 25);
		f.getContentPane().add(l2);

		textField = new JTextField();
		textField.setBounds(141, 26, 116, 21);
		f.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(141, 63, 116, 21);
		f.getContentPane().add(textField_1);

		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.addActionListener(new ActionListener() {
	            // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // TODO Auto-generated method stub
	                new Signup(); // 클래스 newWindow를 새로 만들어낸다
	            }
	            
	        });


	
		btnNewButton.setBounds(42, 94, 97, 23);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("로그인");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String t1 = textField.getText();
				String t2 = textField_1.getText();
				
				if(t1.isEmpty() && t2.isEmpty()) {
					JOptionPane.showMessageDialog(f, "아이디와 비밀번호를 입력하세요");
					
				}else {
					JOptionPane.showMessageDialog(f, "로그인성공");
				}
				
			}
		});
		btnNewButton_1.setBounds(159, 94, 97, 23);
		f.getContentPane().add(btnNewButton_1);

		f.setVisible(true);
	}

}
