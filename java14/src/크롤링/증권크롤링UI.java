package ũ�Ѹ�;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ����ũ�Ѹ�UI {
	private static JTextField t1;

	public static void main(String[] args) {
		// �Ｚ����, sk, ��Ʈ���� LG��Ȱ
		// 005930, 096770, 091990 051900

		String company[] = { "�Ｚ����", "LG��Ȱ", "��Ʈ����" };
		String codes[] = { "005930", "091990", "051900" };

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.getContentPane().setLayout(null);

		JTextPane tp1 = new JTextPane();
		tp1.setBounds(30, 399, 328, 252);
		f.getContentPane().add(tp1);
		f.setSize(400, 700);

		JButton btn_1 = new JButton("�Ｚ����");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				���̹�����ũ�Ѹ� naver = new ���̹�����ũ�Ѹ�();
				String result[] = naver.crawl("005930");

				tp1.setText("ȸ���̸� : "+ result[0]+"\nȸ���ڵ� : "+ result[1]+"\n���簡 : "+ result[2]+"\n�������� ���� : "+ result[3]+"\n�������� : "+ result[4]+"\n���� : "+ result[5]+"\n�� : "+ result[6]);

			}
		});
		btn_1.setFont(new Font("����", Font.BOLD, 45));
		btn_1.setBackground(Color.ORANGE);
		btn_1.setBounds(72, 20, 241, 61);
		f.getContentPane().add(btn_1);

		JButton btn_2 = new JButton("LG��Ȱ");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���̹�����ũ�Ѹ� naver = new ���̹�����ũ�Ѹ�();
				String result[] = naver.crawl("051900");
				tp1.setText("ȸ���̸� : "+ result[0]+"\nȸ���ڵ� : "+ result[1]+"\n���簡 : "+ result[2]+"\n�������� ���� : "+ result[3]+"\n�������� : "+ result[4]+"\n���� : "+ result[5]+"\n�� : "+ result[6]);
				
			}
		});
		btn_2.setFont(new Font("����", Font.BOLD, 45));
		btn_2.setBackground(Color.ORANGE);
		btn_2.setBounds(72, 91, 241, 61);
		f.getContentPane().add(btn_2);

		JButton btn_3 = new JButton("��Ʈ����");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���̹�����ũ�Ѹ� naver = new ���̹�����ũ�Ѹ�();
				String result[] = naver.crawl("091990");
				
				tp1.setText("ȸ���̸� : "+ result[0]+"\nȸ���ڵ� : "+ result[1]+"\n���簡 : "+ result[2]+"\n�������� ���� : "+ result[3]+"\n�������� : "+ result[4]+"\n���� : "+ result[5]+"\n�� : "+ result[6]);

			}
		});
		btn_3.setFont(new Font("����", Font.BOLD, 45));
		btn_3.setBackground(Color.ORANGE);
		btn_3.setBounds(72, 163, 241, 61);
		f.getContentPane().add(btn_3);

		JLabel l1 = new JLabel("code:");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("����", Font.BOLD, 24));
		l1.setBounds(124, 234, 115, 49);
		f.getContentPane().add(l1);

		t1 = new JTextField();
		t1.setBackground(Color.GREEN);
		t1.setBounds(30, 289, 328, 49);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JButton crawl = new JButton("\uD06C\uB864\uB9C1\uC2DC\uC791");
		crawl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				���̹�����ũ�Ѹ� naver = new ���̹�����ũ�Ѹ�();

				String a = t1.getText();

				String result[] = naver.crawl(a);
				
				tp1.setText("ȸ���̸� : "+ result[0]+"\nȸ���ڵ� : "+ result[1]+"\n���簡 : "+ result[2]+"\n�������� ���� : "+ result[3]+"\n�������� : "+ result[4]+"\n���� : "+ result[5]+"\n�� : "+ result[6]);
			}
		});
		crawl.setBounds(104, 348, 175, 41);
		f.getContentPane().add(crawl);

		f.setVisible(true);
	}
}
