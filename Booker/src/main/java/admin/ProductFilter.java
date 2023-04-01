package admin;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

@WebFilter("/addPro")
@MultipartConfig
public class ProductFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String subject = request.getParameter("subject");
		String edition = request.getParameter("edition");
		String price = request.getParameter("price");
		String university = request.getParameter("university");
		String stream = request.getParameter("stream");
		String branch = request.getParameter("branch");
		String semester = request.getParameter("semester");
		String publication = request.getParameter("publication");
		HttpServletRequest req = (HttpServletRequest) request;
		Part img1 = req.getPart("img1");
		Part img2 = req.getPart("img2");
		Part img3 = req.getPart("img3");
		boolean emSubject = false;
		boolean emEdition = false;
		boolean emPrice = false;
		boolean emUniversity = false;
		boolean emStream = false;
		boolean emBranch = false;
		boolean emSemester = false;
		boolean emPublication = false;
		boolean emImg1 = false;
		boolean emImg2 = false;
		boolean emImg3 = false;

		if (subject == null || subject.trim().length() == 0) {
			req.setAttribute("emSub", "Empty Field");
		} else {
			emSubject = true;
			req.setAttribute("subject", subject);
		}
		if (edition == null || edition.trim().length() == 0) {
			req.setAttribute("emEdi", "Empty Field");
		} else {
			emEdition = true;
			req.setAttribute("edition", edition);
		}
		if (price == null || price.trim().length() == 0) {
			req.setAttribute("emPri", "Empty Field");
		} else {
			emPrice = true;
			req.setAttribute("price", price);
		}
		if (university == null || university.trim().length() == 0) {
			req.setAttribute("emUni", "Empty Field");
		} else {
			emUniversity = true;
			req.setAttribute("university", university);
		}
		if (stream == null || stream.trim().length() == 0) {
			req.setAttribute("emStr", "Empty Field");
		} else {
			emStream = true;
			req.setAttribute("stream", stream);
		}
		if (branch == null || branch.trim().length() == 0) {
			req.setAttribute("emBra", "Empty Field");
		} else {
			emBranch = true;
			req.setAttribute("branch", branch);
		}
		if (semester == null || semester.trim().length() == 0) {
			req.setAttribute("emSem", "Empty Field");
		} else {
			emSemester = true;
			req.setAttribute("semester", semester);
		}
		if (publication == null || publication.trim().length() == 0) {
			req.setAttribute("emPub", "Empty Field");
		} else {
			emPublication = true;
			req.setAttribute("publication", publication);
		}
		if (img1.getSize() == 0) {
			req.setAttribute("emImg1", "Empty Field");
		} else
			emImg1 = true;
		if (img2.getSize() == 0) {
			req.setAttribute("emImg2", "Empty Field");
		} else
			emImg2 = true;

		if (img3.getSize() == 0) {
			req.setAttribute("emImg3", "Empty Field");
		} else
			emImg3 = true;

		if (emSubject && emEdition && emPrice && emUniversity && emStream && emBranch && emSemester && emPublication
				&& emImg1 && emImg2 && emImg3) {
			chain.doFilter(request, response);
		} else {
			req.getRequestDispatcher("adminIndex.jsp").forward(request, response);
		}
	}

}
