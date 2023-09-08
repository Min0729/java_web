package 놀이동산mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ParkDAO {

	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	//
	public Connection dbcon() {		 
		Connection con = null;
		try {
			Class.forName(driver);
			con =DriverManager.getConnection(url, user, password);
			if( con != null) System.out.println( "ok");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;		 	
	}
	
	//
	public void close(AutoCloseable ...autoCloseables) {
		for( AutoCloseable item : autoCloseables) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	// 전체 티켓 종류 조회
	public ArrayList<TicketInfo> selectTicketAll(){
		
		Connection con = dbcon();
		
		String sql = "select * from ticket_tbl";
		
		ResultSet rs = null;
		PreparedStatement pst = null;
		
		ArrayList<TicketInfo> list = new ArrayList<>();
		
		try {
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			
			while(rs.next()) {

				String ticket_id = rs.getString(1);
				String ticket_type = rs.getString(2);
				String ticket_time_type = rs.getString(3);
				String ticket_available_time = rs.getString(4);
				String ticket_age = rs.getString(5);
				int ticket_price = rs.getInt(6);
				
				list.add(new TicketInfo(ticket_id,ticket_type,ticket_time_type,ticket_available_time,ticket_age,ticket_price));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(rs,pst,con);
		return list;
	
	}
	
	// 특정 회원 결제 내역 조회
	public ArrayList<Member_payment> select_payment_details(String cus_id){
		
		Connection con = dbcon();
		
		
		String sql =" select r.RECEIPT_ID,r.RECEIPT_DATE,t.TICKET_TYPE,nvl(t.TICKET_TIME_TYPE,' '), ";
		sql +=" t.TICKET_AVAILABLE_TIME,c.NAME,t.TICKET_AGE,t.TICKET_PRICE,r.RECEIPT_COUNT||'개', ";
		sql +=" t.TICKET_PRICE * r.RECEIPT_COUNT||'원'from receipt_tbl r join t_customer c ";
		sql +=" on r.CUS_ID = c.ID join ticket_tbl t on r.TICKET_ID = t.TICKET_ID where r.CUS_ID = ?";
	
		
		ResultSet rs = null;
		PreparedStatement pst = null;
		ArrayList<Member_payment> list = new ArrayList<>();
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, cus_id);
			
			rs = pst.executeQuery();
	
			while(rs.next()) {
				String receipt_id = rs.getString(1);
				String receipt_date = rs.getString(2);
				String ticket_type = rs.getString(3);
				String ticket_time_type = rs.getString(4);
				String ticket_available_time = rs.getString(5);
				String name = rs.getString(6);
				String age = rs.getString(7);
				String ticket_price = rs.getString(8);
				String receipt_count= rs.getString(9);
				String total_price= rs.getString(10);
				
				list.add(new Member_payment(receipt_id,receipt_date,ticket_type,ticket_time_type,ticket_available_time,
						name,age,ticket_price,receipt_count,total_price));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(rs,pst,con);
		return list;
			
	}
	
	
	// 관리자가 회원정보 조회
	public ArrayList<Member> select_member_list(){
		
		Connection con = dbcon();
		String sql = "select * from t_customer";
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		ArrayList<Member> list = new ArrayList<>();
		
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				
				String id = rs.getString(1);
				String name = rs.getString(2);
				String tel = rs.getString(3);
				String age = rs.getString(4);
				
				list.add(new Member(id,name,tel,age));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(rs,pst,con);
		return list;
		}
	
	
	// 관리자가 회원정보 삭제
	public void deleteOne(String id) {
		
		Connection con = dbcon();
		String sql = "delete from t_customer where id=?";
		
		PreparedStatement pst = null;
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			pst.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(pst,con);
		
	}
	
	
	
		
	/*public static void main(String[] args) {
		ParkDAO dao = new ParkDAO();
		
		//ArrayList<TicketInfo> list = dao.selectTicketAll();
		//System.out.println(list);
		
		//ArrayList<Member_payment> list = dao.select_payment_details("3");
		//System.out.println(list);
		
		//ArrayList<Member> list = dao.select_member_list();
		//System.out.println(list);
	}*/
	
}
