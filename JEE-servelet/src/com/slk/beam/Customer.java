package com.slk.beam;

public class Customer {
   private int CustId;
   private String name;
   private String address;
public int getCustId() {
	return CustId;
}
public void setCustId(int custId) {
	CustId = custId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
/*<h1>customer details</h1>
<%

Customer c1=new Customer();
c1.setCustId(101);
c1.setName("vi");
c1.setAddress("hyg");

%>
<%= "id is: "+c1.getCustId()%>
<%@ page import ="com.slk.beam.Customer" %>*/
}
