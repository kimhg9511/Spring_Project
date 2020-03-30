package com.kimhg.portfolio.domain;

import java.util.Date;

public class WalletVO {
	private Integer trNo;
	private String trname;
	private double buy;
	private double sell;
	private double benefit;
	private Date trdate;

	public Integer getTrNo() {
		return trNo;
	}

	public void setTrNo(Integer trNo) {
		this.trNo = trNo;
	}

	public String getTrname() {
		return trname;
	}

	public void setTrname(String trname) {
		this.trname = trname;
	}

	public double getBuy() {
		return buy;
	}

	public void setBuy(double buy) {
		this.buy = buy;
	}

	public double getSell() {
		return sell;
	}

	public void setSell(double sell) {
		this.sell = sell;
	}

	public double getBenefit() {
		return benefit;
	}

	public void setBenefit(double benefit) {
		this.benefit = benefit;
	}

	public Date getTrdate() {
		return trdate;
	}

	public void setTrdate(Date trdate) {
		this.trdate = trdate;
	}

	public double getTotalmoney() {
		return totalmoney;
	}

	public void setTotalmoney(double totalmoney) {
		this.totalmoney = totalmoney;
	}

	private double totalmoney;

}
