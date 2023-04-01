<%@page import="modal.Modal"%>
<%@page import="java.util.ArrayList"%>
<%@ include file="header.jsp"%>
<div class="container pt-5">
	<div class="row pt-3">
	<%
	if(request.getAttribute("notFound") == null){
	ArrayList<Modal> al = (ArrayList<Modal>) session.getAttribute("searchList");
	for(Modal m:al){
	%>
		<div class="col-lg-3 col-md-3 col-sm-4 col-xs-6">
			<div class="card mb-3">
				<img class="card-img-top" src="images/products/<%=m.getImgName1() %>"
					alt="Card image cap">
				<div class="card-body">
					<h4 class="card-title">
						<a href="product.jsp?proId=<%= m.getProId()%>"><%=m.getSubject()%></a>
					</h4>
					<h6>
						Price : <i><%=m.getPrice() %></i>
					</h6>
					<h6>
						Seller : <i><%=m.getImgName1() %></i>
					</h6>
				</div>
			</div>
		</div>
	<%}}else{%>
	</div>
	<h3 class="text-center text-danger pt-5">${notFound}</h3>
	<%} %>
</div>
<%@ include file="footer.jsp"%>