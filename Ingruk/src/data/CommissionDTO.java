package data;

import java.util.Date;

public class CommissionDTO {//Commission ���� ���
	private String Ctitle, Cdescrip, CustomerId, Cfiles; // Ŀ�̼� ����, ����, �Ƿ���, ����url
	private int Cid, Crn, categoryId, Cpay; // �Ƿڹ�ȣ, ���ȣ, ī�װ�����,��ʱ�
	private Date registDate; // �Խñ�(Ŀ�̼�) ��� ��¥
	private int Gtotal; // ��ȸ���ڵ尹��
	private int Atotal; // ��ü���ڵ尹��
	private int hit; //��ȸ��
	/* Commission ���� ���� (commission table) */
	private String contracteeId, status; //�Ƿ� ������, �������
	private int customerPoint, contracteePoint; //�Ƿ���-������ ������
	
	public String getCtitle() {
		return Ctitle;
	}
	public void setCtitle(String ctitle) {
		Ctitle = ctitle;
	}
	public String getCdescrip() {
		return Cdescrip;
	}
	public void setCdescrip(String cdescrip) {
		Cdescrip = cdescrip;
	}
	public String getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}
	public String getCfiles() {
		return Cfiles;
	}
	public void setCfiles(String cfiles) {
		Cfiles = cfiles;
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public int getCrn() {
		return Crn;
	}
	public void setCrn(int crn) {
		Crn = crn;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getCpay() {
		return Cpay;
	}
	public void setCpay(int cpay) {
		Cpay = cpay;
	}
	public Date getRegistDate() {
		return registDate;
	}
	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}
	public int getGtotal() {
		return Gtotal;
	}
	public void setGtotal(int gtotal) {
		Gtotal = gtotal;
	}
	public int getAtotal() {
		return Atotal;
	}
	public void setAtotal(int atotal) {
		Atotal = atotal;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getContracteeId() {
		return contracteeId;
	}
	public void setContracteeId(String contracteeId) {
		this.contracteeId = contracteeId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCustomerPoint() {
		return customerPoint;
	}
	public void setCustomerPoint(int customerPoint) {
		this.customerPoint = customerPoint;
	}
	public int getContracteePoint() {
		return contracteePoint;
	}
	public void setContracteePoint(int contracteePoint) {
		this.contracteePoint = contracteePoint;
	}

}
