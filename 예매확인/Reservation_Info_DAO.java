package 예매확인;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Reservation_Info_DAO {
	
	public void create(String userID, Reservation_Info_VO bag) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3366/bus?useUnicode=true&useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		
		  DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
	      //ticket id, user id, dep_point, dest, dep_date, bus_info, platform_info, seat_num, price, pay_date, card_num
	      String sql = "insert into ticket values (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	      PreparedStatement ps = con.prepareStatement(sql);
	      //ps.setString(1, bag.getUser_id());
	      ps.setString(1, userID);
	      ps.setString(2, bag.getDeparture_point());
	      ps.setString(3, bag.getDestination());
	      java.sql.Date sqlDest = new java.sql.Date(bag.getDeparture_date().getTime());
	      ps.setString(4, df.format(sqlDest));
	      ps.setString(5, bag.getBus_info());
	      ps.setString(6, bag.getPlatform_info());
	      ps.setInt(7, bag.getSeat_num());
	      ps.setInt(8, bag.getPrice());
	      java.sql.Date sqlPayd = new java.sql.Date(bag.getPay_date().getTime());
	      ps.setString(9, df.format(sqlPayd));
	      ps.setString(10, bag.getCard_num());
	      ps.executeUpdate();
	}
	
	public Reservation_Info_VO read(int ticket_id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3366/bus";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "select * from ticket where ticket_id =?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, ticket_id);

		ResultSet rs = ps.executeQuery();

		Reservation_Info_VO bag = new Reservation_Info_VO();
		
		if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
	         int ticket_id1 = rs.getInt("ticket_id");
	         String user_id1 = rs.getString("user_id");
	         String departure_point1 = rs.getString("departure_point");
	         String destination1 = rs.getString("destination");
	         Date departure_date1 = rs.getTimestamp("departure_date");
	         String bus_info1 = rs.getString("bus_info");
	         String platform_info1 = rs.getString("platform_info");
	         int seat_num1 = rs.getInt("seat_num");
	         int price1 = rs.getInt("price");
	         Date pay_date1 = rs.getTimestamp("pay_date");
	         String card_num1 = rs.getString("card_num");
	         
	         bag.setTicket_id(ticket_id1);
	         bag.setUser_id(user_id1);
	         bag.setDeparture_point(departure_point1);
	         bag.setDestination(destination1);
	         bag.setDeparture_date(departure_date1);
	         bag.setBus_info(bus_info1);
	         bag.setPlatform_info(platform_info1);
	         bag.setSeat_num(seat_num1);
	         bag.setPrice(price1);
	         bag.setPay_date(pay_date1);
	         bag.setCard_num(card_num1);
	         
	         
	      } else {
	         System.out.println("검색결과가 없어요.");
	      }
	      return bag;
	}
	
	static public ArrayList<Reservation_Info_VO> getReservationList(String userID) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3366/bus";
		String user = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String query = "select * from ticket where user_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, userID);
		ResultSet rs = ps.executeQuery();
		
		ArrayList<Reservation_Info_VO> list = new ArrayList<Reservation_Info_VO>();
		while(rs.next()) {
			Reservation_Info_VO element = new Reservation_Info_VO();
			element.setTicket_id(rs.getInt("ticket_id"));
			element.setDeparture_date(rs.getTimestamp("departure_date"));
			element.setDeparture_point(rs.getString("departure_point"));
			element.setDestination(rs.getString("destination"));
			element.setBus_info(rs.getString("bus_info"));
			element.setPlatform_info(rs.getString("platform_info"));
			element.setSeat_num(rs.getInt("seat_num"));
			element.setPrice(Integer.parseInt(rs.getString("price")));
			
			list.add(element);
		}
		
		return list;
	}
	
	public Reservation_Info_VO getReservationOne(int ticket_id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3366/bus";
		String user = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String query = "select * from ticket where ticket_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, ticket_id);
		ResultSet rs = ps.executeQuery();
		
		Reservation_Info_VO element = new Reservation_Info_VO();
		if(rs.next()) {
			element.setTicket_id(rs.getInt("ticket_id"));
			element.setDeparture_date(rs.getTimestamp("departure_date"));
			element.setDeparture_point(rs.getString("departure_point"));
			element.setDestination(rs.getString("destination"));
			element.setBus_info(rs.getString("bus_info"));
			element.setPlatform_info(rs.getString("platform_info"));
			element.setSeat_num(rs.getInt("seat_num"));
			element.setPrice(rs.getInt("price"));
			element.setPay_date(rs.getTimestamp("pay_date"));
			element.setCard_num(rs.getString("card_num"));
		}
		
		return element;
	}
}
