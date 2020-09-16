package 예매확인;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import 로그인.Main;
import 좌석선택.ImagePanel;

public class Reservation_Info_Frame {

	public static BufferedImage getScreenShot(Component component) {

		BufferedImage image = new BufferedImage(component.getWidth(), component.getHeight(),
				BufferedImage.TYPE_INT_RGB);
		component.paint(image.getGraphics());
		return image;
	}

	public void info_frame(String userID, Reservation_Info_VO bag) throws Exception {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.WHITE);	
		
		JLabel label_m_1 = new JLabel();
		label_m_1.setForeground(new Color(144, 197, 221));
		label_m_1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		label_m_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_m_1.setText("버스티켓");
		label_m_1.setBounds(220, 37, 113, 37);
		JLabel label_m_2 = new JLabel();
		label_m_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_m_2.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		label_m_2.setText("예매가 완료되었습니다.");
		label_m_2.setBounds(345, 37, 279, 37);
		JLabel label_m_3 = new JLabel();
		label_m_3.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		label_m_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_m_3.setText("고속버스 모바일앱의 예매확인 메뉴에서 승차권을 확인이 가능합니다.");
		label_m_3.setBounds(198, 73, 410, 35);
		// ==========================================panel 1
		JPanel pn1 = new JPanel();
		pn1.setBounds(12, 131, 760, 252);
		pn1.setBackground(new Color(243, 244, 246));
		JLabel label_1_m1_date = new JLabel();
		label_1_m1_date.setBounds(12, 0, 216, 36);
		label_1_m1_date.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		
		Date ddate = bag.getDeparture_date();
		String ddates = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm").format(ddate);

		label_1_m1_date.setText(ddates);
		JLabel label_1_m2_rnum = new JLabel();
		label_1_m2_rnum.setBounds(569, 1, 57, 35);
		label_1_m2_rnum.setForeground(Color.GRAY);
		label_1_m2_rnum.setFont(new Font("맑은 고딕", Font.BOLD, 13));
//		label_1_m2_rnum.setText("예매번호");
		JLabel label_1_m2_rnum_i = new JLabel();
		label_1_m2_rnum_i.setBounds(638, 0, 122, 36);
		label_1_m2_rnum_i.setForeground(Color.DARK_GRAY);
		label_1_m2_rnum_i.setFont(new Font("맑은 고딕", Font.BOLD, 12));
//		label_1_m2_rnum_i.setText(bag.getTicket_id()+"");

		// =========================================panel 1-1
		ImagePanel imgpn1 = new ImagePanel("./images/Start-arrive.png");
		imgpn1.setBounds(12, 34, 51, 81);
		JPanel pn1_1 = new JPanel();
		pn1_1.setBackground(Color.WHITE);
		pn1_1.setBounds(3, 35, 385, 214);
		JLabel label_1_1_start = new JLabel();
		label_1_1_start.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		label_1_1_start.setText(bag.getDeparture_point());
		label_1_1_start.setBounds(75, 34, 150, 30);
		JLabel label_1_1_arrive = new JLabel();
		label_1_1_arrive.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		label_1_1_arrive.setText(bag.getDestination());
		label_1_1_arrive.setBounds(75, 80, 150, 30);
		// =========================================panel 1-2
		JPanel pn1_2 = new JPanel();
		pn1_2.setBackground(Color.WHITE);
		pn1_2.setBounds(390, 35, 367, 214);
		JLabel label_1_2_buscompany = new JLabel();
		label_1_2_buscompany.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		label_1_2_buscompany.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		label_1_2_buscompany.setText("고속사");
		label_1_2_buscompany.setBounds(12, 20, 44, 30);
		JLabel label_1_2_buscompany_i = new JLabel();
		label_1_2_buscompany_i.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		label_1_2_buscompany_i.setText("새서울고속");
		label_1_2_buscompany_i.setBounds(68, 20, 100, 30);
		JLabel label_1_2_businfo = new JLabel();
		label_1_2_businfo.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		label_1_2_businfo.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		label_1_2_businfo.setText("등급");
		label_1_2_businfo.setBounds(12, 53, 44, 30);
		JLabel label_1_2_businfo_i = new JLabel();
		label_1_2_businfo_i.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		label_1_2_businfo_i.setText("우등");
		label_1_2_businfo_i.setBounds(68, 53, 100, 30);
		JLabel label_1_2_platform = new JLabel();
		label_1_2_platform.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		label_1_2_platform.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		label_1_2_platform.setText("승차홀");
		label_1_2_platform.setBounds(12, 86, 44, 30);
		JLabel lblA = new JLabel();
		lblA.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lblA.setText(bag.getPlatform_info());
		lblA.setBounds(68, 86, 100, 30);
		JLabel label_1_2_peoplenum = new JLabel();
		label_1_2_peoplenum.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		label_1_2_peoplenum.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		label_1_2_peoplenum.setText("매수");
		label_1_2_peoplenum.setBounds(12, 119, 44, 30);
		JLabel label_1_2_peoplenum_i = new JLabel();
		label_1_2_peoplenum_i.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		label_1_2_peoplenum_i.setText("일반 1명");
		label_1_2_peoplenum_i.setBounds(68, 119, 100, 30);
		JLabel label_1_2_seatnum = new JLabel();
		label_1_2_seatnum.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		label_1_2_seatnum.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		label_1_2_seatnum.setText("좌석");
		label_1_2_seatnum.setBounds(12, 152, 44, 30);
		JLabel label_1_2_seatnum_i = new JLabel();
		label_1_2_seatnum_i.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		label_1_2_seatnum_i.setText(bag.getSeat_num()+"번");
		label_1_2_seatnum_i.setBounds(68, 152, 100, 30);

