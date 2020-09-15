package busscript;

import java.util.Date;

public class TicketCheckVO {
	int ticket_id;
	String user_id;
	String departure_point;
	String destination;
	Date departure_date;
	String bus_info;
	String platform_info;
	int seat_num;
	int price;
	Date pay_date;
	String card_num;
	public int getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getDeparture_point() {
		return departure_point;
	}
	public void setDeparture_point(String departure_point) {
		this.departure_point = departure_point;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDeparture_date() {
		return departure_date;
	}
	public void setDeparture_date(Date departure_date) {
		this.departure_date = departure_date;
	}
	public String getBus_info() {
		return bus_info;
	}
	public void setBus_info(String bus_info) {
		this.bus_info = bus_info;
	}
	public String getPlatform_info() {
		return platform_info;
	}
	public void setPlatform_info(String platform_info) {
		this.platform_info = platform_info;
	}
	public int getSeat_num() {
		return seat_num;
	}
	public void setSeat_num(int seat_num) {
		this.seat_num = seat_num;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getPay_date() {
		return pay_date;
	}
	public void setPay_date(Date pay_date) {
		this.pay_date = pay_date;
	}
	public String getCard_num() {
		return card_num;
	}
	public void setCard_num(String card_num) {
		this.card_num = card_num;
	}
}
