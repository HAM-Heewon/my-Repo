package model;

public class candidateDTO {

	String num;
	String name;
	String jm;
	String grade;
	String p_num;
	String p_call;
	
	public candidateDTO() {}

	public candidateDTO(String num,String name,String jm,String grade,String p_num,String p_call) {
		this.num = num;
		this.name = name;
		this.jm = jm;
		this.grade = grade;
		this.p_num = p_num;
		this.p_call = p_call;
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

	public String getJm() {
		return jm;
	}

	public void setJm(String jm) {
		this.jm = jm;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getP_num() {
		return p_num;
	}

	public void setP_num(String p_num) {
		this.p_num = p_num;
	}

	public String getP_call() {
		return p_call;
	}

	public void setP_call(String p_call) {
		this.p_call = p_call;
	}
	
}
