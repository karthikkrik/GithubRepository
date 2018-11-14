package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.ProductBean;
import com.bo.ProductBo;
import com.vo.ProductVo;

public class ProductDao {

public List<ProductVo> getProductList(){
		
		List<ProductVo> productList = new ArrayList<ProductVo>();
Configuration configuration = new Configuration().configure();
		
		//	2.create session factory
		SessionFactory sessionFactory  = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction trans = null;
		try{
			trans =session.beginTransaction();
			Query query = session.createQuery("from ProductBo");
			productList = query.list();
			trans.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return productList;		
	}

	public void addProducts(ProductBean bean){
		
		Configuration config = new Configuration().configure();
		
//		2.create session factory
		SessionFactory sessionFactory  = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		ProductBo psub =new ProductBo();
		psub.setProdsubname(bean.getProdName());
		psub.setProdsubcost(bean.getProdCost());
		psub.setProdsubquantity(bean.getProdQuantity());
		
		
		session.beginTransaction();
		session.save(psub);
		session.getTransaction().commit();
		session.close();
	}
	public void deleteProducts(int prodId){
		Configuration configuration = new Configuration().configure();  		 
	       SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			ProductBo psub = (ProductBo)session.get(ProductBo.class, prodId);
			
			session.beginTransaction();
			session.delete(psub);
			session.getTransaction().commit();
			session.close();
			
		
	}
	
	public void updateProducts(ProductBo pb){
		Configuration configuration = new Configuration().configure();  		 
	       SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			ProductBo psub = (ProductBo)session.get(ProductBo.class,pb.getProdsubid());
			
			psub.setProdsubname(pb.getProdsubname());
			psub.setProdsubcost(pb.getProdsubcost());
			psub.setProdsubquantity(pb.getProdsubquantity());
			session.beginTransaction();
			session.save(psub);
			session.getTransaction().commit();
			session.close();		
	}
	

}
