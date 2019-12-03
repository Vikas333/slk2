package com.slk.duo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.slk.util.Customer;
import com.slk.util.DbUtil;


public class CustomerDaoImp implements Customerdao {
       Connection connection =null;
       
       public CustomerDaoImp()
       {
    	   connection=DbUtil.getConnection();       }


		

		@Override
		public void addCustomer(Customer customer,HttpServletRequest request) throws SQLException {
			// TODO Auto-generated method stub
			String id=request.getParameter("id");
			String name=request.getParameter("name");
			String address=request.getParameter("address");
			PreparedStatement st=(PreparedStatement) connection.prepareStatement("insert into customer values(?,?,?)");
			st.setString(1, id);
			st.setString(2, name);
			st.setString(3, address);
			int i=st.executeUpdate();
			System.out.println(i+"records inserted");
			st.close();
			
		}
		List<Customer>customer=new ArrayList<Customer>();
		
		
		
	

		

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> getallCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getcustomerbyId(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
