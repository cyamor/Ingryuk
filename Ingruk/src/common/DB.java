package common;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DB { //ssi.jsp���� ����
   public static  Connection  getConnection(){
	  Connection CN = null ; 
	  try{
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	    String url="jdbc:oracle:thin:@127.0.0.1:1521:XE" ;
	    CN=DriverManager.getConnection(url,"system","1234");
	    //�ּ� System.out.println("����Ŭ���Ἲ��success 01��21�� ȭ���� ");
	    
	    
		//DBCP����ó��
		//Context ct = new InitialContext();
		//DataSource ds = (DataSource)ct.lookup("java:comp/env/jdbc/snow");
		//CN=ds.getConnection();  //�����
		//System.out.println("dbcp���Ἲ������");
	  
	   }catch(Exception ex){
		 System.out.println("db���ῡ��: "+ ex.toString() ); 
	   }
	  return CN;
   }//end
}//DB class END
