package user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import modal.Modal;

@WebServlet("/signin")
public class SignIn extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = req.getParameter("user");
		String pass = req.getParameter("pass");
		Modal modal = new Modal();
		modal.setEmail(user);
		if (modal.userValidate()) {
			modal.setPass(pass);
			if (modal.signIn()) {
				HttpSession session = req.getSession();
				session.setAttribute("user", user);
				RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
				dispatcher.forward(req, resp);
			} else {
//--------------invalid pass
				req.setAttribute("error", "Invalid User ID or Password");
				RequestDispatcher dispatcher = req.getRequestDispatcher("signIn.jsp");
				dispatcher.forward(req, resp);
			}
		} else {
//--------------not a existing user
			req.setAttribute("error", "Not Registered user Or please check user ID");
			RequestDispatcher dispatcher = req.getRequestDispatcher("signIn.jsp");
			dispatcher.forward(req, resp);
		}
	}
}
