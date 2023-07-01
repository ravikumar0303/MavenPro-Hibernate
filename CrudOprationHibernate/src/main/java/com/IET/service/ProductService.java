package com.IET.service;

import java.util.List;

import com.IET.beans.Product;

public interface ProductService {

	void AddNewProduct();

	List<Product> getAllProduct();

	Product getById(int pid);

	void closeSessionFactory();

	boolean updateById(int pid, String pname, String wname);

	boolean deleteById(int pid);

	List<Product> SortById();

}
