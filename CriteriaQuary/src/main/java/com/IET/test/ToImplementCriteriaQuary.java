package com.IET.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.IET.beans.Product;

public class ToImplementCriteriaQuary {
	
	public static void main(String[] args) {
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	   Session sess=sf.openSession();
	   Transaction tr=sess.beginTransaction();
	   //HQL Quary fire
	   Criteria cr=sess.createCriteria(Product.class);
	   List<Product> plist=cr.list();
	   plist.forEach(System.out::println);
	   
	   Criterion cr1=Restrictions.gt("Price", 50.0f);
	   Criterion cr2=Restrictions.lt("Price", 1000);
	   Criteria cr3=sess.createCriteria(Product.class);
	   
	   LogicalExpression expr=Restrictions.or(cr1,cr1);
	   cr3.add(expr);
	   
	   List<Product> plist1=cr3.list();
//	   plist.forEach(System.out::println);
	    
	   tr.commit();
	   sess.close();
	   sf.close();
	}

}
