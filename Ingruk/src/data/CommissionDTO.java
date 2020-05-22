package data;

import java.util.Date;

public class CommissionDTO {//Commission 정보 모두
	private String Ctitle, Cdescrip, CustomerId, Cfiles; // 커미션 제목, 내용, 의뢰인, 파일url
	private int Cid, Crn, categoryId, Cpay; // 의뢰번호, 행번호, 카테고리구분,사례금
	private Date registDate; // 게시글(커미션) 등록 날짜
	private int Gtotal; // 조회레코드갯수
	private int Atotal; // 전체레코드갯수
	private int hit; //조회수
	/* Commission 진행 정보 (commission table) */
	private String contracteeId, status; //의뢰 수락인, 진행상태
	private int customerPoint, contracteePoint; //의뢰인-수락인 평가점수
	
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
