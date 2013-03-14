package com.web.form.pojo;

public class FlcInfo{// extends BaseForm {
	private String flcid;          //集装箱id
	private String pallects;       //pallect的集合字段。用“|”分隔
	private String transseq;       //运输的班次
	private String batchid;        //运输的批次号
	private String transdate;      //运输日期
	private String state;          //集装箱状态
	private String errorcode;      //错误代码
	private String recv;           //保留域
	private String transid;
	private String num;
	private String userfile;
	private String flcids;
	private String query;
	private String another1;
	private String another2;
	private String another3;
	
	private String rowStart;
	private String rowEnd;
	private String sortString;
	
	public String getTransbegindate() {
		return transbegindate;
	}
	public void setTransbegindate(String transbegindate) {
		this.transbegindate = transbegindate;
	}
	public String getTransenddate() {
		return transenddate;
	}
	public void setTransenddate(String transenddate) {
		this.transenddate = transenddate;
	}
	private String transbegindate;
	private String transenddate;
	
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getAnother1() {
		return another1;
	}
	public void setAnother1(String another1) {
		this.another1 = another1;
	}
	public String getAnother2() {
		return another2;
	}
	public void setAnother2(String another2) {
		this.another2 = another2;
	}
	public String getAnother3() {
		return another3;
	}
	public void setAnother3(String another3) {
		this.another3 = another3;
	}

	
	public String getUserfile() {
		return userfile;
	}
	public void setUserfile(String userfile) {
		this.userfile = userfile;
	}
	public String getFlcids() {
		return flcids;
	}
	public void setFlcids(String flcids) {
		this.flcids = flcids;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getFlcid() {
		return flcid;
	}
	public void setFlcid(String flcid) {
		this.flcid = flcid;
	}
	public String getPallects() {
		return pallects;
	}
	public void setPallects(String pallects) {
		this.pallects = pallects;
	}
	public String getTransseq() {
		return transseq;
	}
	public void setTransseq(String transseq) {
		this.transseq = transseq;
	}
	public String getBatchid() {
		return batchid;
	}
	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}
	public String getTransdate() {
		return transdate;
	}
	public void setTransdate(String transdate) {
		this.transdate = transdate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}
	public String getRecv() {
		return recv;
	}
	public void setRecv(String recv) {
		this.recv = recv;
	}
	public String getTransid() {
		return transid;
	}
	public void setTransid(String transid) {
		this.transid = transid;
	}
	public String getRowStart() {
		return rowStart;
	}
	public void setRowStart(String rowStart) {
		this.rowStart = rowStart;
	}
	public String getRowEnd() {
		return rowEnd;
	}
	public void setRowEnd(String rowEnd) {
		this.rowEnd = rowEnd;
	}
	public String getSortString() {
		return sortString;
	}
	public void setSortString(String sortString) {
		this.sortString = sortString;
	}
	
}
