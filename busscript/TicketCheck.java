package busscript;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import 로그인.Main;
import 예매확인.Reservation_Info_DAO;
import 예매확인.Reservation_Info_UI;
import 예매확인.Reservation_Info_VO;

public class TicketCheck {
	private static JTable table;
	private static JScrollPane scrollpane;
	
	@SuppressWarnings("serial")
	public TicketCheck(String userID) throws Exception {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.WHITE);
		
		f.setSize(800,600);
		f.getContentPane().setLayout(null);
		
		//테이블 그리기
		String[] header = {"출발일", "출발지", "도착지", "좌석", "금액"};
		ArrayList<Reservation_Info_VO> list = Reservation_Info_DAO.getReservationList(userID);
		String[][] contents = new String[list.size()][5];
		for(int i=0; i<list.size(); i++) {
			Date ddate = list.get(i).getDeparture_date();
			String ddates = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm").format(ddate);
			contents[i][0] = ddates;
			contents[i][1] = list.get(i).getDeparture_point();
			contents[i][2] = list.get(i).getDestination();
			String a = new String(list.get(i).getSeat_num()+"");
			contents[i][3] = a;
			contents[i][4] = String.valueOf(list.get(i).getPrice());
		}
		table = new JTable(new DefaultTableModel(contents, header) {
			@Override
		    public boolean isCellEditable(int row, int column) {
		       return false;
		       
		    }
		});
		table.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		table.setRowHeight(30);

		//스크롤 패널 그리기
		scrollpane = new JScrollPane(table);
		scrollpane.setBounds(12, 10, 760, 452);
		f.getContentPane().add(scrollpane);
		
		JButton btnCancel = new JButton("취소");
		btnCancel.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//닫는 부분 구현
				f.dispose();
				Main main = new Main(userID);
			}
		});
		btnCancel.setBounds(118, 482, 169, 48);
		f.getContentPane().add(btnCancel);
		
		JButton btnOK = new JButton("확인");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				try {
					Reservation_Info_DAO dao = new Reservation_Info_DAO();
					Reservation_Info_VO bag = dao.getReservationOne(list.get(table.getSelectedRow()).getTicket_id());
					Reservation_Info_UI ui = new Reservation_Info_UI(userID, bag);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				list.get(table.getSelectedRow()); // 넘겨서 티켓 정보 수정하는 창 띄우는 부분 구현
				
			}
		});
		btnOK.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		btnOK.setBackground(Color.WHITE);
		btnOK.setBounds(489, 482, 169, 48);
		f.getContentPane().add(btnOK);
		f.setVisible(true);
	}
	
}
