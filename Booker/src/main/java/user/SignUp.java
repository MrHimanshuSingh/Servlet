package user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modal.Modal;

@WebServlet("/register")
public class SignUp extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String surname = req.getParameter("surname");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String pass = req.getParameter("pass");
		Modal modal = new Modal();

		if (modal.userValidate()) {
			/*Exist User email ID*/
			req.setAttribute("existUser", "This Email has been taken");
			req.getRequestDispatcher("signUp.jsp").forward(req, resp);
		} else {
			modal.setName(name);
			modal.setSurname(surname);
			modal.setEmail(email);
			modal.setPhone(phone);
			modal.setPass(pass);
			if (modal.signUp()) {
				req.getRequestDispatcher("signIn.jsp").forward(req, resp);
			} else {
				req.setAttribute("nSignUp", "Something went wrong please try again");
				req.getRequestDispatcher("signUp.jsp").forward(req, resp);
			}
		}
	}
}
