package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class goodsDAO {

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
	
	public void insert(goodsmanageDTO dto) {
		dbCon();
		String sql = "insert into goods_tbl_500 values(cd_scs.nextval,?,?,?,?)";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, dto.getG_cd());
			pst.setString(2, dto.getG_nm());
			pst.setString(3, dto.getG_price());
			pst.setString(4, dto.getCost());
			pst.setString(5, dto.getDate());
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<goodsmanageDTO> goods_list(){
		
		dbCon();
		
		
		String sql = " select * from goods_tbl_500 ";
		ArrayList<goodsmanageDTO> arr = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				goodsmanageDTO dto = new goodsmanageDTO();
				dto.setG_cd(rs.getString(1));
				dto.setG_nm(rs.getString(2));
				dto.setG_price(rs.getString(3));
				dto.setCost(rs.getString(4));
				dto.setDate(rs.getString(5));
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
