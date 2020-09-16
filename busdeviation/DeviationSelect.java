package busdeviation;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import busscript.Location;
import 예매확인.Reservation_Info_VO;
import 좌석선택.Seat_Reservation;

public class DeviationSelect {
	private static JTable table;
	private static JScrollPane scrollpane;
	private static SpringLayout springLayout;
	private static JTextField textField;
	
	public class ContentsWrapper {
		String[][] c;
		
		public ContentsWrapper(String[][] c) {
			this.c = c;
		}
		
		public String[][] getContents() {
			return c;
		}
	}
	
	static HashMap<String, ContentsWrapper> dateHash = new HashMap<String, ContentsWrapper> ();
	
	public DeviationSelect(String userID, Reservation_Info_VO bag) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.WHITE);
		Random r = new Random();
		String[] buscompanyname = {"Kyeongseong", "Boyeong", "Yongnim", "Taereung", "Heungan"};
		
		f.setSize(800,600);
		f.getContentPane().setLayout(null);
		
		String[] header = {"날짜", "버스회사"};
		String[][] contents;
		
		//오늘 날짜 텍스트필드
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(Color.WHITE);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		textField.setBounds(312, 25, 227, 38);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		textField.setText(df.format(bag.getDeparture_date()));
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		//버스정보를 랜덤으로 5개까지 생성해서 뿌려주는 테이블
		//수정: static HashMap에 이미 등록되어 있다면 그것을 가져오고, 없다면 새로 랜덤 생성한다.
		if(!dateHash.containsKey(textField.getText())) { 
			contents = new String[r.nextInt(5)+1][2];
			HashSet<Integer> times = new HashSet<Integer>();
			while(times.size()<contents.length) {
				times.add(r.nextInt(24));
			}
			ArrayList<Integer> timeList = new ArrayList<Integer>(times);
			Collections.sort(timeList);
			for (int i = 0; i < contents.length; i++) {
				contents[i][0] = timeList.get(i) + ":00";
				if(timeList.get(i) < 10) contents[i][0] = "0" + contents[i][0];
				contents[i][1] = buscompanyname[r.nextInt(5)];
			}
			
			ContentsWrapper c = new ContentsWrapper(contents);
			dateHash.put(textField.getText(), c);
		}
		else contents = dateHash.get(textField.getText()).getContents();
		
		table = new JTable(new DefaultTableModel(contents, header) {
			@Override
		    public boolean isCellEditable(int row, int column) {
		       return false;
		    }
		});
		
		table.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		table.setRowHeight(30);
		
		//스크롤패널(테이블을 담는다)
		scrollpane = new JScrollPane(table);
		scrollpane.setBounds(12, 100, 762, 307);
		
		f.getContentPane().add(scrollpane);
		
		//취소버튼
		JButton btnNewButton = new JButton("취소");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//그냥 화면 닫기
				f.dispose();
				try {
					Location lo = new Location(userID);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(450, 479, 227, 46);
		f.getContentPane().add(btnNewButton);
		
		//확인버튼
		JButton btnNewButton_1 = new JButton("확인");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				int idx = table.getSelectedRow();
				bag.getDeparture_date().setHours(Integer.parseInt( contents[idx][0].substring(0,2) ));
				bag.getDeparture_date().setMinutes(0);
				bag.setBus_info(contents[idx][1]);
				bag.setPlatform_info(String.valueOf(r.nextInt(15)+1));
				Seat_Reservation sr = new Seat_Reservation(userID, bag);
				//contents[table.getSelectedRow()][0], contents[table.getSelectedRow()][1] 넘겨주기
			}
		});
		btnNewButton_1.setBounds(108, 479, 227, 46);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("예약일자");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		lblNewLabel.setBounds(201, 25, 120, 38);
		f.getContentPane().add(lblNewLabel);
		

		
		f.setVisible(true);
		
		
	}
}
