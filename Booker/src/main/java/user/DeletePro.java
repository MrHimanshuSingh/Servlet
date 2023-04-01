package user;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modal.Modal;

@WebServlet("/delete")
public class DeletePro extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String proId = req.getParameter("proId");
		Modal m = new Modal();
		m.setProId(proId);

		if (m.deletePro()) {
//			String applicationPath = getServletContext().getRealPath("");

			req.setAttribute("DSucc", "Deleted Successfully");
			req.getRequestDispatcher("sell.jsp").forward(req, resp);
		} else {
			req.setAttribute("DError", "Something went Wrong");
			req.getRequestDispatcher("sell.jsp").forward(req, resp);
		}
	}
}
