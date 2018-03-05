<%@include file="/WEB-INF/view/Header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h3 align="center">Product Page</h3>
<div class="container">
<div class="table-responsive">
<table>
	<tr bgcolor="pink">
		<td rowspan="6">
		<img src="<c:url value="/Resources/images/${ProductInfo.productId}.jpg"/>" width="200" height="200"/>
		</td>
		<td>Product ID</td>
		<td>${ProductInfo.productId}</td>
	</tr>
	<tr bgcolor="pink">
		<td>Price</td>
		<td>${ProductInfo.price}</td>
	</tr>
	<tr bgcolor="pink">
		<td>Product Name</td>
		<td>${ProductInfo.productname}</td>
	</tr>
	<tr bgcolor="pink">
		<td>Category ID</td>
		<td>${categoryName}</td>
	</tr>
	<tr bgcolor="pink">
		<td>Supplier ID</td>
		<td>${ProductInfo.supplierId}</td>
	</tr>
	<tr bgcolor="pink">
		<td>Product Description</td>
		<td>${ProductInfo.prodDesc}</td>
	</tr>
	<tr>
		<td>Quantity</td>
		<td>
		<select name="quantity">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
		</select>
		</td>
	</tr>
	<tr>
	<td><a href="<c:url value="/UpdateProduct${ProductInfo.productId}"/>">Update</a></td>
	</tr>
	<tr>
	<td><a href="<c:url value="/DeleteProduct${ProductInfo.productId}"/>">Delete</a></td>
	</tr>
</table>
</div>
</div>
<%@include file="/WEB-INF/view/Footer.jsp" %>