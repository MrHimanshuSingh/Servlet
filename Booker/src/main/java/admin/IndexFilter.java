package admin;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
//import javax.servlet.annotation.WebServlet;

//@WebServlet("")
public class IndexFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		String admin = (String) session.getAttribute("admin");
		if (admin != null) {
			chain.doFilter(request, response);
		} else {
			req.setAttribute("nLogin", "Not Login");
			req.getRequestDispatcher("adminSignIn.jsp").forward(request, response);
		}
	}
}
