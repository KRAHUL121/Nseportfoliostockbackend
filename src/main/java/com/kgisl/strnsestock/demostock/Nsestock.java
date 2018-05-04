package com.kgisl.strnsestock.demostock;

import javax.persistence.*;

@Entity
public class Nsestock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int previousClose;
	@Column
	private int ltP;
	@Column
	private int ptsC;

	@Column
	private String symbol;

	public Nsestock() {
		super();
	}

	

	public int getLtP() {
		return ltP;
	}

	public void setLtP(int ltP) {
		this.ltP = ltP;
	}

	public int getPtsC() {
		return ptsC;
	}

	public void setPsC(int ptsC) {
		this.ptsC = ptsC;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getPreviousClose() {
		return previousClose;
	}

	public void setPreviousClose(int previousClose) {
		this.previousClose = previousClose;
	}

	// public void strnsestock(Portfolio portfolio) {
	// 	this.portfolio = portfolio;}
	}
