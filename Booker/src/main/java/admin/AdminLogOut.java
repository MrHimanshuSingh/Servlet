package admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/adLogout")
public class AdminLogOut extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String admin = (String)session.getAttribute("admin");
		if(admin != null) {
			session.invalidate();
			req.getRequestDispatcher("adminSignIn.jsp").forward(req, resp);
		}
	}
}