		// =========================================panel 2
		JPanel pn2 = new JPanel();
		pn2.setBounds(12, 386, 760, 165);
		pn2.setBackground(new Color(243, 244, 246));
		JLabel label_2_paydate = new JLabel();
		label_2_paydate.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		label_2_paydate.setForeground(new Color(102, 204, 255));
		label_2_paydate.setText("결재일시");
		label_2_paydate.setBounds(12, 20, 78, 30);
		JLabel label_2_paydate_i = new JLabel();
		Date pdate = bag.getPay_date();
		String pdates = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss").format(pdate);
		label_2_paydate_i.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		label_2_paydate_i.setText(pdates);
		label_2_paydate_i.setBounds(96, 20, 200, 30);
		JLabel label_2_paymethod = new JLabel();
		label_2_paymethod.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		label_2_paymethod.setForeground(new Color(102, 204, 255));
		label_2_paymethod.setText("결재수단");
		label_2_paymethod.setBounds(12, 96, 78, 30);
		JLabel label_2_paymethod_i = new JLabel();
		label_2_paymethod_i.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		label_2_paymethod_i.setText("신용카드");
		label_2_paymethod_i.setBounds(96, 96, 100, 30);
		JLabel label_2_payprice = new JLabel();
		label_2_payprice.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		label_2_payprice.setForeground(new Color(102, 204, 255));
		label_2_payprice.setText("결제금액");
		label_2_payprice.setBounds(395, 20, 78, 30);
		JLabel label_2_payprice_i = new JLabel();
		label_2_payprice_i.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		label_2_payprice_i.setText(bag.getPrice()+" 원");
		label_2_payprice_i.setBounds(648, 20, 100, 30);

