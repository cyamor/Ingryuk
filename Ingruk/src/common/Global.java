package common;

import java.sql.*;
import java.util.Date;
import java.util.ArrayList; //전체조회,한건조회

public class Global {

	/* DB정보 */
	public String msg; // 쿼리문기억하는 문자열
	public Connection CN; // DB서버정보및 user/pwd기억, CN참조해서 명령어생성
	public Statement ST; // 정적인명령어 ST=CN.createStatement(X);
	public PreparedStatement PST; // 동적인명령어 PST=CN.prepareStatement(sql);
	public CallableStatement CS; // 나중에 storedprocedure
	public ResultSet RS;// 조회한결과기억 RS=ST.executeQuery(select~),RS.next()

	/* User정보 (users table) */
	public String Uid, Upwd, Uname; // 사용자 아이디, 패스워드, 이름
	public int Ubirth, Uphone; // 사용자 생년월일, 연락처
	public Date joinDate; // 회원가입날짜
	public String Uemail, uType; // 메일,사용자 등급
	public ArrayList Ulist; // 유저리스트: admin용

	/* Commission 등록 정보 (commission_form table) */
	public String Ctitle, Cdescrip, CustomerId, Cfiles; // 커미션 제목, 내용, 의뢰인, 파일url
	public int Cid, Crn, categoryId, Cpay; // 의뢰번호, 행번호, 카테고리구분,사례금
	public Date registDate; // 게시글(커미션) 등록 날짜
	public ArrayList Clist; // 커미션 리스트
	public int Gtotal = 1; // 조회레코드갯수
	public int Atotal = 1; // 전체레코드갯수
	public int hit; //조회수
	
	
	/* Commission 진행 정보 (commission table) */
	//customer id, commission id 생략
	public String contracteeId, status; //의뢰 수락인, 진행상태
	public int customerPoint, contracteePoint; //의뢰인-수락인 평가점수
	public ArrayList Cstatus; //진행된 커미션 리스트

}// Global class END
