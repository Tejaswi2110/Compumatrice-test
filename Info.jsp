<%@ taglib uri="/struts-tags" prefix="t" %>
<html>
<head>
<title>Information page</title>
<center>
<h3>Welcome....</h3>
</center>
</head>
<body>
<center>
<t:form>
<table>
<tr>

<th>First Name<td><t:textfield value="fname"></t:textfield></td></th>
<th>Last Name<td><t:textfield value="lname"></t:textfield></td></th>
<th>Email<td><t:textfield value="email"></t:textfield></td></th>
<th>Phone No<td><t:textfield value="phno"></t:textfield></td></th>
<th>Location<td><t:textfield value="loc"></t:textfield></td></th>
<t:a href="Form.jsp"></t:a>
<t:a href="Form.jsp"></t:a>
</tr>
</table>
</t:form>
</center>
</body>
</html>