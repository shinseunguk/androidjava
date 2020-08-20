package 그래픽swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;

public class 나의그래픽2 {

	public static void main(String[] args) {

		int count =0;
		
		
		JFrame f = new JFrame();
		f.setSize(700,700);
		
		JButton btnNewButton = new JButton("봄");
		btnNewButton.setBounds(141, 24, 400, 200);
		btnNewButton.setPreferredSize(new Dimension(400,200));
		btnNewButton.setMargin(new Insets(3, 3, 3, 3));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(f, "선선해요");
			}
		});
		f.getContentPane().setLayout(null);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 33));
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("여름");
		btnNewButton_1.setBounds(92, 245, 500, 300);
		btnNewButton_1.setPreferredSize(new Dimension(500,300));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(f, "더워요");
			}
		});
		btnNewButton_1.setBackground(Color.YELLOW);
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 33));
		f.getContentPane().add(btnNewButton_1);
		
		
		
		
		
		f.setVisible(true);
		
		
		
		
	}

}
