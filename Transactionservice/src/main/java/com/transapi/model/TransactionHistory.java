package com.transapi.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="transaction")
public class TransactionHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transid;
	
	@Column(name="fromaccount")
	private long fromaccount;
	
	@Column(name="toaccount")
	private long toaccount;
	
	@Column(name="fmobilenumber")
	private long frmmobilenumber;
	
	@Column(name="tomobilenumber")
	private long tomobilenumber;
	
	@Column(name="description")
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
