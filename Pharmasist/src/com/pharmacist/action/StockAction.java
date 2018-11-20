package com.pharmacist.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pharmacist.bean.Customerorder;
import com.pharmacist.bean.ProductSub;
import com.pharmacist.form.StockDeleteForm;
import com.pharmacist.form.StockUpdateForm;

public class StockAction extends DispatchAction		{
	
	
	public ActionForward fetch(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session  = factory.openSession();	
		
		HttpSession sess = request.getSession();
		
		Query q = session.createQuery("from ProductSub");
		q.setFetchSize(10);
		 List<Customerorder> list =q.list();
		
		 sess.setAttribute("stocklist", list);
		
		session.close();
		
		
		return mapping.findForward("success");
	}
	
	public ActionForward delete(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			
		StockDeleteForm sf = (StockDeleteForm) form;
		 Configuration configuration = new Configuration().configure();  		 
	       SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			ProductSub psub = (ProductSub)session.get(ProductSub.class	,sf.getProdsubid());
			
			session.beginTransaction();
			session.delete(psub);
			session.getTransaction().commit();
			session.close();
		
		return mapping.findForward("deletesuccess");
	}
	
	public ActionForward updatePage(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session  = factory.openSession();	
		
		HttpSession sess = request.getSession();
		
		Query q = session.createQuery("from ProductSub");
		
		 List<Customerorder> list =q.list();
		
		 sess.setAttribute("updatelist", list);
		
		session.close();
		
		
		return mapping.findForward("updatepage");
	}
	
	public ActionForward update(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			
		StockUpdateForm sf = (StockUpdateForm) form;
		 Configuration configuration = new Configuration().configure();  		 
	       SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			ProductSub psub = (ProductSub)session.get(ProductSub.class	,sf.getProdsubid());
			psub.setProdsubname(sf.getProdsubname());
			psub.setProdsubquantity(sf.getProdsubquantity());
			psub.setProdsubcost(sf.getProdsubcost());
			session.beginTransaction();
			session.save(psub);
			session.getTransaction().commit();
			session.close();
		
		return mapping.findForward("updatesuccess");
	}
	
}
