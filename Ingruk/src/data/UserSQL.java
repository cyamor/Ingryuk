package data;

import java.util.Date;
import java.util.ArrayList;

import java.sql.*;
import common.*;

public class UserSQL extends Global {
	public UserSQL() {
		CN = DB.getConnection();
		if (CN == null) {
			System.out.println("db연결 실패");

		}
		System.out.println("db연결 성공, UserSQL 객체 생성");
	}// 생성자 end

	public int confirmID(String id) {
		int result = -1;
		try {
			msg = "select count(user_id) as cnt from users where user_id =?";
			PST=CN.prepareStatement(msg);
			PST.setString(1, id);
			RS = PST.executeQuery();
			if(RS.next()==true) result = RS.getInt("cnt");

		} catch (Exception e) {
			System.out.println(e);
		}
		return result;

	}// confirmID END

	public int userInsert(UserDTO dto) {// 회원가입
		int ok = 0;
		try {
			msg = "insert into users values(?,?,?,?,?,sysdate,?,?) ";
			PST = CN.prepareStatement(msg);
			PST.setString(1, dto.getUid());
			PST.setString(2, dto.getUpwd());
			PST.setString(3, dto.getUname());
			PST.setString(4, dto.getUbirth());
			PST.setString(5, dto.getUphone());
			PST.setString(6, dto.getUtype());
			PST.setString(7, dto.getUemail());
			ok = PST.executeUpdate();
			if (ok > 0) {
				System.out.println("회원 정보 저장 완료");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return ok;

	}// Insert end

	public UserDTO UserLogin(String id, String pwd) {// 로그인후 회원정보 조회
		UserDTO dto = new UserDTO();
		try {
			PST = CN.prepareStatement("select * from users where user_id=? and user_pwd=?");
			PST.setString(1, id);
			PST.setString(2, pwd);
			RS = PST.executeQuery();
			if (RS.next() == true) {
				dto.setUid(RS.getString("user_id"));
				dto.setUpwd(RS.getString("user_pwd"));
				dto.setUname(RS.getString("user_name"));
				dto.setUphone(RS.getString("user_phone"));
				dto.setUbirth(RS.getString("user_birth"));
				dto.setUemail(RS.getString("user_email"));
				dto.setJoinDate(RS.getDate("regist_date"));
				dto.setUtype(RS.getString("user_type"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return dto;
	}// UserDetail END

	public int UserEdit(UserDTO dto) {
		int ok = 0;
		try {
			msg = "update users set user_pwd=?, user_phone=?,user_type=?,user_email=? where user_id = ? ";
			PST = CN.prepareStatement(msg);
			PST.setString(1, dto.getUpwd());
			PST.setString(2, dto.getUphone());
			PST.setString(3, dto.getUtype());
			PST.setString(4, dto.getUemail());
			PST.setString(5, dto.getUid());
			ok = PST.executeUpdate();
			if (ok > 0) {
				System.out.println("회원 정보 수정 완료");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return ok;
	}// Edit END

	public ArrayList<UserDTO> UserSearch(String key, String val) { // 유저 정보 검색
		ArrayList<UserDTO> Ulist = new ArrayList<UserDTO>();
		try {

		} catch (Exception e) {
			// TODO: handle exception
		}
		return Ulist;
	}// UserSearch END

}// class END
