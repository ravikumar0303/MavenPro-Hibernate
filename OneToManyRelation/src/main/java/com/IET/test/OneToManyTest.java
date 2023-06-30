package com.IET.test;

import com.IET.beans.*;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyTest {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();

		Transaction tr = sess.beginTransaction();

		/*
		 * for(int i=0;i<=5;i++)
		 * 
		 * System.out.println("Enter your addrID: "); int aid=s.nextInt();
		 * System.out.println("Enter your Street..: "); String str=s.next();
		 * System.out.println("Enter your City: "); String ct=s.next();
		 */
//		Address r1 = new Address(aid,str,ct);

		Address r1 = new Address(57, "Gokhalenagar", "pune");
		Address r2 = new Address(117, "S.B Road", "pune");
		Set<Address> aset = new HashSet<Address>();
		aset.add(r1);
		aset.add(r2);

		User jer = new User(40, "jermi", aset);
//		User ravi=new User(57,"ravi",aset);
//		r2.setRavi(ravi);
		r1.setRavi(jer);
		r2.setRavi(jer);

		sess.save(jer);
		sess.save(r1);
		sess.save(r2);
		tr.commit();
		sess.close();
		sf.close();
		System.out.println(jer);

	}

}
