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
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<!-- Link to your css file -->
<link rel="stylesheet" href="">

	<style>
body {
	background-color: darkslategray;
}

.login-form {
	width: 340px;
	margin: 50px auto;
	font-size: 15px;
	/*            padding-top: auto;*/
	/*            padding-bottom: auto*/
}

.login-form form {
	margin-bottom: 15px;
	background: #f7f7f7;
	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	padding: 30px;
}

.login-form h2 {
	margin: 0 0 15px;
}

.form-control, .btn {
	min-height: 38px;
	border-radius: 2px;
}

.btn {
	font-size: 15px;
	font-weight: bold;
}
</style>
</head>

<body>
	<!-- Start coding here -->
	<div class="login-form">
		<form action="adLogin" method="post">
			<h2 class="text-center">Log in</h2>
			<h5 class="text-center text-danger">${requestScope.nLogin}</h5	>
			<h5 class="text-center text-danger">${requestScope.error}</h5	>
			<div class="form-group">
				<strong class="text-danger"> ${requestScope.emUser}</strong>
				<input type="text" class="form-control" placeholder="Username"
					 name="user">
			</div>
			<div class="form-group">
			<strong class="text-danger"> ${requestScope.emPass}</strong>
				<input type="password" class="form-control" placeholder="Password"
					 name="pass">
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-primary btn-block">Log
					in</button>
			</div>
			<div class="clearfix">
				<!--                <label class="float-left form-check-label"><input type="checkbox"> Remember me</label>-->
				<!--                <a href="#" class="float-right">Forgot Password?</a>-->
			</div>
		</form>
	</div>


	<!-- Coding End -->

	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>