		JButton back = new JButton();
		back.setForeground(new Color(255, 255, 255));
		back.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		back.setBackground(new Color(102, 0, 255));
		back.setBounds(395, 489, 175, 53);
		back.setText("메인으로");
		f.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				Main main = new Main(userID);
			}
		});
		JButton confirm = new JButton();
		confirm.setForeground(new Color(255, 255, 255));
		confirm.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		confirm.setBackground(new Color(102, 0, 255));	
		confirm.setBounds(595, 102, 175, 53);
		confirm.setText("결재정보저장");

		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				BufferedImage img = getScreenShot(f.getContentPane());
				JOptionPane.showMessageDialog(null, new JLabel(new ImageIcon(
						img.getScaledInstance(img.getWidth(null) / 2, img.getHeight(null) / 2, Image.SCALE_SMOOTH))));
				try {

					ImageIO.write(img, "png", new File("./예매정보/예매정보.png"));
				} catch (Exception e) {
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(f, "저장되었습니다.");
			}
		});
		f.getContentPane().setLayout(null);
		f.setLayout(null);

		f.add(pn1);
		pn1.setLayout(null);
		pn1.add(label_1_m1_date);
		pn1.add(label_1_m2_rnum);
		pn1.add(label_1_m2_rnum_i);
		pn1.add(pn1_1);
		pn1_1.setLayout(null);
		pn1_1.add(label_1_1_start);
		pn1_1.add(label_1_1_arrive);
		pn1_1.add(imgpn1);
		pn1.add(pn1_2);
		pn1_2.setLayout(null);
		pn1_2.add(label_1_2_buscompany);
		pn1_2.add(label_1_2_buscompany_i);
		pn1_2.add(label_1_2_businfo);
		pn1_2.add(label_1_2_businfo_i);
		pn1_2.add(label_1_2_platform);
		pn1_2.add(lblA);
		pn1_2.add(label_1_2_peoplenum);
		pn1_2.add(label_1_2_peoplenum_i);
		pn1_2.add(label_1_2_seatnum);
		pn1_2.add(label_1_2_seatnum_i);
		f.add(pn2);
		pn2.setLayout(null);

		JPanel pn1_3 = new JPanel();
		pn1_3.setBounds(364, 5, 1, 1);
		pn1_3.setLayout(null);
		pn1_3.setBackground(new Color(243, 244, 246));
		pn2.add(pn1_3);

		JLabel label_1_m1_date_1 = new JLabel();
		label_1_m1_date_1.setText("2020.08.24(토) 20:00 출발");
		label_1_m1_date_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		label_1_m1_date_1.setBounds(12, 0, 216, 36);
		pn1_3.add(label_1_m1_date_1);

		JLabel label_1_m2_rnum_1 = new JLabel();
		label_1_m2_rnum_1.setText("예매번호");
		label_1_m2_rnum_1.setForeground(Color.GRAY);
		label_1_m2_rnum_1.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		label_1_m2_rnum_1.setBounds(569, 1, 57, 35);
		pn1_3.add(label_1_m2_rnum_1);

		JLabel label_1_m2_rnum_i_1 = new JLabel();
		label_1_m2_rnum_i_1.setText("123456789125423");
		label_1_m2_rnum_i_1.setForeground(Color.DARK_GRAY);
		label_1_m2_rnum_i_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		label_1_m2_rnum_i_1.setBounds(638, 0, 122, 36);
		pn1_3.add(label_1_m2_rnum_i_1);

		JPanel pn1_1_1 = new JPanel();
		pn1_1_1.setBackground(Color.WHITE);
		pn1_1_1.setBounds(3, 35, 385, 214);
		pn1_3.add(pn1_1_1);

		JLabel label_1_1_start_1 = new JLabel();
		pn1_1_1.add(label_1_1_start_1);

		JLabel label_1_1_arrive_1 = new JLabel();
		pn1_1_1.add(label_1_1_arrive_1);

		JLabel label_1_1_arrive_time_1 = new JLabel();
		pn1_1_1.add(label_1_1_arrive_time_1);

		JPanel pn1_2_1 = new JPanel();
		pn1_2_1.setBackground(Color.WHITE);
		pn1_2_1.setBounds(390, 35, 367, 214);
		pn1_3.add(pn1_2_1);

		JLabel label_1_2_buscompany_1 = new JLabel();
		pn1_2_1.add(label_1_2_buscompany_1);

		JLabel label_1_2_buscompany_i_1 = new JLabel();
		pn1_2_1.add(label_1_2_buscompany_i_1);

		JLabel label_1_2_businfo_1 = new JLabel();
		pn1_2_1.add(label_1_2_businfo_1);

		JLabel label_1_2_businfo_i_1 = new JLabel();
		pn1_2_1.add(label_1_2_businfo_i_1);

		JLabel label_1_2_platform_1 = new JLabel();
		pn1_2_1.add(label_1_2_platform_1);

		JLabel label_1_2_platform_i_1 = new JLabel();
		pn1_2_1.add(label_1_2_platform_i_1);

		JLabel label_1_2_peoplenum_1 = new JLabel();
		pn1_2_1.add(label_1_2_peoplenum_1);

		JLabel label_1_2_peoplenum_i_1 = new JLabel();
		pn1_2_1.add(label_1_2_peoplenum_i_1);

		JLabel label_1_2_seatnum_1 = new JLabel();
		pn1_2_1.add(label_1_2_seatnum_1);

		JLabel label_1_2_seatnum_i_1 = new JLabel();
		pn1_2_1.add(label_1_2_seatnum_i_1);
		pn2.add(label_2_paydate);
		pn2.add(label_2_paydate_i);
		pn2.add(label_2_paymethod);
		pn2.add(label_2_paymethod_i);
		pn2.add(label_2_payprice);
		pn2.add(label_2_payprice_i);
		pn2.add(confirm);
		f.add(label_m_1);
		f.add(label_m_2);
		f.add(label_m_3);

		f.setSize(800, 600);
		f.setVisible(true);
	}
}
