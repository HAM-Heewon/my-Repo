package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class regvoteDAO {

	String driver = "oracle.jdbc.driver.OracleDriver" ;
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String password="1234";
	Connection con = null;
	
	private void dbCon() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
public void insert(regvoteDTO dto) {
		
		dbCon();
		String sql = " insert into tbl_vot_010 values(?,?,?,?,?,?) ";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, dto.getV_jumin());
			pst.setString(2, dto.getV_name());
			pst.setString(3, dto.getV_area());
			pst.setString(4, dto.getV_time());
			pst.setString(5, dto.getV_confirm());
			pst.setString(6, dto.getN_no());
			pst.executeUpdate();
			
			pst.close();
			con.close();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
public ArrayList<voterateDTO> voterate(){
	
	dbCon();
	
	
	String sql = " select * from result ";
	ArrayList<voterateDTO> arr = new ArrayList<>();
	
	try {
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			voterateDTO dto = new voterateDTO();
			dto.setNum(rs.getString(1));
			dto.setName(rs.getString(2));
			dto.setAddr(rs.getString(3));
			arr.add(dto);
		}
		
		rs.close();
		pst.close();
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return arr;
}	

public ArrayList<votecheckDTO> votecheck(){
	
	dbCon();
	String sql = " select * from jumin ";
	ArrayList<votecheckDTO> arr = new ArrayList<>();   
	
	try {
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			votecheckDTO dto = new votecheckDTO();
			dto.setName(rs.getString(1));
			dto.setBirth(rs.getString(2));
			dto.setAge(rs.getString(3));
			dto.setGender(rs.getString(4));
			dto.setArea(rs.getString(5));
			dto.setCheck(rs.getString(6));
			arr.add(dto);
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	   
	return arr;	   
}

public ArrayList<candidateDTO> candidate(){
	
	dbCon();
	String sql = " select * from member";
	ArrayList<candidateDTO> arr = new ArrayList<>();
	
	try {
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			candidateDTO dto = new candidateDTO();
			dto.setNum(rs.getString(1));
			dto.setName(rs.getString(2));
			dto.setJm(rs.getString(3));
			dto.setGrade(rs.getString(4));
			dto.setP_num(rs.getString(5));
			dto.setP_call(rs.getString(6));
			
			arr.add(dto);
		}
		
		rs.close();
		pst.close();
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return arr;
}
}
