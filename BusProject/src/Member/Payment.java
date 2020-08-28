package Member;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;

public class Payment {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JTextField textField_7;
	private static JPasswordField passwordField;
	private static JPasswordField passwordField_1;
	private static JPasswordField passwordField_2;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(800, 600);
		f.getContentPane().setLayout(null);
		f.setTitle("버스 예약 시스템");
		JComboBox<String> combo;


		
		JLabel l1 = new JLabel("카드 결제");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("굴림", Font.BOLD, 20));
		l1.setBounds(328, 10, 116, 49);
		f.getContentPane().add(l1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("개인");
		rdbtnNewRadioButton.setFont(new Font("굴림", Font.BOLD, 20));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnNewRadioButton.setBounds(114, 65, 128, 33);
		f.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("법인");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnNewRadioButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		rdbtnNewRadioButton_1.setBounds(467, 65, 128, 33);
		f.getContentPane().add(rdbtnNewRadioButton_1);
		
		textField = new JTextField();
		textField.setBounds(57, 186, 133, 33);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(234, 186, 133, 33);
		f.getContentPane().add(textField_1);
		
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
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(475, 372, 240, 49);
		f.getContentPane().add(textField_7);
		
		JLabel l1_3 = new JLabel("총 결제금액");
		l1_3.setHorizontalAlignment(SwingConstants.CENTER);
		l1_3.setFont(new Font("굴림", Font.BOLD, 20));
		l1_3.setBounds(53, 448, 128, 33);
		f.getContentPane().add(l1_3);
		
		JLabel l1_3_1 = new JLabel("금액");
		l1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		l1_3_1.setFont(new Font("굴림", Font.BOLD, 20));
		l1_3_1.setBounds(568, 448, 128, 33);
		f.getContentPane().add(l1_3_1);
		
		JButton btnNewButton = new JButton("결제하기");
		btnNewButton.setBounds(114, 508, 552, 43);
		f.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(101, 372, 240, 49);
		f.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(412, 186, 123, 33);
		f.getContentPane().add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(592, 186, 123, 33);
		f.getContentPane().add(passwordField_2);
		
		String card[]= {"롯데","하나","국민","BC","신한","삼성","농협","현대","전북","수협","우리","광주","씨티"};
		 combo = new JComboBox<String>(card);

		combo.setBounds(287, 110, 185, 35);
		f.add(combo);
		
		
		
		
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
