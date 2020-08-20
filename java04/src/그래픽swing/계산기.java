package 그래픽swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기 {

	public static void main(String[] args) {

		// 프레임 1개
		JFrame jf = new JFrame();
		jf.getContentPane().setBackground(Color.GREEN);
		jf.setSize(500, 700);
		// 이미지 1개
		ImageIcon img = new ImageIcon("3af708efc3267ff9c895fe4101ff6176ea827257.png");
		// 라벨 3개
		JLabel l1 = new JLabel();
		l1.setBounds(323, 207, -232, -192);
		JLabel l2 = new JLabel();
		l2.setFont(new Font("굴림", Font.PLAIN, 23));
		l2.setLocation(201, 183);
		l2.setSize(86, 52);
		JLabel l3 = new JLabel();
		l3.setFont(new Font("굴림", Font.PLAIN, 23));
		l3.setBounds(201, 302, 86, 43);
		JLabel result = new JLabel();
		result.setSize(200, 43);
		result.setLocation(138, 566);
		// 텍스트 입력2
		JTextField t1 = new JTextField();
		t1.setBackground(Color.ORANGE);
		t1.setForeground(Color.BLACK);
		t1.setBounds(44, 245, 371, 43);
		JTextField t2 = new JTextField();
		t2.setBackground(Color.ORANGE);
		t2.setBounds(44, 366, 371, 43);
		// 버튼1 개
		JButton plus = new JButton("+");
		l1.setIcon(img);
		l2.setText("숫자1"); // 라벨에 글자를 넣
		l3.setText("숫자2");
		jf.getContentPane().setLayout(null);
		jf.getContentPane().add(l1);
		jf.getContentPane().add(l2);
		jf.getContentPane().add(t1);
		jf.getContentPane().add(l3);
		jf.getContentPane().add(t2);
		jf.getContentPane().add(plus);
		jf.getContentPane().add(result);

		JButton btnNewButton = new JButton("+");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t1, t2에 입력한 값을 가지오 와야함.
				// 가지고 온 값의 데이터타입은 무조건 String
				String s1 = t1.getText();
				String s2 = t2.getText();
				

				int a = Integer.parseInt(s1);
				int b = Integer.parseInt(s2);

				int sump = a + b;

				// 처리한 결과를 사용자에게 보여줌.(출력)
//				result.setText(sum + " ");
				String sum1 = String.valueOf(sump);
				result.setText(sum1);

			}
		});
		btnNewButton.setBounds(86, 442, 64, 43);
		jf.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("*");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String s1 = t1.getText();
				String s2 = t2.getText();
				

				int a = Integer.parseInt(s1);
				int b = Integer.parseInt(s2);

				int sumx = a * b;

				// 처리한 결과를 사용자에게 보여줌.(출력)
//				result.setText(sum + " ");
				String sum2 = String.valueOf(sumx);
				result.setText(sum2);

			}
		});
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(238, 442, 64, 43);
		jf.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("/");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String s1 = t1.getText();
				String s2 = t2.getText();
				

				int a = Integer.parseInt(s1);
				int b = Integer.parseInt(s2);

				int sumd = a / b;

				

				// 처리한 결과를 사용자에게 보여줌.(출력)
//				result.setText(sum + " ");
				String sum3 = String.valueOf(sumd);
				result.setText(sum3);

			}
		});
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(314, 442, 64, 43);
		jf.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("-");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String s1 = t1.getText();
				String s2 = t2.getText();
				

				int a = Integer.parseInt(s1);
				int b = Integer.parseInt(s2);

				int summ = a - b;

				// 처리한 결과를 사용자에게 보여줌.(출력)
//				result.setText(sum + " ");
				String sum4 = String.valueOf(summ);
				result.setText(sum4);

			}
		});
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBounds(162, 442, 64, 43);
		jf.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("크기판별");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				

				int a = Integer.parseInt(s1);
				int b = Integer.parseInt(s2);

				if (a > b) {
					JOptionPane.showMessageDialog(jf, "첫번째 숫자가 더큽니다.");
					String abc = "첫번째 숫자가 더 큽니다.";
				} else {
					JOptionPane.showMessageDialog(jf, "두번째 숫자가 더큽니다.");

				}

				
			}
		});
		btnNewButton_4.setForeground(Color.RED);
		btnNewButton_4.setBounds(162, 513, 140, 43);
		jf.getContentPane().add(btnNewButton_4);

		jf.setVisible(true);
	}
}
