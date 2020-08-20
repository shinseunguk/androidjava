package 그래픽swing;

import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 성인판별 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {

		// 프레임1
		JFrame f = new JFrame();
		f.setSize(500, 500);
		// 라벨 2
		JLabel l1 = new JLabel();
		l1.setFont(new Font("굴림", Font.BOLD, 26));
		l1.setBounds(12, 120, 96, 45);
		f.getContentPane().setLayout(null);

		f.getContentPane().add(l1);

		l1.setText("이름 :");

		t1 = new JTextField();
		t1.setBounds(188, 129, 235, 38);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setBounds(188, 227, 235, 38);
		f.getContentPane().add(t2);
		t2.setColumns(10);

		JButton btnNewButton = new JButton("성인 판별");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String s1 = t1.getText();
				String s2 = t2.getText();

				int age = Integer.parseInt(s2);

				if (age <= 2003) {
					JOptionPane.showMessageDialog(f, s1 + "은 성인입니다.");

				} else {
					JOptionPane.showMessageDialog(f, s1 + "은 미성년자입니다.");

				}

			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 28));
		btnNewButton.setBounds(132, 353, 179, 81);
		f.getContentPane().add(btnNewButton);

		JLabel l1_1 = new JLabel();
		l1_1.setText("태어난 년도 :");
		l1_1.setFont(new Font("굴림", Font.BOLD, 26));
		l1_1.setBounds(12, 218, 179, 45);
		f.getContentPane().add(l1_1);

		f.setVisible(true);
	}
}
