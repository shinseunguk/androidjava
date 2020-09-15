package busscript;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpringLayout;

import busdeviation.DeviationSelect;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import 로그인.Main;

//ArrayList에 대응하기 위해 확장된 Listener
abstract class IndexedListener implements ActionListener {
	int idx;
	public IndexedListener(int b) {
		idx = b;
	}
	abstract public void actionPerformed(ActionEvent e);
}

public class Location {
	private static JTextField tfOrigin;
	private static JTextField tfDest;
	static Color COLOR_SKYBLUE = new Color(104, 179, 206);
	
	static CardLayout card = new CardLayout();
	static String[] mainArray = {"서울경부", "센트럴시티(서울)", "광주(유스퀘어)", "부산", "부산사상", "동서울", "대전복합", "전주", "유성", "천안", "동대구"};
	static ArrayList<String> allArray = new ArrayList<String>();
	static ArrayList<String> seoulArray = new ArrayList<String>();
	static ArrayList<String> incheonArray = new ArrayList<String>();
	static ArrayList<String> kangwonArray = new ArrayList<String>();
	static ArrayList<String> daejeonArray = new ArrayList<String>();
	static ArrayList<String> chungbukArray = new ArrayList<String>();
	static ArrayList<String> gwangjuArray = new ArrayList<String>();
	static ArrayList<String> jeonbukArray = new ArrayList<String>();
	static ArrayList<String> busanArray = new ArrayList<String>();
	static ArrayList<String> daeguArray = new ArrayList<String>();
	static int tfPointer = 0;	//JTextField를 가리키는 포인터 (0이면 tfOrigin, 1이면 tfDest)
	
	JFrame f;
	JFrame jfParent;
	private SpringLayout springLayout;
	
