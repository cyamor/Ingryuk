package data;

import common.*;
import java.util.Date;
import java.util.ArrayList;

import java.sql.*;

public class CommissionSQL extends Global {
	public CommissionSQL() {
		CN = DB.getConnection();
		if (CN == null) {
			System.out.println("db���� ����");

		}
		System.out.println("db���� ����, CommissionSQL ��ü ����");
	}// ������ end

	public int CommissionWrite(CommissionDTO dto) {
		int ok = 0;
		try {
			msg = "insert into commission_form values(commission_seq.nextval,?,?,?,?,?,sysdate,?,0) ";
			PST = CN.prepareStatement(msg);
			PST.setString(1, dto.getCustomerId());
			PST.setInt(2, dto.getCategoryId());
			PST.setString(3, dto.getCtitle());
			PST.setString(4, dto.getCdescrip());
			PST.setString(5, dto.getCfiles());
			PST.setInt(6, dto.getCpay());
			ok = PST.executeUpdate();
			if (ok > 0)
				System.out.println("�Խñ� ���� ����");
		} catch (Exception e) {
			System.out.println("�Խñ� ���� ����" + e);
		}
		return ok;
	}// commissionWrite end

	public int CommissionEdit(CommissionDTO dto) {
		int ok = 0;
		try {
			msg = "update commission_form set category_id=?, title=?, description=?, files=?, pay=? where commission_id=? ";
			PST = CN.prepareStatement(msg);
			PST.setInt(1, dto.getCategoryId());
			PST.setString(2, dto.getCtitle());
			PST.setString(3, dto.getCdescrip());
			PST.setString(4, dto.getCfiles());
			PST.setInt(5, dto.getCpay());
			PST.setInt(6, dto.getCid());
			ok = PST.executeUpdate();
			if (ok > 0)
				System.out.println("�Խñ� ���� ����");
		} catch (Exception e) {
			System.out.println("�Խñ� ���� ����" + e);
		}
		return ok;
	}// commissionEdit end

	public ArrayList<CommissionDTO> CommissionList(int start, int end) { // ��ü Ŀ�̼� ��� ��ȸ
		ArrayList<CommissionDTO> Clist = new ArrayList<CommissionDTO>();
		try {
			msg = "select * from (select rownum rn, commission_id, customer_id, category_id, title, regist_date, hit, status from commissionlist) where rn between ? and ?";
			PST = CN.prepareStatement(msg);
			PST.setInt(1, start);
			PST.setInt(2, end);
			RS = PST.executeQuery(msg);
			while (RS.next() == true) {
				CommissionDTO dto = new CommissionDTO();
				dto.setCrn(RS.getInt("rn"));
				dto.setCid(RS.getInt("commission_id"));
				dto.setCategoryId(RS.getInt("category_id"));
				dto.setCtitle(RS.getString("title"));
				dto.setCustomerId(RS.getString("customer_id"));
				dto.setRegistDate(RS.getDate("regist_date"));
				dto.setHit(RS.getInt("hit"));
				dto.setStatus(RS.getString("status"));
				Clist.add(dto);
			}
		} catch (Exception e) {
			System.out.println("�ҷ����� ����" + e);
		}

		return Clist;
	}// CommissionList1 END

	public ArrayList<CommissionDTO> CommissionList(int category, int start, int end) { // ī�װ��� Ŀ�̼� ��� ��ȸ
		ArrayList<CommissionDTO> Clist = new ArrayList<CommissionDTO>();
		try {
			msg = "select * from (select rownum rn, commission_id, customer_id, category_id, title, regist_date, hit, status from commissionlist where category_id =? ) where rn between ? and ?";
			PST = CN.prepareStatement(msg);
			PST.setInt(1, category);
			PST.setInt(2, start);
			PST.setInt(3, end);
			RS = PST.executeQuery(msg);
			while (RS.next() == true) {
				CommissionDTO dto = new CommissionDTO();
				dto.setCrn(RS.getInt("rn"));
				dto.setCid(RS.getInt("commission_id"));
				dto.setCategoryId(RS.getInt("category_id"));
				dto.setCtitle(RS.getString("title"));
				dto.setCustomerId(RS.getString("customer_id"));
				dto.setRegistDate(RS.getDate("regist_date"));
				dto.setHit(RS.getInt("hit"));
				dto.setStatus(RS.getString("status"));
				Clist.add(dto);
			}
		} catch (Exception e) {
			System.out.println("�ҷ����� ����" + e);
		}

		return Clist;
	}// CommissionList2 END

