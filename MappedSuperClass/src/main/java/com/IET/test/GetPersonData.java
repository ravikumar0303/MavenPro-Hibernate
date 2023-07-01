package com.IET.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.IET.beans.Employee;
import com.IET.beans.Person;

public class GetPersonData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
         
		Session sess=sf.getCurrentSession();
		Transaction tr=sess.beginTransaction();
		Person p=sess.get(Employee.class,12);
		
		System.out.print(p);
		
		tr.commit();
		sess.close();
		sf.close();
		
		
		
		
	}

}
