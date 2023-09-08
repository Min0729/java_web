package 실습0901;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GoodsDAO {

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
	
	
	// 상품 전체 조회
	public ArrayList<Goods> selectAll(){
		
		Connection con  =dbcon();
		
		String sql = "select * from goodstbl ";
		
		ResultSet rs = null;
		PreparedStatement pst = null;
		
		ArrayList<Goods> list = new ArrayList<>();
		
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String price = rs.getString(3);
				
				list.add(new Goods(id, name, price ));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		close(rs,pst,con);
		return list;
	}
	
	// 상품 하나 조회
	public Goods selectOne(String id) {
		
		Connection con = dbcon();
		
		String sql = "select * from goodstbl where id=?";
		ResultSet rs = null;
		PreparedStatement pst = null;
		Goods g = null;
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			
			rs = pst.executeQuery();
			
			if(rs.next()) {
				String id_tmp = rs.getString(1);
				String name_tmp = rs.getString(2);
				String price_tmp = rs.getString(3);
				
				g = new Goods(id_tmp, name_tmp, price_tmp);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(rs,pst,con);
		return g;
		
	}
	
	// 상품 등록
	public void insertGoods(Goods g) {
		
		Connection con = dbcon();
		
		String sql = "insert into goodstbl values(?,?,?)";
		PreparedStatement pst = null;
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, g.getId());
			pst.setString(2, g.getName());
			pst.setString(3, g.getPrice());
			pst.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(pst,con);
		
	}
	
	// 상품 삭제
	public void deleteOne(String id) {
		
		Connection con = dbcon();
		
		String sql = "delete from goodstbl where id=?";
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
	
	// 상품 정보 변경
	public void updateGoods(Goods g) {
		
		Connection con = dbcon();
		String sql = "update goodstbl set price=? where id=?";
		PreparedStatement pst = null;
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, g.getPrice());
			pst.setString(2, g.getId());
			pst.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		close(pst,con);
		
	}
	
	
	
	
	
	//
	//public static void main(String[] args) {
		//GoodsDAO dao = new GoodsDAO();
		//ArrayList<Goods> list = dao.selectAll();
		//System.out.println(list);
		
		//Goods g = dao.selectOne("c001");
		//System.out.println(g);
		
		//dao.insertGoods(new Goods("c004","카페라떼","3000원"));
		
		//dao.deleteOne("c004");
		
		//dao.updateGoods(new Goods("c002", "바닐라라떼", "3000원"));
	//}
	
}
