package com.kgisl.strnsestock.demostock;



import javax.persistence.*;



import java.util.List;
@Entity
public class Portfolio{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column
	String cat;
	
	@Column
	String index;
  @Column
	 String symbol;
	 




/**
 * @return the id
 */
public Long getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(Long id) {
	this.id = id;
}
	public String getSymbol() {
		return symbol;
	  }
	 
	  public void setSymbol(String symbol) {
		this.symbol = symbol;
	  }	
	 
public String getCat() {
return cat;
}

 public void setCat(String cat) {
   this.cat = cat;
 }

/**
 * @return the index
 */
public String getIndex() {
	return index;
}
/**
 * @param index the index to set
 */
public void setIndex(String index) {
	this.index = index;
}
//  public List<Portfolio> getPortfolio() {
// 	return portfolio;
// }
// public void setPortfolio(List<Portfolio> portfolio) {
// 	this.portfolio = portfolio;
// }

public Portfolio() {
	super();}

	}