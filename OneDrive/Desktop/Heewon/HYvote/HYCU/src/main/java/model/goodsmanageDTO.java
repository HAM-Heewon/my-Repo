package model;

public class goodsmanageDTO {


	String g_cd;
	String g_nm;
	String g_price;
	String cost;
	String date;
	
	public goodsmanageDTO() {};
	
	public goodsmanageDTO(String g_cd,String g_nm, String g_price, String cost, String date) {
		super();
		this.g_cd = g_cd;
		this.g_nm = g_nm;
		this.g_price = g_price;
		this.cost = cost;
		this.date = date;
	}

	public String getG_cd() {
		return g_cd;
	}

	public void setG_cd(String g_cd) {
		this.g_cd = g_cd;
	}

	public String getG_nm() {
		return g_nm;
	}

	public void setG_nm(String g_nm) {
		this.g_nm = g_nm;
	}

	public String getG_price() {
		return g_price;
	}

	public void setG_price(String g_price) {
		this.g_price = g_price;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
