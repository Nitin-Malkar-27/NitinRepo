<%@Taglib uri="https://java.sum.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<c:choose>
  <c:when test="${!empty empList}">
    <h1 style="color:red;text-align:center">Employees Report</h1>
    
    <h2 style="color:red;text-align:center">${resuletMsg}</h2>
    
    <table border="1" align="center" bgcolor="cyan">
      <tr style="color:red"><th>empno</th><th>emp name</th><th>Job</th><th>salary</th><th>deptno</th><th>oprations</th></tr>
      <c:forEach var="emp" items="${empList}">
        <tr style="color:blue">
         <td>${emp.empno }</td>
         <td>${emp.ename }</td>
         <td>${emp.job }</td>
         <td>${emp.sal }</td>
         <td>${emp.deptno }</td>
         <td><a herf="emp_edit?no=${emp.empno }"><img src="images/edit.jfif" width="30px" height="30px"></a>
         <td><a herf="emp_delete?no=${emp.empno }"><img src="images/delete.jpg" width="30px" height="30px"></a></td>
         
       </tr>
       
      </c:forEach>     
    </table>
  </c:when>
  <c:otherwise>
     <h1 style="color:red;trxt-align:center">Employee not found</h1>
  </c:otherwise>
  <center>
    <a herf="emp_data"><img src="images/add.webp" width="40px" heigth="50px">Add Employee</a> &nbsp;&nbsp;&nbsp;
    <a herf="./"><img src="images/home.avif" width="40px" heigth="50px">Home</a>
  </center> 
</c:choose>