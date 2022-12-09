<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <body bgcolor="pink">
<h1>User Details</h1>  
<table border="2">  
<tr>
    <th>Id</th>
    <th>Name</th>
    <th>Email</th>
    <th>Password</th>
     <th>Address</th>
     <td>Edit</td>
     <td>Delete</td>
   </tr>  
   <c:forEach var="emp" items="${emps}">   
   <tr>  
   <td>${emp.id}</td>  
   <td>${emp.name}</td> 
   <td>${emp.email}</td>  
   <td>${emp.password}</td>  
    <td>${emp.address}</td> 
    <td><a href="/update/${emp.id}">Update</a></td>
    <td><a href="/delete/${emp.id}">Delete</a></td>
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
  <a href="/">Insert New Employee</a>
   </body>
