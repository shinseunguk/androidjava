package DB연결;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import 클래스만들기.DB처리전담;

public class 버튼4개 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame();
		f.setSize(500,500);
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB처리전담 name = new DB처리전담();
				name.read();
			}
		});
		b2.setText("Read");
		JButton b3 = new JButton();
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB처리전담 name = new DB처리전담();
				name.update();
			}
		});
		b3.setText("Update");
		JButton b4 = new JButton();
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB처리전담 name = new DB처리전담();
				name.delete();
			}
		});
		b4.setText("Delete");
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB처리전담 name = new DB처리전담();
//				name.create();
				
			}
		});
		f.getContentPane().setLayout(new BorderLayout(0, 0));
		b1.setText("Create");
		
		f.getContentPane().add(b1, BorderLayout.NORTH);
		f.getContentPane().add(b2, BorderLayout.EAST);
		f.getContentPane().add(b3, BorderLayout.WEST);
		f.getContentPane().add(b4, BorderLayout.SOUTH);
		
		
		f.setVisible(true);
	}

}
