package com.kgisl.strnsestock.demostock;

import java.util.List;

import javax.persistence.*;

@Entity
public class Portfolio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userid;

	@Column
	private String cat;

	@Column
	private String symbol;

@Column
private Nsestock nsestock;

	// @ManyToOne(cascade = CascadeType.ALL)
	// @JoinColumn(name = "portfolioidId", updatable = false, insertable = true)
	

	public Portfolio() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Long getaId() {
		return userid;
	}

	public void setaId(Long userid) {
		this.userid = userid;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Nsestock getNsestock() {
		return nsestock;
	}

	
	public void setNsestock(Nsestock nsestock) {
		this.nsestock = nsestock;
	}
	}
