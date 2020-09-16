package 좌석선택;

import 예매확인.Reservation_Info_VO;

public class Seat_Reservation {
	public Seat_Reservation(String userID, Reservation_Info_VO bag) {
		Seat_Frame main = new Seat_Frame(bag);
		main.mainFrame(userID);
	}
}
