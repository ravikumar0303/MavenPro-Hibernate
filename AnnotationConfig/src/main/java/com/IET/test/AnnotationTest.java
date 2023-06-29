package com.IET.test;

import com.IET.bean.*;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AnnotationTest {
	
	public static void main(String[] args) {
		SessionFactory  fs=new Configuration().configure().buildSessionFactory();
		
		Session sess=fs.openSession();
		Transaction tr=sess.beginTransaction();
		//for student input Information
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter PRN no...");
		int pr=sc.nextInt();
		System.out.println("Enter your User Name..");
		String un =sc.next();
		System.out.println("Enter your User FirstName..");
		String fn =sc.next();
		System.out.println("Enter your User LastName..");
		String ln =sc.next();
		System.out.println("Enter your Mobile number..");
		String mn =sc.next();
		System.out.println("Enter your User Email..");
		String em =sc.next();
		
		Student s1=new Student(pr,un,fn,ln,mn,em);
	
		sess.save(s1);
		tr.commit();
		sess.close();
		fs.close();           
		
		System.out.println(s1);
		
		
	///////////////////////////////////////////////////////////////
		
	/*	Session sess=fs.openSession();
		Transaction tr=sess.beginTransaction();
		System.out.println("before");
		
//		Student u1=sess.load(Student.class,117);
		
		Student u1=sess.get(Student.class,117);
		System.out.println("after");
		System.out.println("prn: "+u1.getPrn());
		System.out.println("uname: "+u1.getUname());
		tr.commit();
		sess.close();
		fs.close();
		
		*/
		
		
		
		
	}
	
	

}
