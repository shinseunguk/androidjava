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
	f.setTitle("���� ���� �ý���");
	f.getContentPane().setLayout(null);

	JLabel l1 = new JLabel("���� ���� �ý����Դϴ�.");
	l1.setForeground(Color.BLUE);
	l1.setFont(new Font("����", Font.BOLD, 23));
	l1.setHorizontalAlignment(SwingConstants.CENTER);
	l1.setBounds(113, 0, 565, 62);
	f.getContentPane().add(l1);

	JLabel l2 = new JLabel();
	l2.setBounds(60, 56, 654, 391);
	
	
	ImageIcon img = new ImageIcon("bus.png");

	l2.setIcon(img);
	
	f.getContentPane().add(l2);

	JButton btnNewButton = new JButton("��������");

	btnNewButton.setBounds(12, 471, 233, 62);
	f.getContentPane().add(btnNewButton);

	JButton btnNewButton_1 = new JButton("����Ȯ��");
	btnNewButton_1.setBounds(265, 471, 233, 62);
	f.getContentPane().add(btnNewButton_1);

	JButton btnNewButton_2 = new JButton("���α׷� ����");
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0); //���â �ݱ�
		}
	});
	btnNewButton_2.setBounds(515, 471, 233, 62);
	f.getContentPane().add(btnNewButton_2);

	f.setVisible(true);
	
}

}