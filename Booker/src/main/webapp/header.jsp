<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="description" content="">
<meta name="author" content="">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Booker</title>

<link rel="shortcut icon" href="" type="image/x-icon">
<link rel="apple-touch-icon" href="">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<!-- Link to your css file -->
<link rel="stylesheet" href="css/style.css">
<style>
</style>
</head>

<body>

	<nav class="navbar navbar-expand-md navbar-dark fixed-top">
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarsExample01" aria-controls="navbarsExample01"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<h3>
			<a class="nav-item pl-5 text-white logo" href="index.jsp"><b><span
					class="text-danger">B</span><span class="text-success">oo</span><span
					class="text-primary">k</span><span class="text-info">e</span><span
					class="text-warning">r</span></b></a>
		</h3>
		<div class="collapse navbar-collapse justify-content-md-center"
			id="navbarsExample01">
			<ul class="navbar-nav">
				<li class="nav-item pr-3" id="nav"><a class="nav-link"
					href="sell.jsp"><strong class="text-white">Sell</strong></a></li>
				
					<li class="nav-item dropdown pr-3 pl-3" id="nav"><a
						id="dropdownMenu1" href="#" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false"
						class="nav-link dropdown-toggle"><strong class="text-white">Buy</strong></a>
						<ul aria-labelledby="dropdownMenu1"
							class="dropdown-menu border-0 shadow">

							<li class="dropdown-submenu"><a id="dropdownMenu2" href="#"
								role="button" data-toggle="dropdown" aria-haspopup="true"
								aria-expanded="false" class="dropdown-item dropdown-toggle">Engineering</a>
								<ul aria-labelledby="dropdownMenu2"
									class="dropdown-menu border-0 shadow">
									<!-- Level three dropdown-->
									<li class="dropdown-submenu"><a id="dropdownMenu3"
										href="#" role="button" data-toggle="dropdown"
										aria-haspopup="true" aria-expanded="false"
										class="dropdown-item dropdown-toggle">FE</a>
										<ul aria-labelledby="dropdownMenu3"
											class="dropdown-menu border-0 shadow">
											<li><a tabindex="-1" href="buy.jsp"
												class="dropdown-item">Semester I</a></li>
											<div class="dropdown-divider"></div>
											<li><a tabindex="-1" href="#" class="dropdown-item">Semester
													II</a></li>
										</ul></li>
									<div class="dropdown-divider"></div>
									<!--computer Eng-->
									<li class="dropdown-submenu"><a id="dropdownMenu3"
										href="#" role="button" data-toggle="dropdown"
										aria-haspopup="true" aria-expanded="false"
										class="dropdown-item dropdown-toggle">Computer Engineering</a>
										<ul aria-labelledby="dropdownMenu3"
											class="dropdown-menu border-0 shadow">
											<li><a tabindex="-1" href="#" class="dropdown-item">Semester
													III</a></li>
											<div class="dropdown-divider"></div>
											<li><a tabindex="-1" href="#" class="dropdown-item">Semester
													IV</a></li>
											<div class="dropdown-divider"></div>
											<li><a tabindex="-1" href="#" class="dropdown-item">Semester
													V</a></li>
											<div class="dropdown-divider"></div>
											<li><a tabindex="-1" href="#" class="dropdown-item">Semester
													VI</a></li>
											<div class="dropdown-divider"></div>
											<li><a tabindex="-1" href="#" class="dropdown-item">Semester
													VII</a></li>
											<div class="dropdown-divider"></div>
											<li><a tabindex="-1" href="#" class="dropdown-item">Semester
													VIII</a></li>
										</ul></li>
									<!--mechanicl eng-->
									<div class="dropdown-divider"></div>
									<li class="dropdown-submenu"><a id="dropdownMenu3"
										href="#" role="button" data-toggle="dropdown"
										aria-haspopup="true" aria-expanded="false"
										class="dropdown-item dropdown-toggle">Mechanical
											Engineering</a>
										<ul aria-labelledby="dropdownMenu3"
											class="dropdown-menu border-0 shadow">
											<li><a tabindex="-1" href="#" class="dropdown-item">Semester
													III</a></li>
											<li><a tabindex="-1" href="#" class="dropdown-item">Semester
													IV</a></li>
											<li><a tabindex="-1" href="#" class="dropdown-item">Semester
													V</a></li>
											<li><a tabindex="-1" href="#" class="dropdown-item">Semester
													VI</a></li>
											<li><a tabindex="-1" href="#" class="dropdown-item">Semester
													VII</a></li>
											<li><a tabindex="-1" href="#" class="dropdown-item">Semester
													VIII</a></li>
										</ul></li>
									<!-- End Level three -->
								</ul></li>
							<div class="dropdown-divider"></div>
							<li class="dropdown-submenu"><a id="dropdownMenu2" href="#"
								role="button" data-toggle="dropdown" aria-haspopup="true"
								aria-expanded="false" class="dropdown-item dropdown-toggle">Diploma</a>
								<ul aria-labelledby="dropdownMenu2"
									class="dropdown-menu border-0 shadow">
									<li><a tabindex="-1" href="#" class="dropdown-item">level
											2</a></li>

									<!-- Level three dropdown-->
									<li class="dropdown-submenu"><a id="dropdownMenu3"
										href="#" role="button" data-toggle="dropdown"
										aria-haspopup="true" aria-expanded="false"
										class="dropdown-item dropdown-toggle">level 2</a>
										<ul aria-labelledby="dropdownMenu3"
											class="dropdown-menu border-0 shadow">
											<li><a tabindex="-1" href="#" class="dropdown-item">3rd
													level</a></li>
											<li class="dropdown-submenu"><a id="dropdownMenu4"
												href="#" role="button" data-toggle="dropdown"
												aria-haspopup="true" aria-expanded="false"
												class="dropdown-item dropdown-toggle">level 3</a>
												<ul aria-labelledby="dropdownMenu4"
													class="dropdown-menu border-0 shadow">
													<li><a href="#" class="dropdown-item">4rd level</a></li>
													<li><a href="#" class="dropdown-item">4rd level</a></li>
												</ul></li>
										</ul></li>
									<!-- End Level three -->

									<li><a href="#" class="dropdown-item">level 2</a></li>
									<li><a href="#" class="dropdown-item">level 2</a></li>
								</ul></li>
							<!-- End Level two -->
						</ul></li>
				
				<li class="nav-item pl-3" id="nav1"><a class="nav-link"
					href="cart.jsp"><strong class="text-white">Cart(<small
							class="text-success">2</small>)
					</strong></a></li>

				<form action="search" method="get"  class="pl-5 pr-5">
					<div class="input-group pl-5 ">
						<input type="text" class="form-control"
							placeholder="Enter Keyword" name="searchkey">
						<div class="input-group-append">
							<button type="submit" class="input-group-text" id="basic-addon2">
								<span class="fas fa-search"></span>
							</button>
						</div>
					</div>
				</form>
				<div class="ml-5">
					<li class="nav-item ml-5">
						<%
						if (session.getAttribute("user") == null) {
						%> <a class="nav-link text-" href="signIn.jsp">SignIn</a>
					</li>
					<%
					} else {
					%>
					<div class="dropdown">
						<a type="button" class="dropdown-toggle" data-toggle="dropdown"><img
							alt=""
							src="https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_640.png"
							style="height: 35px; width: 35px; border-radius: 50%"></a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="#">My Account</a> <a
								class="dropdown-item" href="signout">Sign Out</a>
						</div>
					</div>
					<%
					}
					%>
				</div>
				<!--
                <li class="nav-item dropdown float-right">
                    <a class="nav-link dropdown-toggle" href="http://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown</a>
                    <div class="dropdown-menu" aria-labelledby="dropdown01">
                        <a class="dropdown-item" href="#">Action</a>
                        <a class="dropdown-item" href="#">Another action</a>
                        <a class="dropdown-item" href="#">Something else here</a>
                    </div>
                </li>
-->
			</ul>
		</div>
	</nav>