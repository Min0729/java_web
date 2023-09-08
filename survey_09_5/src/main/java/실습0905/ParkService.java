package 실습0905;

import java.util.ArrayList;

public class ParkService {

	ParkDAO dao = new ParkDAO();
	
	// 전체 티켓 종류 조회
	public ArrayList<TicketInfo> getTicketInfoList(){
		 ArrayList<TicketInfo> list = dao.selectTicketAll();
		 return list;
	}
	
	// 특정 회원 결제 내역 조회
	public ArrayList<Member_payment> getMemberPayment(String id){
		ArrayList<Member_payment> list = dao.select_payment_details(id);
		return list;
	}
}
