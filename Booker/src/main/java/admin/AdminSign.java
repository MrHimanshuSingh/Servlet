package admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modal.Modal;
import modal.Modal2;

@WebServlet("/adLogin")
public class AdminSign extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String adUser = req.getParameter("user");
		String adPass = req.getParameter("pass");
		Modal m = new Modal();
		m.setAdminUser(adUser);
		m.setAdminPass(adPass);
		if(m.adminLogin()) {
			HttpSession session = req.getSession();
			session.setAttribute("admin", adUser);
			req.getRequestDispatcher("adminIndex.jsp").forward(req, resp);
		}else {
			req.setAttribute("error","Wrong Cerdentials");
			req.getRequestDispatcher("adminSignIn.jsp").forward(req, resp);
		}
	}

}
