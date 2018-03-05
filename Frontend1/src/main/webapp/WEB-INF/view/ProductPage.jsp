<%@include file="/WEB-INF/view/Header.jsp" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h3 align="center">Product Page</h3>
<div class="container">
<div class="table-responsive">
<table align="center">
	<tr bgcolor="pink">
		<td colspan="3">Product Detail</td>	
	</tr>
	<tr>
<c:forEach items="${listProducts}" var="product">
	
		<td>
			<img src="<c:url value="/Resources/images/${product.productId}.jpg"/>" width="200" height="200"/>
		<br><br>
			<a href="<c:url value="/ProductDesc${product.productId}"/>">${product.productname}</a>
			<br>INR. ${product.price} /-
		</td>
	
</c:forEach>
	</tr>
</table>
</div>
</div>
<%@include file="/WEB-INF/view/Footer.jsp" %>
