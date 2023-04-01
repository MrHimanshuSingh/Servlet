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

<title>booker</title>

<link rel="shortcut icon" href="" type="image/x-icon">
<link rel="apple-touch-icon" href="">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<!-- Link to your css file -->
<link rel="stylesheet" href="">

</head>

<body>
	<!-- Start coding here -->
	
	<div class="container">
		<!--        <div class="row">-->
		<form action="" method="post" enctype="multipart/form-data">
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail1">Subject</label> <input type="text"
						class="form-control" id="inputEmail1" placeholder="Book's Name">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword2">Edition</label> <input type="text"
						class="form-control" id="inputPassword2"
						placeholder="Book's Edition">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword3">Price</label> <input type="number"
						class="form-control" id="inputPassword3"
						placeholder="Price of Book">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">Univercity</label> <input type="text"
						class="form-control" id="inputPassword4"
						placeholder="Univercity Name">
				</div>
				<div class="form-group col-md-6">
					<label for="exampleFormControlSelect2">Semester</label> <select
						class="form-control" id="exampleFormControlSelect2">
						<option value="Computer">Computer</option>
						<option value="Mechanical">Mechanical</option>
						<option value="Civil">Civil</option>
					</select>
				</div>
				<div class="form-group col-md-6">
					<label for="exampleFormControlSelect1">Semester</label> <select
						class="form-control" id="exampleFormControlSelect1">
						<option value="I">Semester I</option>
						<option value="II">Semester II</option>
						<option value="III">Semester III</option>
						<option value="VI">Semester IV</option>
						<option value="V">Semester V</option>
						<option value="VI">Semester VI</option>
						<option value="VII">Semester VII</option>
						<option value="VIII">Semester VIII</option>

					</select>
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword5">Publication</label> <input type="text"
						class="form-control" id="inputPassword5" placeholder="Publication">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword6">Choose Image 1</label> <input
						type="file" class="form-control" id="inputPassword6"
						placeholder="">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword7">Choose Image 2</label> <input
						type="file" class="form-control" id="inputPassword7"
						placeholder="">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword8">Choose Image 3</label> <input
						type="file" class="form-control" id="inputPassword8"
						placeholder="">
				</div>
			</div>
			<button type="submit" class="btn btn-success">Submit</button>
		</form>
		<!--        </div>-->
	</div>
	<footer>
	<div>
	<a href="adLogOut">Logout</a>
	</div>
	
	</footer>

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
