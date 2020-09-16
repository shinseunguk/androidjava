package 좌석선택;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import busdeviation.DeviationSelect;
import 로그인.Payment;
import 예매확인.Reservation_Info_VO;



public class Seat_Frame {
	//전역번수 선언
	public int num = 0;
	public int same = 0;
	public int seat_num = 0;
	public String dd = "";
	public int seat_price = 21500;
	public int seat_pay;
	Reservation_Info_VO bag;
	
	public Seat_Frame(Reservation_Info_VO bag) {
		this.bag = bag;
	}

	public void mainFrame(String userID) {
		//main frame
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.WHITE);
		

		
		//panel 1,2,3
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(102, 153, 204));
		p1.setBounds(12, 10, 212, 541);
		ImagePanel p2 = new ImagePanel(new ImageIcon("./images/bus_background.png").getImage());
		p2.setBounds(236, 0, 300, 560);
		JPanel p3 = new JPanel();
		p3.setBackground(Color.WHITE);
		p3.setBounds(548, 10, 224, 541);
		
		//선택완료 버튼 생성
		JButton back = new JButton();
		back.setForeground(new Color(255, 255, 255));
		back.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		back.setBackground(new Color(102, 0, 255));
		back.setBounds(560, 410, 200, 53);
		back.setText("뒤로가기");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					DeviationSelect ds = new DeviationSelect(userID, bag);
					}
			});
		f.add(back);
		
		JButton confirm = new JButton();
		confirm.setForeground(new Color(255, 255, 255));
		confirm.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		confirm.setBackground(new Color(102, 0, 255));
		confirm.setBounds(12, 478, 200, 53);
		confirm.setText("선택완료");
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == confirm) {
					if(num!=0) {
						seat_num = num;
						bag.setSeat_num(seat_num);
						bag.setPrice(21500);
						bag.setUser_id(userID);
						f.dispose();
						Payment pm = new Payment(userID, bag);
					}else {
						JOptionPane.showMessageDialog(f, "좌석을 선택해주세요.");
					
					}
				}
			}
		});
		
		//이미지 배열 생성
		ImageIcon[] img = new ImageIcon[19];
		ImageIcon[] img_c = new ImageIcon[19];
		for (int i = 0; i < img.length; i++) {
			img[i] = new ImageIcon("./images/" + (i + 1) + ".png");
			img_c[i] = new ImageIcon("./images/c" + (i + 1) + ".png");
		}
		
		//좌석 버튼 생성 및 위치 설정
		JButton[] seat = new JButton[19];
		for (int i = 0; i < seat.length; i++) {
			seat[i] = new JButton();
			seat[i].setIcon(img[i]);
			p2.add(seat[i]);
			seat[i].setSize(45, 45);
			seat[i].setContentAreaFilled(false);
			seat[i].setBorderPainted(false);
			seat[i].setFocusPainted(false);
			seat[i].setVisible(true);
		}
		for (int i = 0; i < 6; i++) {
			int j = i * 3;
			seat[j].setLocation(50, (150 + (70 * i)));
		}
		for (int i = 0; i < 6; i++) {
			int j = 1 + i * 3;
			seat[j].setLocation(100, (150 + (70 * i)));
		}
		for (int i = 0; i < 5; i++) {
			int j = 2 + i * 3;
			seat[j].setLocation(200, (150 + (70 * i)));
		}
		seat[17].setLocation(150, 500);
		seat[18].setLocation(200, 500);
		
		
		//라벨 및 기타 텍스트 필드 생성 및 설정
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		JLabel l_p1_date = new JLabel("출발일시 : " + df.format(bag.getDeparture_date()));
		l_p1_date.setForeground(Color.WHITE);
		l_p1_date.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		l_p1_date.setBounds(12, 10, 162, 37);
		p1.add(l_p1_date);
		
		JLabel l_p1_start = new JLabel("출발 : " + bag.getDeparture_point());
		l_p1_start.setForeground(Color.WHITE);
		l_p1_start.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		l_p1_start.setBounds(12, 57, 162, 37);
		p1.add(l_p1_start);
		JLabel l_p1_arrive = new JLabel("도착 : " + bag.getDestination());
		l_p1_arrive.setForeground(Color.WHITE);
		l_p1_arrive.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		l_p1_arrive.setBounds(12, 104, 162, 37);
		p1.add(l_p1_arrive);
		df = new SimpleDateFormat("hh");
		JLabel l_p1_s_time = new JLabel("출발 시간 : " + df.format(bag.getDeparture_date()) + ":00");
		l_p1_s_time.setForeground(Color.WHITE);
		l_p1_s_time.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		l_p1_s_time.setBounds(12, 213, 200, 27);
		p1.add(l_p1_s_time);
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 198, 212, 2);
		JLabel lblNewLabel = new JLabel("선택좌석");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lblNewLabel.setBounds(12, 10, 200, 37);
		p3.add(lblNewLabel);
		JLabel lblNewLabel_1 = new JLabel("좌석을 선택해주세요.");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel_1.setBounds(12, 57, 200, 37);
		p3.add(lblNewLabel_1);
		JLabel lblNewLabel_2 = new JLabel("탑승 요금");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lblNewLabel_2.setBounds(12, 104, 200, 37);
		p3.add(lblNewLabel_2);
		JLabel lblNewLabel_2_1 = new JLabel("원");
		lblNewLabel_2_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(12, 151, 200, 37);
		p3.add(lblNewLabel_2_1);
		JLabel lblNewLabel_2_2 = new JLabel("총 결제금액");
		lblNewLabel_2_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(12, 198, 200, 37);
		p3.add(lblNewLabel_2_2);
		JLabel lblNewLabel_2_2_1 = new JLabel("원");
		lblNewLabel_2_2_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel_2_2_1.setBounds(12, 245, 200, 37);
		p3.add(lblNewLabel_2_2_1);
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(UIManager.getColor("Button.background"));
		separator_1.setBounds(0, 92, 212, 2);
		p3.add(separator_1);
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(UIManager.getColor("Button.background"));
		separator_2.setBounds(0, 187, 212, 2);
		p3.add(separator_2);
		
		
		//버튼 클릭 메소드
		for (int i = 0; i < seat.length; i++) {
			seat[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton) e.getSource();
					Icon icon = b.getIcon();
					for (int j = 0; j < 9; j++) {
						if (e.getSource() == seat[j]) {
							
							if (same == 0 && seat[j].getIcon().equals(img[j])) {
								dd = icon.toString();
								num = dd.charAt(9) - '0';
								seat[j].setIcon(img_c[j]);
								lblNewLabel_1.setText((j + 1) + "번");
								Reservation_Info_VO bag = new Reservation_Info_VO();
								bag.setSeat_num(j+1);
								lblNewLabel_2_1.setText("21,500 원");
								lblNewLabel_2_2_1.setText("21,500 원");
								same++;
							} else if (same == 1 && seat[j].getIcon().equals(img_c[j])) {
								dd = icon.toString();
								num = dd.charAt(10) - '0';
								seat[j].setIcon(img[j]);
								lblNewLabel_1.setText("좌석을 선택해주세요.");
								lblNewLabel_2_1.setText(" 원");
								lblNewLabel_2_2_1.setText(" 원");
								num = 0;
								same--;
							}
						}
					}
					for (int k = 9; k < 19; k++) {
						if (e.getSource() == seat[k]) {
							if (same == 0 && seat[k].getIcon().equals(img[k])) {
								dd = icon.toString();
								num = Integer.parseInt(dd.substring(9, 11));
								seat[k].setIcon(img_c[k]);
								lblNewLabel_1.setText((k + 1) + "번");
								lblNewLabel_2_1.setText("21,500 원");
								lblNewLabel_2_2_1.setText("21,500 원");
								same++;
							} else if (same == 1 && seat[k].getIcon().equals(img_c[k])) {
								dd = icon.toString();
								num = Integer.parseInt(dd.substring(10, 12));
								seat[k].setIcon(img[k]);
								lblNewLabel_1.setText("좌석을 선택해주세요.");
								lblNewLabel_2_1.setText(" 원");
								lblNewLabel_2_2_1.setText(" 원");
								num = 0;
								same--;
							}
						}
					}
					
				}
			});
		}
		

		
		p1.add(separator);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		f.getContentPane().add(p2);
		f.getContentPane().add(p3);
		f.getContentPane().setLayout(null);
		f.getContentPane().add(p1);
		p1.setLayout(null);
		p2.setLayout(null);
		p3.setLayout(null);
		p3.add(confirm);
		f.getContentPane().add(p1);
		
		JLabel l_p1_numOfP = new JLabel("탑승인원        1명");
		l_p1_numOfP.setHorizontalAlignment(SwingConstants.CENTER);
		l_p1_numOfP.setForeground(Color.WHITE);
		l_p1_numOfP.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		l_p1_numOfP.setBounds(12, 494, 188, 37);
		p1.add(l_p1_numOfP);
		f.getContentPane().add(p2);
		f.getContentPane().add(p3);
		f.setSize(800, 600);
		f.setVisible(true);
	}
}
