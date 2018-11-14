package com.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

import com.bo.ProductBo;
import com.dao.ProductDao;
import com.vo.ProductVo;

@ManagedBean
@SessionScoped
public class ProductBean {

	private String message;
	private Integer prodId;
	private String prodName;
	private Integer prodQuantity;
	private Integer prodCost;

	private List<ProductVo> productList;
	
	
	public List<ProductVo> getProductList() {
		return productList;
	}
	public void setProductList(List<ProductVo> productList) {
		this.productList = productList;
	}
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Integer getProdQuantity() {
		return prodQuantity;
	}
	public void setProdQuantity(Integer prodQuantity) {
		this.prodQuantity = prodQuantity;
	}
	public Integer getProdCost() {
		return prodCost;
	}
	public void setProdCost(Integer prodCost) {
		this.prodCost = prodCost;
	}
	@PostConstruct
	public void init(){
		ProductDao dao = new ProductDao();
		productList =dao.getProductList();
	}
	
	public List<ProductVo> getProducts(){
		
		ProductDao dao = new ProductDao();
		List<ProductVo> prod = dao.getProductList();
		return prod ;
	}
	
	public void saveProduct(){
		ProductDao dao = new ProductDao();
		dao.addProducts(this);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Product Added "));
//		FacesContext.getCurrentInstance().addMessage("red", new FacesMessage(FacesMessage.SEVERITY_ERROR,"product added","product added"));
		this.prodName="";
		this.prodQuantity=null;
		this.prodCost=null;
		productList = getProducts();
	}
	public void deleteProduct(int productID){
		ProductDao dao = new ProductDao();
		dao.deleteProducts(productID);
		FacesContext.getCurrentInstance().addMessage("red", new FacesMessage(FacesMessage.SEVERITY_ERROR,"Product deleted ","Product Deleted"));
		productList = getProducts();
	}	
		
	public void updateProduct(ProductBo pb){
		ProductDao dao = new ProductDao();
		dao.updateProducts(pb);
		FacesContext.getCurrentInstance().addMessage("green", new FacesMessage("Product Updated "));
		productList = getProducts();
	}

	public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
	public void resete(){
		setProdName("");
		setProdQuantity(null);
		setProdCost(null);
	}
	
}
