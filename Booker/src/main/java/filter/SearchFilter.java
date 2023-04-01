package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/search")
public class SearchFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String key = request.getParameter("searchkey");
		if (key == null || key.trim() == "")
			request.getRequestDispatcher("index.jsp").forward(request, response);
		else
			chain.doFilter(request, response);
	}
}
