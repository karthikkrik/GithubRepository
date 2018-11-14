package com.bo;

import java.io.Serializable;

public class ProductBo implements Serializable {
	private int prodsubid;
	
	private String prodsubname;
	private int prodsubquantity;
	private int prodsubcost;
	
	
	public void setProdsubid(int prodsubid) {
		this.prodsubid = prodsubid;
	}
	public int getProdsubid() {
		return prodsubid;
	}
	public String getProdsubname() {
		return prodsubname;
	}
	public void setProdsubname(String prodsubname) {
		this.prodsubname = prodsubname;
	}
	public int getProdsubquantity() {
		return prodsubquantity;
	}
	public void setProdsubquantity(int prodsubquantity) {
		this.prodsubquantity = prodsubquantity;
	}
	public int getProdsubcost() {
		return prodsubcost;
	}
	public void setProdsubcost(int prodsubcost) {
		this.prodsubcost = prodsubcost;
	}
	
	
	
}
