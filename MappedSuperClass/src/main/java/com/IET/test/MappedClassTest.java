package com.IET.test;

import com.IET.beans.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappedClassTest {
	
	public static void main(String[] args) {
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		
		Employee e=new Employee(12,"savita ma`am","pune","Placement Co-ordinator","Trainer");
		Student s=new Student(117,"Ravi","Uttar Pradesh","CDAC",78);
		 sess.save(e);
		 sess.save(s);
		tr.commit();
		sess.close();
		sf.close();
	}

}
