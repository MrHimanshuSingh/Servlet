import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/img")
@MultipartConfig
public class ImgHandler extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		System.out.println(name);
		Part part = req.getPart("img");
		String applicationPath = getServletContext().getRealPath("");
		String applicationPath2 = "D:\\Workspace\\servlet\\ImgHandler";
		String imgPath = "\\src\\main\\webapp\\images";
		Random rd = new Random();
		String fileName = String.valueOf(rd.nextInt()) + ".jpg";
		String savePath = applicationPath2 + File.separator + imgPath + File.separator + fileName;
		part.write(savePath + File.separator);
		System.out.println(applicationPath);
	}
}
