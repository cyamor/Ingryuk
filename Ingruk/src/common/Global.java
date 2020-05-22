package common;

import java.sql.*;
import java.util.Date;
import java.util.ArrayList; //��ü��ȸ,�Ѱ���ȸ

public class Global {

	/* DB���� */
	public String msg; // ����������ϴ� ���ڿ�
	public Connection CN; // DB���������� user/pwd���, CN�����ؼ� ��ɾ����
	public Statement ST; // �����θ�ɾ� ST=CN.createStatement(X);
	public PreparedStatement PST; // �����θ�ɾ� PST=CN.prepareStatement(sql);
	public CallableStatement CS; // ���߿� storedprocedure
	public ResultSet RS;// ��ȸ�Ѱ����� RS=ST.executeQuery(select~),RS.next()

	/* User���� (users table) */
	public String Uid, Upwd, Uname; // ����� ���̵�, �н�����, �̸�
	public int Ubirth, Uphone; // ����� �������, ����ó
	public Date joinDate; // ȸ�����Գ�¥
	public String Uemail, uType; // ����,����� ���
	public ArrayList Ulist; // ��������Ʈ: admin��

	/* Commission ��� ���� (commission_form table) */
	public String Ctitle, Cdescrip, CustomerId, Cfiles; // Ŀ�̼� ����, ����, �Ƿ���, ����url
	public int Cid, Crn, categoryId, Cpay; // �Ƿڹ�ȣ, ���ȣ, ī�װ�����,��ʱ�
	public Date registDate; // �Խñ�(Ŀ�̼�) ��� ��¥
	public ArrayList Clist; // Ŀ�̼� ����Ʈ
	public int Gtotal = 1; // ��ȸ���ڵ尹��
	public int Atotal = 1; // ��ü���ڵ尹��
	public int hit; //��ȸ��
	
	
	/* Commission ���� ���� (commission table) */
	//customer id, commission id ����
	public String contracteeId, status; //�Ƿ� ������, �������
	public int customerPoint, contracteePoint; //�Ƿ���-������ ������
	public ArrayList Cstatus; //����� Ŀ�̼� ����Ʈ

}// Global class END
