package com.slk.duo;



import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.slk.util.Customer;
//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;


	public interface Customerdao {
	            
	           void updateCustomer(Customer customer);
	            void deleteCustomer(Customer customer);
	            
	            List<Customer> getallCustomers();
	            Customer getcustomerbyId(long id);
	            void addCustomer(Customer customer,HttpServletRequest request)throws SQLException;
	            
	            
	            
	            
	          
	            
	}


