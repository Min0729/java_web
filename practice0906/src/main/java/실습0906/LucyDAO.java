package 실습0906;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class LucyDAO {

	  String driver = "oracle.jdbc.driver.OracleDriver" ;
	  String url="jdbc:oracle:thin:@localhost:1521:xe";
	  String user="scott";
	  String password="tiger";	 
	  ;	
	  
	  public Connection dbcon(){	 
			Connection con =null;
			try {
				Class.forName(driver);
				con  =DriverManager.getConnection(url, user, password);
				if( con != null) System.out.println("ok");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return con;
		}
	  
	  
	  public ArrayList<Lucy> getLucyList(){
		  
		  Connection con = dbcon();
		  String sql = "select * from lucytbl";
		  ArrayList<Lucy> list = new ArrayList<>();
		  
		  try {
			 PreparedStatement pst = con.prepareStatement(sql);
			 ResultSet rs = pst.executeQuery();
		
			 while(rs.next()) {
				 
				 String name = rs.getString(1);
				 String position = rs.getString(2);
				 String birth_year = rs.getString(3);
				 
				 Lucy lucy = new Lucy(name, position, birth_year);
				 list.add(lucy);
				 
			 }
			 rs.close();
			 pst.close();
			 con.close();
			 
			 
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return list;
		  
	  }
	  
	  
	  public static void main(String[] args){
		  LucyDAO l = new LucyDAO();
		  l.dbcon();
		  ArrayList<Lucy> list  = l.getLucyList();	  
		  System.out.println( list);
		  
	}
	  
	  
	  
}
