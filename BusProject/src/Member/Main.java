package Member;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Main extends JFrame {
	public Main() {
	
	JFrame f = new JFrame();
	f.setSize(800, 600);
	f.setTitle("버스 예약 시스템");
	f.getContentPane().setLayout(null);

	JLabel l1 = new JLabel("버스 예약 시스템입니다.");
	l1.setForeground(Color.BLUE);
	l1.setFont(new Font("굴림", Font.BOLD, 23));
	l1.setHorizontalAlignment(SwingConstants.CENTER);
	l1.setBounds(113, 0, 565, 62);
	f.getContentPane().add(l1);

	JLabel l2 = new JLabel();
	l2.setBounds(60, 56, 654, 391);
	
	
	ImageIcon img = new ImageIcon("bus.png");

	l2.setIcon(img);
	
	f.getContentPane().add(l2);

	JButton btnNewButton = new JButton("버스예매");

	btnNewButton.setBounds(12, 471, 233, 62);
	f.getContentPane().add(btnNewButton);

	JButton btnNewButton_1 = new JButton("예매확인");
	btnNewButton_1.setBounds(265, 471, 233, 62);
	f.getContentPane().add(btnNewButton_1);

	JButton btnNewButton_2 = new JButton("프로그램 종료");
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0); //모든창 닫기
		}
	});
	btnNewButton_2.setBounds(515, 471, 233, 62);
	f.getContentPane().add(btnNewButton_2);

	f.setVisible(true);
	
}

}