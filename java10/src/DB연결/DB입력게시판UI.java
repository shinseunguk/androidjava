package DB연결;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import 클래스만들기.DB처리전담;

public class DB입력게시판UI {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(800,600);
		
		JButton btnNewButton = new JButton("create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("New button");
		f.getContentPane().add(btnNewButton_1, BorderLayout.SOUTH);
		
		JButton btnNewButton_2 = new JButton("New button");
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		
		JButton btnNewButton_3 = new JButton("New button");
		f.getContentPane().add(btnNewButton_3, BorderLayout.NORTH);
		
		
		f.setVisible(true);
	}
	
	
}
