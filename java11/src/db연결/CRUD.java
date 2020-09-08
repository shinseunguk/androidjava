package db연결;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CRUD {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(500,600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID :");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 21));
		lblNewLabel.setBounds(74, 69, 91, 37);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblPw = new JLabel("PW :");
		lblPw.setFont(new Font("굴림", Font.PLAIN, 21));
		lblPw.setBounds(74, 129, 91, 37);
		f.getContentPane().add(lblPw);
		
		JLabel lblName = new JLabel("NAME :");
		lblName.setFont(new Font("굴림", Font.PLAIN, 21));
		lblName.setBounds(74, 198, 91, 37);
		f.getContentPane().add(lblName);
		
		JLabel lblTel = new JLabel("TEL :");
		lblTel.setFont(new Font("굴림", Font.PLAIN, 21));
		lblTel.setBounds(74, 261, 91, 37);
		f.getContentPane().add(lblTel);
		
		t1 = new JTextField();
		t1.setBounds(162, 75, 206, 32);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(162, 135, 206, 32);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(162, 203, 206, 32);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(162, 267, 206, 32);
		f.getContentPane().add(t4);
		
		JButton btncreate = new JButton("CREATE");
		btncreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = t1.getText();				
				String pw = t2.getText();				
				String name = t3.getText();				
				String tel = t4.getText();				
				
				MemberDAO dao = new MemberDAO();
				try {
					dao.create(id,pw,name,tel);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btncreate.setFont(new Font("굴림", Font.PLAIN, 21));
		btncreate.setBounds(64, 353, 133, 53);
		f.getContentPane().add(btncreate);
		
		JButton btnread = new JButton("READ");
		btnread.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();				
				
				MemberDAO dao = new MemberDAO();
				try {
				int result = dao.read(id); // 0이나 1이 리턴되어 왔음
				if (result == 1 ) {//검색결과가 있다
					
				}else {//검색결과가 없다
					t1.setText("없음");
					t2.setText("없음");
					t3.setText("없음");
					t4.setText("없음");
					t1.setBackground(Color.BLUE);
					t2.setBackground(Color.BLUE);
					t3.setBackground(Color.BLUE);
					t4.setBackground(Color.BLUE);
				}
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
				
			
		btnread.setFont(new Font("굴림", Font.PLAIN, 21));
		btnread.setBounds(252, 353, 133, 53);
		f.getContentPane().add(btnread);
		
		JButton btnupdate = new JButton("UPDATE");
		btnupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();				
				String pw = t2.getText();				
				String name = t3.getText();				
				String tel = t4.getText();				
				
				MemberDAO dao = new MemberDAO();
				try {
					dao.update(id,pw,name,tel);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnupdate.setFont(new Font("굴림", Font.PLAIN, 21));
		btnupdate.setBounds(64, 432, 133, 53);
		f.getContentPane().add(btnupdate);
		
		JButton btndelete = new JButton("DELETE");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();				
				
				MemberDAO dao = new MemberDAO();
				try {
					dao.delete(id);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btndelete.setFont(new Font("굴림", Font.PLAIN, 21));
		btndelete.setBounds(252, 432, 133, 53);
		f.getContentPane().add(btndelete);
		
		
		
		
		
		
		f.setVisible(true);
	}
}
