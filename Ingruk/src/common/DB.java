package common;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DB { //ssi.jsp문서 역할
   public static  Connection  getConnection(){
	  Connection CN = null ; 
	  try{
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	    String url="jdbc:oracle:thin:@127.0.0.1:1521:XE" ;
	    CN=DriverManager.getConnection(url,"system","1234");
	    //주석 System.out.println("오라클연결성공success 01월21일 화요일 ");
	    
	    
		//DBCP연결처리
		//Context ct = new InitialContext();
		//DataSource ds = (DataSource)ct.lookup("java:comp/env/jdbc/snow");
		//CN=ds.getConnection();  //꼭기술
		//System.out.println("dbcp연결성공성공");
	  
	   }catch(Exception ex){
		 System.out.println("db연결에러: "+ ex.toString() ); 
	   }
	  return CN;
   }//end
}//DB class END
