package com.IET.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.IET.beans.Product;

public class ProductDaoImpl implements ProductDao {

	private static SessionFactory sf;
	
	static {
		sf=HibernateUtil.getMySessionFactory();
	}
	
	public void saveData(Product p) {
		// TODO Auto-generated method stub
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		sess.save(p);
		tr.commit();
		sess.close();
	}

	@Override
	public List<Product> DisplayAllProduct() {
		
		Session sess=sf.getCurrentSession();
		Transaction tr=sess.beginTransaction();
		
		Query q=sess.createQuery("from Product");
		List<Product> plist=q.list();
		tr.commit();
		sess.close();
		return plist;
	}

	@Override
	public Product FindById(int pid) {
		// TODO Auto-generated method stub
		
		Session sess=sf.getCurrentSession();
		Transaction tr=sess.beginTransaction();
		Product p=sess.get(Product.class, pid);
		tr.commit();
		sess.close();
		return p;
	}

	@Override
	public void closeMyConnection() {
	
		HibernateUtil.closeMySessionFactory();
	}

	@Override
	public boolean modifyById(int pid, String pname, String wname) {
		// TODO Auto-generated method stub
		
		
		Session sess=sf.getCurrentSession();
		Transaction tr=sess.beginTransaction();
		Product p=sess.get(Product.class, pid);
		if(p!=null) {
			p.setPname(pname);
			p.getWhouse().setWname(wname);
			
			sess.update(p);
			tr.commit();
			sess.close();
			return true;
		}
		tr.commit();
		sess.close();
		return false;
	}

	@Override
	public boolean removeById(int pid) {
		// TODO Auto-generated method stub
		
		Session sess=sf.getCurrentSession();
		Transaction tr=sess.beginTransaction();
		Product p=sess.get(Product.class, pid);
		if(p!=null) {
			sess.delete(p);
			tr.commit();
			sess.close();
			return true;
			
		}
		tr.commit();
		sess.close();
		return false;
	}

	@Override
	public List<Product> SortById() {
		// TODO Auto-generated method stub
		Session sess=sf.getCurrentSession();
		Transaction tr=sess.beginTransaction();
		//HQL Quary fire
		Query q=sess.createQuery("from product p order by pid desc");
		List<Product> plist=q.list();
		tr.commit();
		sess.close();
		return plist;
	}

}
