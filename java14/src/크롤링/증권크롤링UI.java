package 크롤링;

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

public class 증권크롤링UI {
	private static JTextField t1;

	public static void main(String[] args) {
		// 삼성전자, sk, 셀트리온 LG생활
		// 005930, 096770, 091990 051900

		String company[] = { "삼성전자", "LG생활", "셀트리온" };
		String codes[] = { "005930", "091990", "051900" };

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.getContentPane().setLayout(null);

		JTextPane tp1 = new JTextPane();
		tp1.setBounds(30, 399, 328, 252);
		f.getContentPane().add(tp1);
		f.setSize(400, 700);

		JButton btn_1 = new JButton("삼성전자");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				네이버증권크롤링 naver = new 네이버증권크롤링();
				String result[] = naver.crawl("005930");

				tp1.setText("회사이름 : "+ result[0]+"\n회사코드 : "+ result[1]+"\n현재가 : "+ result[2]+"\n어제와의 차이 : "+ result[3]+"\n증감비율 : "+ result[4]+"\n전일 : "+ result[5]+"\n고가 : "+ result[6]);

			}
		});
		btn_1.setFont(new Font("굴림", Font.BOLD, 45));
		btn_1.setBackground(Color.ORANGE);
		btn_1.setBounds(72, 20, 241, 61);
		f.getContentPane().add(btn_1);

		JButton btn_2 = new JButton("LG생활");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링 naver = new 네이버증권크롤링();
				String result[] = naver.crawl("051900");
				tp1.setText("회사이름 : "+ result[0]+"\n회사코드 : "+ result[1]+"\n현재가 : "+ result[2]+"\n어제와의 차이 : "+ result[3]+"\n증감비율 : "+ result[4]+"\n전일 : "+ result[5]+"\n고가 : "+ result[6]);
				
			}
		});
		btn_2.setFont(new Font("굴림", Font.BOLD, 45));
		btn_2.setBackground(Color.ORANGE);
		btn_2.setBounds(72, 91, 241, 61);
		f.getContentPane().add(btn_2);

		JButton btn_3 = new JButton("셀트리온");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링 naver = new 네이버증권크롤링();
				String result[] = naver.crawl("091990");
				
				tp1.setText("회사이름 : "+ result[0]+"\n회사코드 : "+ result[1]+"\n현재가 : "+ result[2]+"\n어제와의 차이 : "+ result[3]+"\n증감비율 : "+ result[4]+"\n전일 : "+ result[5]+"\n고가 : "+ result[6]);

			}
		});
		btn_3.setFont(new Font("굴림", Font.BOLD, 45));
		btn_3.setBackground(Color.ORANGE);
		btn_3.setBounds(72, 163, 241, 61);
		f.getContentPane().add(btn_3);

		JLabel l1 = new JLabel("code:");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("굴림", Font.BOLD, 24));
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

				네이버증권크롤링 naver = new 네이버증권크롤링();

				String a = t1.getText();

				String result[] = naver.crawl(a);
				
				tp1.setText("회사이름 : "+ result[0]+"\n회사코드 : "+ result[1]+"\n현재가 : "+ result[2]+"\n어제와의 차이 : "+ result[3]+"\n증감비율 : "+ result[4]+"\n전일 : "+ result[5]+"\n고가 : "+ result[6]);
			}
		});
		crawl.setBounds(104, 348, 175, 41);
		f.getContentPane().add(crawl);

		f.setVisible(true);
	}
}
