 <%@page import="java.util.ArrayList"%>
<%@page import="modal.Modal"%>
<%@ include file="header.jsp" %>
 <div class="container pt-5">
        <!--        <div class="row">-->
       	<form action="userAddPro" method="post" enctype="multipart/form-data">
			<div class="form-row pt-3">
				<div class="form-group col-md-6">
					<label for="inputEmail1">Subject</label><strong class="text-danger">${requestScope.emSub }</strong>
					<input type="text" class="form-control" id="inputEmail1"
						placeholder="Book's Name" name="subject" value="${requestScope.subject}">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword2">Edition</label><strong
						class="text-danger">${requestScope.emEdi }</strong> <input
						type="text" class="form-control" id="inputPassword2"
						placeholder="Book's Edition" name="edition" value="${requestScope.edition}">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword3">Price</label><strong
						class="text-danger">${requestScope.emPri }</strong> <input
						type="number" class="form-control" id="inputPassword3"
						placeholder="Price of Book" name="price" value="${requestScope.price}">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">University</label><strong
						class="text-danger"> ${requestScope.emUni }</strong><input
						type="text" class="form-control" id="inputPassword4"
						placeholder="Univercity Name" name="university" value="${requestScope.university}">
				</div>
				<div class="form-group col-md-6">
					<label for="input4">Stream</label><strong
						class="text-danger"> ${requestScope.emStr }</strong><input
						type="text" class="form-control" id="input4"
						placeholder="Stream Name" name="stream" value="${requestScope.stream}">
				</div>
				<div class="form-group col-md-6">
					<label for="exampleFormControlSelect2">Branch</label><strong
						class="text-danger">${requestScope.emBra }</strong> <select
						class="form-control" id="exampleFormControlSelect2" name="branch">
						<option value="Computer">Computer</option>
						<option value="Mechanical">Mechanical</option>
						<option value="Civil">Civil</option>
						<option selected disabled="disabled">Select</option>
					</select>
				</div>
				<div class="form-group col-md-6">
					<label for="exampleFormControlSelect1">Semester</label><strong
						class="text-danger">${requestScope.emSem }</strong> <select
						class="form-control" id="exampleFormControlSelect1"
						name="semester">
						<option disabled="disabled" selected="selected">Select</option>
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
					<label for="inputPassword5">Publication</label><strong
						class="text-danger">${requestScope.emPub }</strong> <input
						type="text" class="form-control" id="inputPassword5"
						placeholder="Publication" name="publication" value="${requestScope.publication}">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword6">Choose Image 1</label><strong
						class="text-danger">${requestScope.emImg1}</strong> <input
						type="file" class="form-control" id="inputPassword6" name="img1">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword7">Choose Image 2</label><strong
						class="text-danger">${requestScope.emImg2}</strong> <input
						type="file" class="form-control" id="inputPassword7" name="img2">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword8">Choose Image 3</label><strong
						class="text-danger"> ${requestScope.emImg3}</strong><input
						type="file" class="form-control" id="inputPassword8" name="img3">
				</div>
			</div>
			<button type="submit" class="btn btn-success">Submit</button>
		</form>
		
<% Modal m1 = new Modal();
	m1.setSellerEmail((String)session.getAttribute("user"));
	ArrayList<Modal> al = (ArrayList<Modal>)m1.sellList();
	%>
	

        <div class="table-responsive mt-5">
        <h5 class="text-center text-danger">${requestScope.DError }</h5>
        <h5 class="text-center text-success">${requestScope.DSucc }</h5>
        
            <table class="table">
                <thead>
                    <tr>
                        <th class="text-center" scope="col">sir</th>
                        <th class="text-center" scope="col">Subject</th>
                        <th class="text-center" scope="col">Edition</th>
                        <th class="text-center" scope="col">Price</th>
                        <th class="text-center" scope="col">Stream</th>
                        <th class="text-center" scope="col">University</th>
                        <th class="text-center" scope="col">Branch</th>
                        <th class="text-center" scope="col">Sem/Year</th>
                        <th class="text-center" scope="col">Publication</th>
                        <th class="text-center" scope="col">Date</th>
                        <th class="text-center" scope="col">Edit</th>
                        <th class="text-center"scope="col">Delete</th>
                    </tr>
                </thead>
                <%if(al.size() != 0){
                	int a=1;
                	for(Modal m: al){
                		
                	%>
                <tbody>
                    <tr>
                        <th scope="row"><%= a %></th>
                        <td class="text-center"><%=m.getSubject() %></td>
                        <td class="text-center"><%=m.getEdition() %></td>
                        <td class="text-center"><%=m.getPrice() %></td>
                        <td class="text-center"><%=m.getStream() %></td>
                        <td class="text-center"><%=m.getUnivercity() %></td>
                        <td class="text-center"><%=m.getBranch() %></td>
                        <td class="text-center"><%=m.getSemester() %></td>
                        <td class="text-center"><%=m.getPublication() %></td>
                        <td class="text-center">NA</td>
                        <td class="text-center"><a class="btn btn-info" href="edit?proId=<%=m.getProId()%>" role="button">Edit</a></td>
                        <td class="text-center"><a class="btn btn-danger" href="delete?proId=<%=m.getProId()%>" role="button">Remove</a></td>
                    </tr>
                </tbody>
                    <%a++;}}else{ %>
                    <tbody>
                    <tr>
                    	<td class="text-center" colspan="12"><strong class="text-danger">Not Added Anything!!!!</strong></td>
                    	</tr>
                    	</tbody>
                    	<%} %>
            </table>
        </div>
        <!--        </div>-->
    </div>
    <%@ include file= "footer.jsp" %>
  