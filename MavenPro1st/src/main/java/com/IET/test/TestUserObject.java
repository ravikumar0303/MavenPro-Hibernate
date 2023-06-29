package com.IET.test;

import com.IET.beans.MyUser;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUserObject {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your uid..");
		int id=s.nextInt();
		System.out.println("Enter your name..");
		String nm=s.next();
		System.out.println("Enter your email..");
		String em=s.next();	
		MyUser r1=new MyUser(id,nm,em);
		//MyUser r1=new MyUser(117,"Ravi","ravi@gmail.com");

		SessionFactory sf =new  Configuration().configure().buildSessionFactory();
		
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		
		sess.save(r1);
		tr.commit();
		sess.close();
		
		System.out.println(r1);
		
	/*	Session sess1=sf.openSession();
//		sf.getCurrentSession();
		Transaction tr1=sess1.beginTransaction();
		MyUser r2=sess1.get(MyUser.class,117);
		tr1.commit();
		System.out.println(r2);
		sess1.close();
		sf.close();*/
		
	}

}
