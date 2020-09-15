package 로그인;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import DB.PaymentDB;
import busdeviation.DeviationSelect;
import 예매확인.Reservation_Info_UI;

public class Payment {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JTextField textField_7;
	private static JPasswordField passwordField;
	private static JPasswordField passwordField_1;
	private static JPasswordField passwordField_2;
	static String cardN = null;

	public Payment() {
		JFrame f = new JFrame();
		f.setSize(800, 600);
		f.getContentPane().setLayout(null);
		f.setTitle("버스 예약 시스템");
		JComboBox<String> jComboBox;

		JLabel l1 = new JLabel("카드 결제");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("굴림", Font.BOLD, 20));
		l1.setBounds(328, 10, 116, 49);
		f.getContentPane().add(l1);

		textField = new JTextField();
		textField.setBounds(57, 186, 133, 33);
		f.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(234, 186, 133, 33);
		f.getContentPane().add(textField_1);

		passwordField = new JPasswordField();
		passwordField.setBounds(101, 372, 240, 49);
		f.getContentPane().add(passwordField);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(412, 186, 123, 33);
		f.getContentPane().add(passwordField_1);

		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(592, 186, 123, 33);
		f.getContentPane().add(passwordField_2);

		String card[] = { "선택하세요", "Lotte", "Hana", "Kookmin", "BC", "Shinhan", "Samsung", "NH", "Hyundai", "Junbook",
				"Soohyup", "Woori", "Gwangju", "City" };
		jComboBox = new JComboBox<String>(card);
		jComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();
				cardN = (String) cb.getSelectedItem();
			}
		});

		jComboBox.setBounds(287, 110, 185, 35);
		f.add(jComboBox);

		JLabel l1_1 = new JLabel("-");
		l1_1.setHorizontalAlignment(SwingConstants.CENTER);
		l1_1.setFont(new Font("굴림", Font.BOLD, 20));
		l1_1.setBounds(188, 184, 47, 33);
		f.getContentPane().add(l1_1);

		JLabel l1_1_1 = new JLabel("-");
		l1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		l1_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		l1_1_1.setBounds(367, 186, 47, 33);
		f.getContentPane().add(l1_1_1);

		JLabel l1_1_2 = new JLabel("-");
		l1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		l1_1_2.setFont(new Font("굴림", Font.BOLD, 20));
		l1_1_2.setBounds(546, 184, 47, 33);
		f.getContentPane().add(l1_1_2);

		JLabel l1_2 = new JLabel("카드 번호");
		l1_2.setHorizontalAlignment(SwingConstants.CENTER);
		l1_2.setFont(new Font("굴림", Font.BOLD, 14));
		l1_2.setBounds(32, 140, 116, 49);
		f.getContentPane().add(l1_2);

		JLabel l1_2_1 = new JLabel("유효 기간 월(MONTH)");
		l1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		l1_2_1.setFont(new Font("굴림", Font.BOLD, 14));
		l1_2_1.setBounds(130, 229, 178, 49);
		f.getContentPane().add(l1_2_1);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(141, 276, 178, 49);
		f.getContentPane().add(textField_4);

		JLabel l1_2_1_1 = new JLabel("유효 기간 년(YEAR)");
		l1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		l1_2_1_1.setFont(new Font("굴림", Font.BOLD, 14));
		l1_2_1_1.setBounds(430, 229, 178, 49);
		f.getContentPane().add(l1_2_1_1);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(449, 276, 178, 49);
		f.getContentPane().add(textField_5);

		JLabel l1_2_1_2 = new JLabel("카드 비밀번호");
		l1_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		l1_2_1_2.setFont(new Font("굴림", Font.BOLD, 14));
		l1_2_1_2.setBounds(62, 325, 178, 49);
		f.getContentPane().add(l1_2_1_2);

		JLabel l1_2_1_1_1 = new JLabel("생년월일(YYYYMMDD)");
		l1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		l1_2_1_1_1.setFont(new Font("굴림", Font.BOLD, 14));
		l1_2_1_1_1.setBounds(470, 325, 178, 49);
		f.getContentPane().add(l1_2_1_1_1);

		textField_7 = new JTextField("");
		textField_7.setColumns(10);
		textField_7.setBounds(475, 372, 240, 49);
		f.getContentPane().add(textField_7);

		JLabel l1_3 = new JLabel("총 결제금액");
		l1_3.setHorizontalAlignment(SwingConstants.CENTER);
		l1_3.setFont(new Font("굴림", Font.BOLD, 20));
		l1_3.setBounds(53, 448, 128, 33);
		f.getContentPane().add(l1_3);

		JLabel l1_3_1 = new JLabel("원");
		l1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		l1_3_1.setFont(new Font("굴림", Font.BOLD, 20));
		l1_3_1.setBounds(568, 448, 128, 33);
		f.getContentPane().add(l1_3_1);

		JButton btnNewButton = new JButton("결제하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String card_company = cardN;
				String cardnumber1 = textField.getText();
				String cardnumber2 = textField_1.getText();
				String cardnumber3 = passwordField.getText();
				String cardnumber4 = passwordField_1.getText();
				String card_number = cardnumber1 + cardnumber2 + cardnumber3 + cardnumber4;
				String valid_montha = textField_4.getText();
				String valid_yearsa = textField_5.getText();
				String card_pwa = passwordField_2.getText();
				String user_birtha = textField_7.getText();

				if (cardnumber1.isEmpty() || cardnumber2.isEmpty() || cardnumber3.isEmpty() || cardnumber4.isEmpty()
						|| valid_montha.isEmpty() || valid_yearsa.isEmpty() || card_pwa.isEmpty()
						|| user_birtha.isEmpty()) {
					JOptionPane.showMessageDialog(f, "공백없이 채우시오.");
				} else {
					JOptionPane.showMessageDialog(f, "결제가 완료 되었습니다.");
					try {
						int valid_month = Integer.parseInt(valid_montha);
						int valid_years = Integer.parseInt(valid_yearsa);
						int card_pw = Integer.parseInt(card_pwa);
						int card_user_birth = Integer.parseInt(user_birtha);

						PaymentDB pay = new PaymentDB(card_company, card_number, valid_month, valid_years, card_pw,
								card_user_birth);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						System.out.println("db연결실패");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						System.out.println("db연결실패");
					}
					f.dispose();
					try {
						Reservation_Info_UI riu = new Reservation_Info_UI ();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

			}
		});
		btnNewButton.setBounds(414, 508, 222, 43);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("뒤로가기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				DeviationSelect ds = new DeviationSelect();
				
			}
		});
		btnNewButton_1.setBounds(114, 508, 222, 43);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel l1_3_1_1 = new JLabel("21,500");
		l1_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		l1_3_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		l1_3_1_1.setBounds(499, 448, 128, 33);
		f.getContentPane().add(l1_3_1_1);

		f.setVisible(true);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}