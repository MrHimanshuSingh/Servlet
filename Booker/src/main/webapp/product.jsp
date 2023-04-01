<%@page import="modal.Modal"%>
<%@ include file="header.jsp"%>
<div class="container pt-3">
<% String proId  = request.getParameter("proId");
	Modal m1 = new Modal();
	m1.setProId(proId);
	Modal m2 = m1.getProDetail(); 
	
%>
	<div class="row">
		<div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
			<div id="carousel" class="carousel slide m-5" data-ride="carousel">
				<ol class="carousel-indicators">
					<li data-target="#carousel" data-slide-to="0" class="active"></li>
					<li data-target="#carousel" data-slide-to="1"></li>
					<li data-target="#carousel" data-slide-to="2"></li>
				</ol>
				<div class="carousel-inner">
					<div class="carousel-item ci active">
						<img class="d-block w-100 img-fluid"
							src="images/products/<%=m2.getImgName1() %>" alt="First slide <%= m2.getImgName1() %>">

					</div>
					<div class="carousel-item ci">
						<img class="d-block w-100 img-fluid"
							src="images/products/<%= m2.getImgName2() %>" alt="Second slide <%= m2.getImgName2() %>">

					</div>
					<div class="carousel-item ci">
						<img class="d-block w-100 img-fluid"
							src="images/products/<%= m2.getImgName3() %>" alt="Third slide <%= m2.getImgName3() %>">

					</div>
				</div>
				<a class="carousel-control-prev" href="#carousel" role="button"
					data-slide="prev"> <span class="carousel-control-prev-icon"
					aria-hidden="true"></span> <span class="sr-only">Previous</span>
				</a> <a class="carousel-control-next" href="#carousel" role="button"
					data-slide="next"> <span class="carousel-control-next-icon"
					aria-hidden="true"></span> <span class="sr-only">Next</span>
				</a>
			</div>
		</div>
		<div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
			<div class="m-5">
				<h1><%=m2.getSubject() %></h1>
				<h5>
					Price: <i><%=m2.getPrice() %>&nbsp; &#8377;</i>
				</h5>
				<h5>
					Branch: <i><%=m2.getBranch() %></i>
				</h5>
				<h5>
					Publication: <i><%=m2.getPublication() %></i>
				</h5>
				<h5>
					Edition: <i><%=m2.getEdition() %></i>
				</h5>
				<h5>
					Stream: <i><%=m2.getStream() %></i>
				</h5>
				<a class="btn btn-info float-left" href="cart?proId=<%=m2.getProId() %>" role="button">Add to
					Cart</a> <a class="btn btn-success float-right" href="buyNow?proId=<%=m2.getProId() %>" role="button">Buy
					Now <span class="fas fa-angle-right"></span>
				</a>
			</div>
		</div>
	</div>
</div>
<%@ include file="footer.jsp"%>