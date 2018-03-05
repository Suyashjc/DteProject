<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="/WEB-INF/view/Header.jsp" %>
<div class="container">
 
  <form>
    <div class="form-group">
      <label for="usr">Name:</label>
      <input type="text" class="form-control" id="usr">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>
<br>
<%@include file="/WEB-INF/view/Footer.jsp" %>
