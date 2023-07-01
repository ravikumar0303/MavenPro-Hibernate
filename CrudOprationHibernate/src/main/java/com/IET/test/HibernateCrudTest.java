package com.IET.test;

import java.util.*;

import com.IET.beans.Product;
import com.IET.service.ProductService;
import com.IET.service.ProductServiceImpl;

public class HibernateCrudTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		ProductService ps = new ProductServiceImpl();

		do {
			System.out.println(
					" <1>. Add new product\n <2>. Delete by id\n <3>. Display all\n <4>. Display by Id\n <5>. Sort by Id\n <6>. Update by Id\n <7>. exit\n choice: ");
			choice = sc.nextInt();
			switch (choice) {

			case 1:
				ps.AddNewProduct();
				break;

			case 2:
				System.out.println("enter product id");
				int pid=sc.nextInt();
				boolean status=ps.deleteById(pid);
				if(status) {
					System.out.println("deleted successfully");
				}
				else {
					System.out.println("not found");
				}
				
				break;
			case 3:
                    List<Product> plist=ps.getAllProduct();
                   plist.forEach(System.out::println);
				break;
			case 4:
				System.out.println("enter product id");
				pid=sc.nextInt();
				Product p=ps.getById(pid);
				if(p!=null) {
					System.out.println(p);
				}
				else {
					System.out.println("not found");
				}
				
				break;
			case 5:
				
				plist=ps.SortById();
				plist.forEach(System.out::println);
				break;
			case 6:
				System.out.println("enter product id");
				pid=sc.nextInt();
				System.out.println("enter productname");
				String pname=sc.next();
				System.out.println("enter warehousename");
				String wname=sc.next();
				 status=ps.updateById(pid,pname,wname);
				if(status) {
					System.out.println("modified successfuly");
				}
				else {
					System.out.println("not found");
				}
				break;
			case 7:
                ps.closeSessionFactory();
				System.out.println("Thnak`s For visiting....");
				break;
			default:

				System.out.println("Wrong choice !!!");

			}

		} while (choice != 7);

	}

}