	public Location (JFrame parentFrame) throws Exception {
		f = new JFrame();
		f.getContentPane().setBackground(Color.WHITE);
		f.setSize(800, 600);
		f.getContentPane().setLayout(null);
		jfParent = parentFrame;
		
		//Location ArrayList를 DB에서 불러와 초기화
		if(allArray.size() == 0) setTerminalArray();
		
		//출발지 도착지 textfield
		tfOrigin = new JTextField();
		tfOrigin.setEditable(false);
		tfOrigin.setBackground(Color.WHITE);
		tfOrigin.setFont(new Font("맑은 고딕", Font.PLAIN, 36));
		tfOrigin.setBounds(12, 91, 363, 73);
		f.getContentPane().add(tfOrigin);
		tfOrigin.setColumns(10);
		tfOrigin.addMouseListener(new MouseAdapter() {
			@Override //클릭하면 해당 textfield를 활성화
			public void mouseClicked(MouseEvent e) {
				tfPointer = 0;
				tfOrigin.setBackground(Color.WHITE);
				tfDest.setBackground(Color.LIGHT_GRAY);
			};
		});
		
		tfDest = new JTextField();
		tfDest.setEditable(false);
		tfDest.setBackground(Color.LIGHT_GRAY);
		tfDest.setFont(new Font("맑은 고딕", Font.PLAIN, 36));
		tfDest.setColumns(10);
		tfDest.setBounds(409, 91, 363, 73);
		f.getContentPane().add(tfDest);
		tfDest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tfPointer = 1;
				tfOrigin.setBackground(Color.LIGHT_GRAY);
				tfDest.setBackground(Color.WHITE);
			};
		});
		
		//주요터미널 출력
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(142, 174, 630, 66);
		f.getContentPane().add(panel1);
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JButton[] btnMainLocation = new JButton[mainArray.length];
		for(int i=0; i<mainArray.length; i++) {
			btnMainLocation[i] = new JButton(mainArray[i]);
			btnMainLocation[i].setBackground(Color.WHITE);
			btnMainLocation[i].setFont(new Font("맑은 고딕", Font.PLAIN, 12));
			btnMainLocation[i].addActionListener(new IndexedListener(i) {
				public void actionPerformed(ActionEvent e) {
					//버튼을 누르면 활성화된 textfield에 값입력
					if(tfPointer == 0) tfOrigin.setText(mainArray[idx]);
					else tfDest.setText(mainArray[idx]);
					tfPointer = 1;
					tfOrigin.setBackground(Color.LIGHT_GRAY);
					tfDest.setBackground(Color.WHITE);
				}
			});
			panel1.add(btnMainLocation[i]);
		}
		
		//지역별 터미널 카드 호출하는 버튼 패널
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		panel2.setBounds(12, 279, 254, 186);
		panel2.setLayout(null);
		f.getContentPane().add(panel2);
		
		//스크롤 패널
		JScrollPane spTerminalCards = new JScrollPane();
		spTerminalCards.setBounds(276, 279, 498, 186);
		spTerminalCards.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		spTerminalCards.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		spTerminalCards.getVerticalScrollBar().setUnitIncrement(16);
		f.getContentPane().add(spTerminalCards);
		
		//지역별 터미널 출력하는 카드 패널
		card = new CardLayout();
		JPanel pnTerminalCards = new JPanel();
		pnTerminalCards.setBackground(Color.WHITE);
		pnTerminalCards.setLayout(card);
		Dimension size = new Dimension(480, 1200);
		pnTerminalCards.setPreferredSize(size);
		spTerminalCards.setViewportView(pnTerminalCards);
		
		//카드 패널과 출력 버튼
		JPanel locationAll = setLocationPanel(allArray);
		pnTerminalCards.add("all", locationAll);
		JButton btnAll = setLocationButton(pnTerminalCards, "all", new Dimension(480, 1200));
		btnAll.setText("전체");
		btnAll.setBounds(11, 5, 110, 25);
		panel2.add(btnAll);
		
		JPanel locationSeoul = setLocationPanel(seoulArray);
		pnTerminalCards.add("seoul", locationSeoul);
		JButton btnSeoul = setLocationButton(pnTerminalCards, "seoul", new Dimension(498, 180));
		btnSeoul.setText("서울");
		btnSeoul.setBounds(130, 5, 110, 25);
		panel2.add(btnSeoul);
		
		JPanel locationIncheon = setLocationPanel(incheonArray);
		pnTerminalCards.add("incheon", locationIncheon);
		JButton btnIncheon = setLocationButton(pnTerminalCards, "incheon", new Dimension(480, 270));
		btnIncheon.setText("인천/경기");
		btnIncheon.setBounds(11, 35, 110, 25);
		panel2.add(btnIncheon);
		
		JPanel locationKangwon = setLocationPanel(kangwonArray);
		pnTerminalCards.add("kangwon", locationKangwon);
		JButton btnKangwon = setLocationButton(pnTerminalCards, "kangwon", new Dimension(498, 180));
		btnKangwon.setText("강원");
		btnKangwon.setBounds(130, 35, 110, 25);
		panel2.add(btnKangwon);
		
		JPanel locationDaejeon = setLocationPanel(daejeonArray);
		pnTerminalCards.add("daejeon", locationDaejeon);
		JButton btnDaejeon = setLocationButton(pnTerminalCards, "daejeon", new Dimension(480, 300));
		btnDaejeon.setText("대전/충남");
		btnDaejeon.setBounds(11, 65, 110, 25);
		panel2.add(btnDaejeon);
		
		JPanel locationChungbuk = setLocationPanel(chungbukArray);
		pnTerminalCards.add("chungbuk", locationChungbuk);
		JButton btnChungbuk = setLocationButton(pnTerminalCards, "chungbuk", new Dimension(498, 180));
		btnChungbuk.setText("충북");
		btnChungbuk.setBounds(130, 65, 110, 25);
		panel2.add(btnChungbuk);
		
		JPanel locationGwangju = setLocationPanel(gwangjuArray);
		pnTerminalCards.add("gwangju", locationGwangju);
		JButton btnGwangju = setLocationButton(pnTerminalCards, "gwangju", new Dimension(480, 210));
		btnGwangju.setText("광주/전남");
		btnGwangju.setBounds(11, 95, 110, 25);
		panel2.add(btnGwangju);
		
		JPanel locationBusan = setLocationPanel(busanArray);
		pnTerminalCards.add("busan", locationBusan);
		JButton btnBusan = setLocationButton(pnTerminalCards, "busan", new Dimension(498, 180));
		btnBusan.setText("부산/경남");
		btnBusan.setBounds(130, 95, 110, 25);
		panel2.add(btnBusan);
		
		JPanel locationJeonbuk = setLocationPanel(jeonbukArray);
		pnTerminalCards.add("jeonbuk", locationJeonbuk);
		JButton btnJeonbuk = setLocationButton(pnTerminalCards, "jeonbuk", new Dimension(498, 180));
		btnJeonbuk.setText("전북");
		btnJeonbuk.setBounds(11, 125, 110, 25);
		panel2.add(btnJeonbuk);
		
		JPanel locationDaegu = setLocationPanel(daeguArray);
		pnTerminalCards.add("daegu", locationDaegu);
		JButton btnDaegu = setLocationButton(pnTerminalCards, "daegu", new Dimension(498, 180));
		btnDaegu.setText("대구/경북");
		btnDaegu.setBounds(130, 125, 110, 25);
		panel2.add(btnDaegu);
		
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
		springLayout = (SpringLayout) datePicker.getLayout();
		datePicker.setBackground(Color.WHITE);
		datePicker.getJFormattedTextField().setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		datePicker.setBounds(318,475,284,25);
		f.getContentPane().add(datePicker);
		
		//부제목들
		JLabel lblOrigin = new JLabel("\uCD9C\uBC1C\uC9C0");
		lblOrigin.setForeground(COLOR_SKYBLUE);
		lblOrigin.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		lblOrigin.setBounds(12, 52, 199, 43);
		f.getContentPane().add(lblOrigin);
		
		JLabel lblDest = new JLabel("\uB3C4\uCC29\uC9C0");
		lblDest.setForeground(COLOR_SKYBLUE);
		lblDest.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		lblDest.setBounds(409, 55, 80, 40);
		f.getContentPane().add(lblDest);
		
		JLabel lblMain = new JLabel("\uC8FC\uC694\uCD9C\uBC1C\uC9C0");
		lblMain.setForeground(COLOR_SKYBLUE);
		lblMain.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		lblMain.setBounds(12, 174, 173, 33);
		f.getContentPane().add(lblMain);
		
		JLabel lblArea = new JLabel("\uC9C0\uC5ED\uBCC4 \uD130\uBBF8\uB110");
		lblArea.setForeground(COLOR_SKYBLUE);
		lblArea.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		lblArea.setBounds(12, 237, 173, 45);
		f.getContentPane().add(lblArea);
		
		//제목
		JPanel panel = new JPanel();
		panel.setBackground(COLOR_SKYBLUE);
		panel.setBounds(0, 0, 800, 50);
		f.getContentPane().add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("\uCD9C\uBC1C\uC9C0/\uB3C4\uCC29\uC9C0 \uC120\uD0DD");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		lblNewLabel_3.setForeground(Color.WHITE);
		panel.add(lblNewLabel_3);

		//확인 버튼을 누르면 tfOrigin과 tfDest의 값을 원래 패널에 되돌려주고 패널을 닫는다.
		JButton btnSubmit = new JButton("\uD655\uC778");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfOrigin.getText().equals("") || tfDest.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "출발지나 도착지를 선택하지 않았습니다.");
					return;
				}
				if(tfOrigin.getText().equals(tfDest.getText())) {
					JOptionPane.showMessageDialog(null, "출발지와 도착지가 같습니다.");
					return;
				}
				if(datePicker.getJFormattedTextField().getText().equals("")) {
					JOptionPane.showMessageDialog(null, "날짜를 지정하십시오.");
					return;
				}else {
				f.dispose();
				DeviationSelect ds = new DeviationSelect();
				
					
				}
				//parentPanel.setVisible(true);
				//panel1.setVisible(false);
			}
		});
		btnSubmit.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnSubmit.setBackground(Color.WHITE);
		btnSubmit.setBounds(265, 515, 110, 25);
		f.getContentPane().add(btnSubmit);
		
		//취소 버튼을 누르면 그냥 닫는다.
		JButton btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panel1.setVisible(false);
				f.dispose();
				Main main = new Main();
			}
		});
		btnCancel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(409, 515, 110, 25);
		f.getContentPane().add(btnCancel);
		
		JLabel lblDate = new JLabel("출발일시");
		lblDate.setForeground(new Color(104, 179, 206));
		lblDate.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		lblDate.setBounds(202, 464, 173, 45);
		f.getContentPane().add(lblDate);
		f.setVisible(true);
	}
	
	//db에 접속하여 터미널과 터미널 분류 테이블을 받아온다.
	public static void setTerminalArray() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3366/bus";
		String user = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String query = "select * from bus_reservation";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			allArray.add(rs.getString("terminal"));
			switch(rs.getString("area")) {
			case "서울": seoulArray.add(rs.getString("terminal")); break;
			case "인천/경기": incheonArray.add(rs.getString("terminal")); break;
			case "강원": kangwonArray.add(rs.getString("terminal")); break;
			case "대전/충남": daejeonArray.add(rs.getString("terminal")); break;
			case "충북": chungbukArray.add(rs.getString("terminal")); break;
			case "부산/경남": busanArray.add(rs.getString("terminal")); break;
			case "광주/전남": gwangjuArray.add(rs.getString("terminal")); break;
			case "전북": jeonbukArray.add(rs.getString("terminal")); break;
			case "대구/경북": daeguArray.add(rs.getString("terminal")); break;
			}
		}
		Collections.sort(allArray);
	}
	
	//ArrayList<String> locationArray: 터미널 이름이 포함된 ArrayList
	//버튼을 눌렀을 때 출력할 카드 패널을 만들어 반환해준다.
	public static JPanel setLocationPanel (ArrayList<String> locationArray) {
		JPanel locationPanel = new JPanel();
		locationPanel.setBackground(Color.WHITE);
		locationPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		JButton[] btnLocation = new JButton[locationArray.size()];
		for(int i=0; i<locationArray.size(); i++) {
			btnLocation[i] = new JButton(locationArray.get(i));
			btnLocation[i].setBackground(Color.WHITE);
			btnLocation[i].setFont(new Font("맑은 고딕", Font.PLAIN, 12));
			btnLocation[i].addActionListener(new IndexedListener(i) {
				public void actionPerformed(ActionEvent e) {
					if(tfPointer == 0) tfOrigin.setText(locationArray.get(idx));
					else tfDest.setText(locationArray.get(idx));
					tfPointer = 1;
					tfOrigin.setBackground(Color.LIGHT_GRAY);
					tfDest.setBackground(Color.WHITE);
				}
			});
			locationPanel.add(btnLocation[i]);
		}
		return locationPanel; 
	}
	
	//JPanel pnTerminalCards: CardLayout의 panel
	//String cardname: CardLayout에서 출력할 panel의 이름
	//Dimension size: 세부조정된 CardLayout의 size, panel의 스크롤 부착 여부를 결정
	//버튼을 누르면 CardLayout의 카드를 호출하는 버튼을 만들어 반환해준다.
	public static JButton setLocationButton (JPanel pnTerminalCards, String cardname, Dimension size) {
		JButton btnLocation = new JButton();
		btnLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				card.show(pnTerminalCards, cardname);
				pnTerminalCards.setPreferredSize(size);
			}
		});
		btnLocation.setBackground(Color.WHITE);
		btnLocation.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		return btnLocation;
	}
	
	//parent frame 받아오는 메서드
	public JFrame getParentFrame() {
		return jfParent;
	} 
	
}