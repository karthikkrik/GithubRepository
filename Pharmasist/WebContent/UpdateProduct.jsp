<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
input[type=text] {
    width: 25%;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box;
    border: 1px solid black;
    border-radius: 4px;
}
/* Set a style for all buttons */
input[type=submit],input[type=reset] {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
    
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update table display</title>
</head>
<body>
 <!-- ---------------------------------------------------------- -->
 <div style="color:red">
	<html:errors/>
</div>

			<logic:iterate id="upstock" name="updatelist">
			
			<html:form action = "/UpdatePage.do?method=update">
			
			<html:hidden  name = "upstock" property="prodsubid"/>
		
		<div>
	<div>
		<bean:message key="product.label.name" />
	</div> 
 	<div>
	<html:text name = "upstock" property="prodsubname" size="40" maxlength="40">product name</html:text>
	</div>
</div>
<div>
	<div>
		<bean:message key="product.label.quantity" />
	</div> 
    <div>
	<html:text name = "upstock" property="prodsubquantity" size="20" maxlength="20">product quantity</html:text>
	</div>
</div>
<div>
	<div>
		 <bean:message key="product.label.cost" />
	</div> 
    <div>
	<html:text name ="upstock" property="prodsubcost" size="30" maxlength="20">product cost</html:text>
	</div>
</div>

<div style="padding:16px">
	<div style="float:left;padding-right:8px;">
		<html:submit>
             Update product
        </html:submit>
        
	</div>
	<%-- <div style="float:left;padding-right:8px;">
	<html:reset>
         Reset Columns
     </html:reset> 
	</div> --%>
	</div>
	<br>
	<br>
	<br>	
		</html:form>
      </logic:iterate> 
    	        
</body>
</html>