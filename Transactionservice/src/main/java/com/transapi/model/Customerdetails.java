package com.transapi.model;

import java.util.List;

/**
 * @author veeru
 *
 */

public class Customerdetails {

	private long cid;
	

	private String cname;
	
	
	private String mobileno;
	
	
	private List<BankAccounts> baccounts;

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public List<BankAccounts> getBaccounts() {
		return baccounts;
	}

	public void setBaccounts(List<BankAccounts> baccounts) {
		this.baccounts = baccounts;
	}
	
	
	
}
