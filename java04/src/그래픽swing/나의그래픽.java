package 그래픽swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽 {

	public static void main(String[] args) {
		// 자바는 부품조립식 코드 => 객체지향형 프로글래밍(OOP)
		
			JFrame f = new JFrame(); // new는 복사의 의미
			f.setSize(500, 500);
			
			JButton b1 = new JButton();
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(f, "나를 눌러요");
				}
			});
			
			JButton b2 = new JButton();
			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(f, "나도 눌러요");
				}
			});
			
			JButton b3 = new JButton();
			b3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(f, "그림");
				}
			});
			
//			String img = "sky.png";
			ImageIcon img = new ImageIcon("sky.png");
			
			b1.setText("나를 눌러요");
			b2.setText("나도 눌러요");
			b3.setIcon(img);
			f.getContentPane().add(b1);
			f.getContentPane().add(b2);
			f.getContentPane().add(b3);
			
			FlowLayout flow = new FlowLayout();
			f.getContentPane().setLayout(flow);
			
			f.setVisible(true); // 맨 아래에 두어야 한다.
		
	}

}
