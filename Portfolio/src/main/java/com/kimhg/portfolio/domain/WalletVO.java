package com.kimhg.portfolio.domain;

import java.util.Date;

public class WalletVO {
	private Integer trno;
	private String name;
	private Double buy;
	private Double sell;
	private Double benefit;
	private Date trdate;
	private Double totalmoney;
	
	public Integer getTrno() {
		return trno;
	}
	public void setTrno(Integer trno) {
		this.trno = trno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBuy() {
		return buy;
	}
	public void setBuy(Double buy) {
		this.buy = buy;
	}
	public Double getSell() {
		return sell;
	}
	public void setSell(Double sell) {
		this.sell = sell;
	}
	public Double getBenefit() {
		return benefit;
	}
	public void setBenefit(Double benefit) {
		this.benefit = benefit;
	}
	public Date getTrdate() {
		return trdate;
	}
	public void setTrdate(Date trdate) {
		this.trdate = trdate;
	}
	public Double getTotalmoney() {
		return totalmoney;
	}
	public void setTotalmoney(Double totalmoney) {
		this.totalmoney = totalmoney;
	}
	@Override
	public String toString() {
		return "WalletVO [trno=" + trno + ", name=" + name + ", buy=" + buy + ", sell=" + sell + ", benefit=" + benefit
				+ ", trdate=" + trdate + ", totalmoney=" + totalmoney + "]";
	}	
}
