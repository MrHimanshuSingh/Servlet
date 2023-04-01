package admin;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/adLogin")
public class AdminSignFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String adUser = request.getParameter("user");
		String adPass = request.getParameter("pass");
		boolean emAdUser = false;
		boolean emAdPass = false;
		if (adUser == null || adUser.trim() == "") {
			request.setAttribute("emUser", "empty field");
		} else {
			emAdUser = true;
		}
		if (adPass == null || adPass.trim() == "") {
			request.setAttribute("emPass", "empty field");
		} else {
			emAdPass = true;
		}
		if (emAdUser && emAdPass) {
			chain.doFilter(request, response);
		} else {
			request.getRequestDispatcher("adminSignIn.jsp").forward(request, response);
		}

	}

}
