package com.IET.service;

import com.IET.dao.ProductDao;
import com.IET.dao.ProductDaoImpl;
import com.IET.beans.*;
import java.util.*;

public class ProductServiceImpl implements ProductService {

	private ProductDao pdao;

	public ProductServiceImpl() {
		super();
		this.pdao = new ProductDaoImpl();
	}

	public void AddNewProduct() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enter pname");
		String pname=sc.next();
		System.out.println("enter wid");
		int wid=sc.nextInt();
		System.out.println("enter wname");
		String wname=sc.next();
		System.out.println("enter warehouse location");
		String wloc=sc.next();
		Warehouse w=new Warehouse(wid, wname, wloc);
		Product p=new Product(pid,pname,w);
		pdao.saveData(p);
		
		
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return pdao.DisplayAllProduct();
	}

	@Override
	public Product getById(int pid) {
		// TODO Auto-generated method stub
		return pdao.FindById(pid);
	}

	@Override
	public void closeSessionFactory() {
		// TODO Auto-generated method stub
		pdao.closeMyConnection();
	}

	@Override
	public boolean updateById(int pid, String pname, String wname) {
		// TODO Auto-generated method stub
		return pdao.modifyById(pid,pname,wname);
	}

	@Override
	public boolean deleteById(int pid) {
		// TODO Auto-generated method stub
		return pdao.removeById(pid);
	}

	@Override
	public List<Product> SortById() {
		// TODO Auto-generated method stub
		return pdao.SortById();
	}

}
