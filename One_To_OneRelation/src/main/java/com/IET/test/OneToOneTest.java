package com.IET.test;
import com.IET.bean.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneTest {
	
	public static void main(String[] args) {
		
	
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
    
	 Address ad=new Address(4995,"S.B Road","pune");
	 Student s1=new Student(114,"pankaj",ad);
	 Session sess=sf.openSession();
	 Transaction tr=sess.beginTransaction();
	 sess.save(ad);
	 sess.save(s1);
	 tr.commit();
	 sess.close();
	 sf.close();
	 
	 System.out.println(s1);
	 
	} 
}
