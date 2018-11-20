<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order details display</title>
</head>
<body>
<table border="1" cellpadding="2" cellspacing="2" align="center">
        <tr>
            <td height="20%" colspan="2">
            	<h1>Details of the Products</h1>
            </td>
        </tr>
        <tr>
            <td>
             <table border =1>
		<tr ><td>Product name</td><td>Product quantity</td><td>product cost</td></tr>
 		<logic:iterate id="stock" name="stocklist">
 		<tr>
 		
 		<td><bean:write name="stock" property="prodsubname"/></td>
 		<td><bean:write name="stock" property="prodsubquantity"/></td>
 		<td><bean:write name="stock" property="prodsubcost"/></td>
 		
 		<html:form action = "/Stockdelete.do?method=delete">
 		<html:hidden name="stock" property="prodsubid"/>	
 		<td><html:submit value = "delete"></html:submit></td>
 		 		
 		</html:form>
 		
 	
 	</tr>
 	</logic:iterate>
 	</table>
            
  
        <html:link action="/AddProductpage.do">Add Products</html:link>  
        <html:link action="/UpdatePage.do?method=updatePage">Update Products</html:link>
          
            </td>
        </tr>
      
    </table>


</body>
</html>