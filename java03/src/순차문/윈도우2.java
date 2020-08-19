package 순차문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 윈도우2 {

	public static void main(String[] args) {

		
		JFrame j = new JFrame();
		j.setSize(500,500);
		
		JButton btnNewButton = new JButton("알림");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(j, "가운데");
			}
		});
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 41));
		j.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("왼쪽");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(j, "왼쪽");
			}
		});
		
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 25));
		btnNewButton_1.setBackground(Color.BLUE);
		j.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("오른쪽");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(j, "오른쪽");
			}
		});
		
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 29));
		j.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		
		JButton btnNewButton_3 = new JButton("위쪽");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(j, "위");
			}
		});
		
		j.getContentPane().add(btnNewButton_3, BorderLayout.NORTH);
		
		JButton btnNewButton_4 = new JButton("아래쪽");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(j, "아래");
			}
		});
		
		btnNewButton_4.setBackground(Color.CYAN);
		btnNewButton_4.setFont(new Font("굴림", Font.PLAIN, 29));
		j.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
		
		j.setVisible(true);
		
		
	}

}
