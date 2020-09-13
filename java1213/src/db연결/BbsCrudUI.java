package db연결;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class BbsCrudUI {
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t1;

	public static void main(String[] args) {
	
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(626,500);
		f.setLocation(500,300);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setColumns(10);
		t1.setBackground(Color.YELLOW);
		t1.setBounds(198, 39, 198, 35);
		f.getContentPane().add(t1);
		
		t2 = new JTextField();
		t2.setBackground(Color.YELLOW);
		t2.setBounds(198, 104, 198, 35);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBackground(Color.YELLOW);
		t3.setColumns(10);
		t3.setBounds(198, 167, 198, 35);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setBackground(Color.YELLOW);
		t4.setColumns(10);
		t4.setBounds(198, 233, 198, 35);
		f.getContentPane().add(t4);
		
		JLabel l1 = new JLabel("title :");
		l1.setFont(new Font("굴림", Font.PLAIN, 22));
		l1.setHorizontalAlignment(SwingConstants.LEFT);
		l1.setBounds(54, 104, 87, 35);
		f.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("content :");
		l2.setHorizontalAlignment(SwingConstants.LEFT);
		l2.setFont(new Font("굴림", Font.PLAIN, 22));
		l2.setBounds(54, 167, 87, 35);
		f.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("writer :");
		l3.setHorizontalAlignment(SwingConstants.LEFT);
		l3.setFont(new Font("굴림", Font.PLAIN, 22));
		l3.setBounds(54, 233, 87, 35);
		f.getContentPane().add(l3);
		
		JLabel lblNo = new JLabel("no :");
		lblNo.setHorizontalAlignment(SwingConstants.LEFT);
		lblNo.setFont(new Font("굴림", Font.PLAIN, 22));
		lblNo.setBounds(54, 39, 87, 35);
		f.getContentPane().add(lblNo);
		
		
		
		JButton btnNewButton = new JButton("글쓰기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				String writer = t4.getText();
				BbsDAO bdao = new BbsDAO();
				BbsVO bag = new BbsVO();
				bag.setNo(Integer.parseInt(no));
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
				
				try {
					bdao.create(bag);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(60, 307, 125, 47);
		f.getContentPane().add(btnNewButton);
		
		JButton btnRead = new JButton("검색");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = t1.getText();
	            BbsDAO dao = new BbsDAO();
	            try {
	               BbsVO bag = dao.one(Integer.parseInt(no));
	               t1.setText(String.valueOf(bag.getNo()));
	               t2.setText(bag.getTitle());
	               t3.setText(bag.getContent());
	               t4.setText(bag.getWriter());
	            }catch (Exception e1) {

	            }

				
				
			}
		});
		btnRead.setBounds(208, 307, 125, 47);
		f.getContentPane().add(btnRead);
		
		JButton btnUpdate = new JButton("글수정");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				BbsDAO dao = new BbsDAO();
				BbsVO bag = new BbsVO();
				bag.setNo(Integer.parseInt(no));
				bag.setTitle(title);
				bag.setContent(content);
			
				try {
					dao.update(bag);
					System.out.println(bag);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnUpdate.setBounds(60, 377, 125, 47);
		f.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("글삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = t1.getText();
				BbsDAO dao = new BbsDAO();
				try {
					BbsVO bag = dao.delete(Integer.parseInt(no));
				} catch (NumberFormatException | ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnDelete.setBounds(208, 377, 125, 47);
		f.getContentPane().add(btnDelete);
		JTextArea all = new JTextArea();
		JButton btnwhole = new JButton("전체목록");
		btnwhole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					BbsDAO dao = new BbsDAO();
					ArrayList<BbsVO> list =dao.all();
					System.out.println("게시판의 개수: "+ list.size()+"개");
					for (int i = 0; i < list.size(); i++) {
						
						BbsVO bag = list.get(i);
						all.append(bag.getNo()+", " + bag.getTitle()+", "+bag.getContent()+ ", "+ bag.getWriter()+ "\n");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				}
				
			
		});
		btnwhole.setBounds(345, 377, 125, 47);
		f.getContentPane().add(btnwhole);
		
		
		all.setBounds(430, 45, 112, 225);
		f.getContentPane().add(all);
		
//		
		
		
		f.setVisible(true);
	}
}
