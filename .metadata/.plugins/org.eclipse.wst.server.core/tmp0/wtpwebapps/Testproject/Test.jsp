<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%=2+4 %>
<h1>Not Getting</h1>
<%=new java.util.Date() %>

<h1>My java app</h1>
<%
int a=10,b=20,c;
c=a+b;
%>
<%=c %>

<h2> Jsp declaration</h2>
<%!

int cube(int n)
{
return n*n*n;
}
%>


<%= "cube of 4 is:  "+cube(4) %>

<%-- <h1>customer details</h1>
<%

Customer c1=new Customer();
c1.setCustId(101);
c1.setName("vi");
c1.setAddress("hyg");

%>
<%= "id is: "+c1.getCustId()%>
<%@ page import ="com.slk.beam.Customer" %> --%>


 
</body>
</html>