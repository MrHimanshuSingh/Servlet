package user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modal.Modal;

@WebServlet("/search")
public class Search extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String key = req.getParameter("searchkey");
		Modal m = new Modal();
		m.setSearchKey(key);
		List<Modal> al = m.search();
		if(al== null) {
			req.setAttribute("notFound", "Not Found!!!!");
			req.getRequestDispatcher("buy.jsp").forward(req, resp);
		}else {
		HttpSession session = req.getSession();
		session.setAttribute("searchList", al);
		req.getRequestDispatcher("buy.jsp").forward(req, resp);
		}
	}
}
