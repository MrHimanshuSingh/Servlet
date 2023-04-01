package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter("/sell.jsp")
public class SellLoginFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpSession session = ((HttpServletRequest) request).getSession();
		String user = (String) session.getAttribute("user");
		if(user == null) {
			PrintWriter out=response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('You are not logged in');");
			out.println("location='signIn.jsp';");
			out.println("</script>");
		}else {
			chain.doFilter(request, response);
		}
	}
}
