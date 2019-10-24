<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.error{
	color:red;
}
</style>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">

	First Name: (*) 
	<form:input path="firstName" />
	<form:errors path="firstName" cssClass="error" />
		<br>
		<br>
	Last Name:	(*)
	<form:input path="lastName" />
	<form:errors path="lastName" cssClass="error" />
		<br>
		<br>
	Age:
	<form:input path="age" />
	<form:errors path="age" cssClass="error" />
		<br>
		<br>
	Pincode:
	<form:input path="pinCode" />
	<form:errors path="pinCode" cssClass="error" />
		<br>
		<br>	
	Country: 	
	<form:select path="country">
			<form:options items="${theCountryOptions}" />
		</form:select>

		<%-- Populating countries list from the java class 
	<form:select path="country">
		<form:options items="${student.countries}" />
	</form:select> --%>

		<%-- Hardcoding the countries list with static values 
	<form:select path="country"
	<form:option value="India" label="India" />
	<form:option value="Brazil" label="Brazil" />
	<form:option value="Kenya" label="Kenya" /> 
	</form:select>	--%>
		<br>
		<br>

		<form:radiobutton path="favLanguages" value="Java" />Java
	<form:radiobutton path="favLanguages" value=".NET" />.NET
	<form:radiobutton path="favLanguages" value="Python" />Python
	
	<br>
		<br>

		<form:checkbox path="operatingSystems" value="Linux" />Linux
	<form:checkbox path="operatingSystems" value="Windows" />Windows
	<form:checkbox path="operatingSystems" value="Unix" />Unix
	
	<br>
		<br>

		<input type="submit" value="Submit">
	</form:form>

</body>
</html>