<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>    
<%
    
    // 1. 
    request.setCharacterEncoding("UTF-8");
    
    // 2.
    String num = request.getParameter("num");
    String time = request.getParameter("time");
    String date = request.getParameter("date");
    String id = request.getParameter("id");
    String starting_point = request.getParameter("starting_point");
    String destination = request.getParameter("destination");
    String taxi_num = request.getParameter("taxi_num");
    	
    
    // 데이터베이스 연결, sql, update 실행
    Connection con=null;
    PreparedStatement st = null;
	
	try{ 
		// 데이터베이스 연결정보
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		

		Class.forName(driver); 
	
		con= DriverManager.getConnection(url, user, password); 
		
		 
		
		String sql ="update tblcall_list";
			sql+=    " set regtime= ?,";
			sql+=  	" regdate= ? ,";
			sql+=  	" startpoint= ?,";
			sql+=  	" destination= ?";
			sql+=  	" where regno= ? ";
				
		st = con.prepareStatement(sql);
				
		st.setString(1,time);
		st.setString(2, date);
		st.setString(3, starting_point);
		st.setString(4, destination);
		st.setString(5, num);
				
		// 실행
		 st.executeUpdate() ;
		
		
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{ //자원의 반납
		if( st != null) st.close();
		if( con != null) con.close();
	}
    
    
    // 
    //response.sendRedirect("택시_김민지_list.jsp");
    
    %>