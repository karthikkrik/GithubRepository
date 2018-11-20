package com.pharmacist.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pharmacist.bean.ProductSub;
import com.pharmacist.form.StockAddForm;

public class AddProductAction extends Action  {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
HttpSession ses  = request.getSession(true);
		
		Configuration config = new Configuration().configure();
		
//		2.crate session factory
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		StockAddForm stockform = (StockAddForm)form;
		
		
		ProductSub psub = new ProductSub();
		
		BeanUtils.copyProperties(psub, stockform);
		
		session.beginTransaction();
		session.save(psub);
		session.getTransaction().commit();
		session.close();
		
		
		
		return mapping.findForward("add");
	}
	
}
