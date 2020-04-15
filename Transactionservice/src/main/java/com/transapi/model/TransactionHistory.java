package com.transapi.model;

import java.util.Date;

public class TransactionHistory {

	
	private long transid;
	
	private long fromaccount;
	
	private long toaccount;
	
	private long frmmobilenumber;
	
	private long tomobilenumber;
	
	private String comment;

	private Date transdate;
	
	public Date getTransdate() {
		return transdate;
	}

	public void setTransdate(Date transdate) {
		this.transdate = transdate;
	}

	

	public long getTransid() {
		return transid;
	}

	public void setTransid(long transid) {
		this.transid = transid;
	}

	public long getFromaccount() {
		return fromaccount;
	}

	public void setFromaccount(long fromaccount) {
		this.fromaccount = fromaccount;
	}

	public long getToaccount() {
		return toaccount;
	}

	public void setToaccount(long toaccount) {
		this.toaccount = toaccount;
	}

	public long getFrmmobilenumber() {
		return frmmobilenumber;
	}

	public void setFrmmobilenumber(long frmmobilenumber) {
		this.frmmobilenumber = frmmobilenumber;
	}

	public long getTomobilenumber() {
		return tomobilenumber;
	}

	public void setTomobilenumber(long tomobilenumber) {
		this.tomobilenumber = tomobilenumber;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
