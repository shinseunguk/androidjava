package 예매확인;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import 예매확인.Reservation_Info_VO;



public class Reservation_Info_DAO {
	
	public Reservation_Info_VO read(int ticket_id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3366/shop";
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
}
