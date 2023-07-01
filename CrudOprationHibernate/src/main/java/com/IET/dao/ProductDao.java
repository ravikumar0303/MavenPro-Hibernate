package com.IET.dao;

import java.util.List;

import com.IET.beans.Product;

public interface ProductDao {

	void saveData(Product p);

	List<Product> DisplayAllProduct();

	Product FindById(int pid);

	void closeMyConnection();

	boolean modifyById(int pid, String pname, String wname);

	boolean removeById(int pid);

	List<Product> SortById();

}
