package com.IET.test;

import com.IET.beans.*;

import java.util.List;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyTest {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tr = sess.beginTransaction();
		Project p1 = new Project(12, "proj1", 4, null);
		Project p2 = new Project(13, "proj2", 3, null);
		Project p3 = new Project(14, "proj3", 4, null);

		List<Project> pr1 = new ArrayList();
		pr1.add(p1);
		pr1.add(p2);

		List<Project> pr2 = new ArrayList();
		pr2.add(p1);
		pr2.add(p3);

		Employee e1 = new Employee(1, "Rajan", pr1);
		Employee e2 = new Employee(2, "Revati", pr1);
		Employee e3 = new Employee(3, "Anil", pr2);

		List<Employee> slt = new ArrayList();
		slt.add(e1);
		slt.add(e2);

		List<Employee> slt2 = new ArrayList();
		slt2.add(e3);

		p1.setElist(slt);
		p2.setElist(slt2);
		
		sess.save(e1);
		sess.save(e2);
		sess.save(e3);
		
		sess.save(p1);
		sess.save(p2);
		sess.save(p3);
		
		tr.commit();
		sess.close();
		sf.close();
		

	}

}
