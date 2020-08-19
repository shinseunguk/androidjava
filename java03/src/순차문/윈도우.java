package 순차문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 윈도우 {

	public static void main(String[] args) {

		//틀 역할을 하는 부품 필요
		JFrame f = new JFrame(); // f 에 JFrame할당
		f.setSize(500, 500); // 사이즈설정
		
		JButton btnNewButton = new JButton("나를 눌러요");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "나를 눌렀네..");
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		f.setVisible(true); // 기본값 false
		
		
	}

}
