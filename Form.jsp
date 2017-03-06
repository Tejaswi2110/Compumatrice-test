<%@ taglib uri="/struts-tags" prefix="t" %>
<html>
<head>
<title>
Registration Page
</title>
<center><h2>Registration Form</h2>
</center>
</head>
<body>
<t:form action="register">
<center>
<t:textfield name="uname" label="User Name"></t:textfield>
<t:password name="pwd" label="Password"></t:password>
<t:password name="cpwd" label="Confirm Password"></t:password>
<t:textfield name="fname" label="First Name"></t:textfield>
<t:textfield name="lname" label="Last Name"></t:textfield>
<t:textfield name="email" label="Email"></t:textfield>
<t:textfield name="phno" label="Phone No"></t:textfield>
<t:textfield name="Loc" label="Location"></t:textfield>
<t:submit value="Save" a href="Info.jsp"></t:submit>
<t:submit value="Reset" a href="Form.jsp"></t:submit>
</center>
</t:form>
</body>
</html>