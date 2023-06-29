package com.IET.test;

import com.IET.bean.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Pro_Warehouse {
	public static void main(String[] args) {
		
	
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
   
	Warehouse wh=new Warehouse(40,"IETActs","pune");
	Product p=new Product(12,"table",wh);
	Session sess=sf.openSession();
	Transaction tr=sess.beginTransaction();
	
	  sess.save(p);
	  tr.commit();
	  sess.close();
	  
	  System.out.println(p);

	}
	
}
