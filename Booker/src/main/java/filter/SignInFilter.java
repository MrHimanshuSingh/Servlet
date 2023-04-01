package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

import modal.Modal;

@WebFilter("/signin")
public class SignInFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		boolean emUser = false;
		boolean emPass = false;
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");

		if (user == null || user.trim().equals("")) {
			request.setAttribute("emUser", "Enter UserID");
			request.setAttribute("userclr", "border: solid 2px red;");
		} else {
			emUser = true;
			request.setAttribute("user", user);
		}

		if (pass == null || pass.trim().equals("")) {
			request.setAttribute("emPass", "Enter Password");
			request.setAttribute("passclr", "border: solid 2px red;");
		} else
			emPass = true;

		if (emUser && emPass)
			chain.doFilter(request, response);
		else
			request.getRequestDispatcher("signIn.jsp").forward(request, response);
	}
}
