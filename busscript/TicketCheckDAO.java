package busscript;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TicketCheckDAO {
	static public ArrayList<TicketCheckVO> getReservationList() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3366/bus";
		String user = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String query = "select * from ticket";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		ArrayList<TicketCheckVO> list = new ArrayList<TicketCheckVO>();
		while(rs.next()) {
			TicketCheckVO element = new TicketCheckVO();
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
}
