<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int principalamount;
int roi;
int rate;
int time;
double totalamount;

double result;


%>


<%
principalamount=Integer.parseInt(request.getParameter("epamount"));
roi=Integer.parseInt(request.getParameter("erate"));
time=Integer.parseInt(request.getParameter("etime"));
//totalamount=principalamount(1+(roi*(time/12)));
rate=roi/(12*100);
result= (principalamount*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
%>



<h1>EMI per month is: <%=result %> 
</h1>

</body>
</html>