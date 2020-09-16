package 예매확인;

public class Reservation_Info_UI {
	public Reservation_Info_UI(String userID, Reservation_Info_VO bag) throws Exception {
		Reservation_Info_Frame f = new Reservation_Info_Frame();
		try {
			f.info_frame(userID, bag);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();


		}
	}
}
