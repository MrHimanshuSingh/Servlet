package user;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import modal.Modal;

@WebServlet("/userAddPro")
@MultipartConfig
public class UserAddProduct extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String subject = req.getParameter("subject");
		String edition = req.getParameter("edition");
		String price = req.getParameter("price");
		String university = req.getParameter("university");
		String stream = req.getParameter("stream");
		String branch = req.getParameter("branch");
		String semester = req.getParameter("semester");
		String publication = req.getParameter("publication");
		String sellerEmail = (String) req.getSession().getAttribute("user");
		Random r = new Random();
		String name = String.valueOf(r.nextInt());
		String email[] = sellerEmail.split("@");
		String proId = email[0] + name;
//		String applicationPath = getServletContext().getRealPath("");
		String applicationPath2 = "D:\\Workspace\\servlet\\Booker";
		String imgPath = "\\src\\main\\webapp\\images\\products";

		Part img1 = req.getPart("img1");
		String fileName1 = String.valueOf(r.nextInt()) + ".jpg";
		String savePath1 = applicationPath2 + File.separator + imgPath + File.separator + fileName1;
		img1.write(savePath1 + File.separator);

		Part img2 = req.getPart("img2");
		String fileName2 = String.valueOf(r.nextInt()) + ".jpg";
		String savePath2 = applicationPath2 + File.separator + imgPath + File.separator + fileName2;
		img2.write(savePath2 + File.separator);

		Part img3 = req.getPart("img3");
		String fileName3 = String.valueOf(r.nextInt()) + ".jpg";
		String savePath3 = applicationPath2 + File.separator + imgPath + File.separator + fileName3;
		img3.write(savePath3 + File.separator);

		Modal m = new Modal();
		m.setProId(proId);
		m.setSubject(subject);
		m.setEdition(edition);
		m.setPrice(price);
		m.setUnivercity(university);
		m.setBranch(branch);
		m.setSemester(semester);
		m.setPublication(publication);
		m.setImgName1(fileName1);
		m.setImgName2(fileName2);
		m.setImgName3(fileName3);
		m.setSellerEmail(sellerEmail);
		m.setStream(stream);

		if (m.sellBook()) {
//				req.setAttribute("success", "Added Successfully!!!");
//				req.getRequestDispatcher("sell.jsp").forward(req, resp);
//				resp.sendRedirect("adminIndex.jsp");
			PrintWriter out = resp.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Added Succussfully');");
			out.println("location='sell.jsp';");
			out.println("</script>");
		} else {
			req.setAttribute("nsuccess", "Something went Wrong");
			req.getRequestDispatcher("sell.jsp").forward(req, resp);
		}

	}
}