	public ArrayList<CommissionDTO> CommissionSearch(String key, String val, int start, int end) { // Ŀ�̼� �˻�1
		ArrayList<CommissionDTO> Clist = new ArrayList<CommissionDTO>();
		try {
			msg = "select * from (select rownum rn, commission_id, customer_id, category_id, title, regist_date, hit, status from commissionlist where ? like '%?%') where rn between ? and ?";
			PST = CN.prepareStatement(msg);
			PST.setString(1, key);
			PST.setString(2, val);
			PST.setInt(3, start);
			PST.setInt(4, end);
			RS = PST.executeQuery(msg);
			while (RS.next() == true) {
				CommissionDTO dto = new CommissionDTO();
				dto.setCrn(RS.getInt("rn"));
				dto.setCid(RS.getInt("commission_id"));
				dto.setCategoryId(RS.getInt("category_id"));
				dto.setCtitle(RS.getString("title"));
				dto.setCustomerId(RS.getString("customer_id"));
				dto.setRegistDate(RS.getDate("regist_date"));
				dto.setHit(RS.getInt("hit"));
				dto.setStatus(RS.getString("status"));
				Clist.add(dto);
			}
		} catch (Exception e) {
			System.out.println("�˻� ���� ����" + e);
		}

		return Clist;
	}// CommissionSearch END

	public ArrayList<CommissionDTO> CommissionSearch(int category, String key, String val, int start, int end) { // Ŀ�̼�
																													// �˻�2
		ArrayList<CommissionDTO> Clist = new ArrayList<CommissionDTO>();
		try {
			msg = "select * from (select rownum rn, commission_id, customer_id, category_id, title, regist_date, hit, status from commissionlist where category_id=? and ? like '%?%') where rn between ? and ?";
			PST = CN.prepareStatement(msg);
			PST.setInt(1, category);
			PST.setString(2, key);
			PST.setString(3, val);
			PST.setInt(4, start);
			PST.setInt(5, end);
			RS = PST.executeQuery(msg);
			while (RS.next() == true) {
				CommissionDTO dto = new CommissionDTO();
				dto.setCrn(RS.getInt("rn"));
				dto.setCid(RS.getInt("commission_id"));
				dto.setCategoryId(RS.getInt("category_id"));
				dto.setCtitle(RS.getString("title"));
				dto.setCustomerId(RS.getString("customer_id"));
				dto.setRegistDate(RS.getDate("regist_date"));
				dto.setHit(RS.getInt("hit"));
				dto.setStatus(RS.getString("status"));
				Clist.add(dto);
			}
		} catch (Exception e) {
			System.out.println("�˻� ����" + e);
		}

		return Clist;
	}// CommissionSearch2 END

	public CommissionDTO commissionDetail(String data) {// Ŀ�̼� �� �� ��ȸ
		CommissionDTO dto = new CommissionDTO();
		try {
			msg = "select * from commissionlist where commission_id = " + data;
			ST = CN.createStatement();
			RS = ST.executeQuery(msg);
			if (RS.next() == true) {
				dto.setCrn(RS.getInt("rn"));
				dto.setCid(RS.getInt("commission_id"));
				dto.setCategoryId(RS.getInt("category_id"));
				dto.setCustomerId(RS.getString("customer_id"));
				dto.setCtitle(RS.getString("title"));
				dto.setCdescrip(RS.getString("description"));
				dto.setCfiles(RS.getString("files"));
				dto.setCpay(RS.getInt("pay"));
				dto.setRegistDate(RS.getDate("regist_date"));
				dto.setHit(RS.getInt("hit"));
				dto.setStatus(RS.getString("status"));
				dto.setContracteeId(RS.getString("contractee_id"));
			}

		} catch (Exception e) {
			System.out.println(data + "�� Ŀ�̼� ���� �ҷ����� ����" + e);
		}
		return dto;
	}// CommissinoDetail END

}// class END
