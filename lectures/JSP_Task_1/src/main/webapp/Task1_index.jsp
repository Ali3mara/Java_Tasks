<%@ page import="com.eraasoft.jsp.task1.Person,java.util.List,java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%!                                             
    String combine(int id, String name) {
        return id + ": " + name;
    }
%>

<%
List<Person> people = new ArrayList<>();

	people.add(new Person(1, "Ali"));
	people.add(new Person(2, "Ahmed"));
	people.add(new Person(3, "Hussien"));
	people.add(new Person(4, "Osama"));
	people.add(new Person(5, "Ibrahim"));
%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Name and ID List</title>

</head>

<body>
	<% for (Person person : people) { %>
        <h3><%= combine(person.getId(), person.getName()) %></h3> 
    <% } %>
</body>
</html>