package com.pharmacist.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class StockAddForm  extends ActionForm{

	private int prodsubid;
	private String prodsubname;
	private int prodsubquantity;
	private int prodsubcost;
	
	
	public int getProdsubid() {
		return prodsubid;
	}
	public void setProdsubid(int prodsubid) {
		this.prodsubid = prodsubid;
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
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		  ActionErrors errors = new ActionErrors();
		  
		  if (prodsubname.equals(" ") || prodsubname.length() < 4) {
		      errors.add("prodsubname", new ActionMessage("product.err.name.required"));
		      // TODO: add 'error.name.required' key to your resources
		  }    
		  else if (prodsubquantity == 0 || prodsubquantity<1) {
		      errors.add("prodsubquantity", new ActionMessage("product.err.quantity.required"));
		      // TODO: add 'error.name.required' key to your resources
		  }
		  else if (prodsubcost < 1 || prodsubcost ==0 ) {
		  errors.add("prodsubcost", new ActionMessage("product.err.cost.required"));
		  }
		
		  return errors;
		}

}
