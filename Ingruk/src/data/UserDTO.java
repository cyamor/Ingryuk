package data;

import java.util.Date;

public class UserDTO { //User 정보 모두
	private String Uid, Upwd, Uname; // 사용자 아이디, 패스워드, 이름
	private String Ubirth, Uphone; // 사용자 생년월일, 연락처
	private Date joinDate; // 회원가입날짜
	private String Uemail, Utype; // 메일,사용자 등급
	public String getUid() {
		return Uid;
	}
	public void setUid(String uid) {
		Uid = uid;
	}
	public String getUpwd() {
		return Upwd;
	}
	public void setUpwd(String upwd) {
		Upwd = upwd;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getUbirth() {
		return Ubirth;
	}
	public void setUbirth(String ubirth) {
		Ubirth = ubirth;
	}
	public String getUphone() {
		return Uphone;
	}
	public void setUphone(String uphone) {
		Uphone = uphone;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public String getUemail() {
		return Uemail;
	}
	public void setUemail(String uemail) {
		Uemail = uemail;
	}
	public String getUtype() {
		return Utype;
	}
	public void setUtype(String Utype) {
		this.Utype = Utype;
	}
	
	
	
}
