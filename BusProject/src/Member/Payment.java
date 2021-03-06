package Member;

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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import DB.PaymentDB;

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
		f.setTitle("���� ���� �ý���");
		JComboBox<String> jComboBox;
		String cardN = null;

		
		
		JLabel l1 = new JLabel("ī�� ����");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("����", Font.BOLD, 20));
		l1.setBounds(328, 10, 116, 49);
		f.getContentPane().add(l1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("����");
		rdbtnNewRadioButton.setFont(new Font("����", Font.BOLD, 20));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnNewRadioButton.setBounds(114, 65, 128, 33);
		f.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("����");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnNewRadioButton_1.setFont(new Font("����", Font.BOLD, 20));
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
		
		passwordField = new JPasswordField();
		passwordField.setBounds(101, 372, 240, 49);
		f.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(412, 186, 123, 33);
		f.getContentPane().add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(592, 186, 123, 33);
		f.getContentPane().add(passwordField_2);
		
		String card[]= {"�Ե�","�ϳ�","����","BC","����","�Ｚ","����","����","����","����","�츮","����","��Ƽ"};
		 jComboBox = new JComboBox<String>(card);
		 jComboBox.addActionListener(new ActionListener() {
		       public void actionPerformed(ActionEvent e) {
		           JComboBox cb = (JComboBox) e.getSource();
		           String cardN =  (String) cb.getSelectedItem(); 
		           PaymentVO vo = new PaymentVO();
		           vo.setCardN(cardN);
		           System.out.println(cardN);
		       }
		});
		 

		jComboBox.setBounds(287, 110, 185, 35);
		f.add(jComboBox);
		
		JLabel l1_1 = new JLabel("-");
		l1_1.setHorizontalAlignment(SwingConstants.CENTER);
		l1_1.setFont(new Font("����", Font.BOLD, 20));
		l1_1.setBounds(188, 184, 47, 33);
		f.getContentPane().add(l1_1);
		
		JLabel l1_1_1 = new JLabel("-");
		l1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		l1_1_1.setFont(new Font("����", Font.BOLD, 20));
		l1_1_1.setBounds(367, 186, 47, 33);
		f.getContentPane().add(l1_1_1);
		
		JLabel l1_1_2 = new JLabel("-");
		l1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		l1_1_2.setFont(new Font("����", Font.BOLD, 20));
		l1_1_2.setBounds(546, 184, 47, 33);
		f.getContentPane().add(l1_1_2);
		
		JLabel l1_2 = new JLabel("ī�� ��ȣ");
		l1_2.setHorizontalAlignment(SwingConstants.CENTER);
		l1_2.setFont(new Font("����", Font.BOLD, 14));
		l1_2.setBounds(32, 140, 116, 49);
		f.getContentPane().add(l1_2);
		
		JLabel l1_2_1 = new JLabel("��ȿ �Ⱓ ��(MONTH)");
		l1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		l1_2_1.setFont(new Font("����", Font.BOLD, 14));
		l1_2_1.setBounds(130, 229, 178, 49);
		f.getContentPane().add(l1_2_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(141, 276, 178, 49);
		f.getContentPane().add(textField_4);
		
		JLabel l1_2_1_1 = new JLabel("��ȿ �Ⱓ ��(YEAR)");
		l1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		l1_2_1_1.setFont(new Font("����", Font.BOLD, 14));
		l1_2_1_1.setBounds(430, 229, 178, 49);
		f.getContentPane().add(l1_2_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(449, 276, 178, 49);
		f.getContentPane().add(textField_5);
		
		JLabel l1_2_1_2 = new JLabel("ī�� ��й�ȣ");
		l1_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		l1_2_1_2.setFont(new Font("����", Font.BOLD, 14));
		l1_2_1_2.setBounds(62, 325, 178, 49);
		f.getContentPane().add(l1_2_1_2);
		
		JLabel l1_2_1_1_1 = new JLabel("�������(YYYYMMDD)");
		l1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		l1_2_1_1_1.setFont(new Font("����", Font.BOLD, 14));
		l1_2_1_1_1.setBounds(470, 325, 178, 49);
		f.getContentPane().add(l1_2_1_1_1);
		
		textField_7 = new JTextField("");
		textField_7.setColumns(10);
		textField_7.setBounds(475, 372, 240, 49);
		f.getContentPane().add(textField_7);
		
		JLabel l1_3 = new JLabel("�� �����ݾ�");
		l1_3.setHorizontalAlignment(SwingConstants.CENTER);
		l1_3.setFont(new Font("����", Font.BOLD, 20));
		l1_3.setBounds(53, 448, 128, 33);
		f.getContentPane().add(l1_3);
		
		JLabel l1_3_1 = new JLabel("�ݾ�");
		l1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		l1_3_1.setFont(new Font("����", Font.BOLD, 20));
		l1_3_1.setBounds(568, 448, 128, 33);
		f.getContentPane().add(l1_3_1);
		
		JButton btnNewButton = new JButton("�����ϱ�");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "������ �Ϸ� �Ǿ����ϴ�.");
				
				
				String cardnumber1 = textField.getText();
				String cardnumber2 = textField_1.getText();
				String cardnumber3 = passwordField.getText();
				String cardnumber4 = passwordField_1.getText();
				String card_number = cardnumber1+cardnumber2+cardnumber3+cardnumber4;
				int valid_month = Integer.parseInt(textField_4.getText());
				int valid_years = Integer.parseInt(textField_5.getText());
				int card_pw = Integer.parseInt(passwordField_2.getText());
				int user_birth = Integer.parseInt(textField_7.getText());
				
				try {
					PaymentVO vo = new PaymentVO();
					String cardcom= vo.getCardN(cardN);
					PaymentDB pay = new PaymentDB(cardcom,card_number,valid_month,valid_years,card_pw,user_birth);
					System.out.println(cardcom);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println("db�������");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println("db�������");
				}
				f.dispose();
				Main main = new Main();
				
			}
		});
		btnNewButton.setBounds(414, 508, 222, 43);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("�ڷΰ���");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(114, 508, 222, 43);
		f.getContentPane().add(btnNewButton_1);
		
		
		
		
		
		
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