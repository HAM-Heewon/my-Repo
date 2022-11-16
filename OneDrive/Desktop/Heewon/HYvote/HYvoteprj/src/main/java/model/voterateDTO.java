package model;

public class voterateDTO {

	String num;
	String name;
	String addr;
	
	public voterateDTO() {}

	public voterateDTO	(String num,String name,String addr) {
		super();
		this.num= num;
		this.name = name;
		this.addr = addr;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}	
	
}
