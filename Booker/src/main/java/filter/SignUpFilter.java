package filter;

import javax.servlet.Filter;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import java.io.IOException;

@WebFilter("/register")
public class SignUpFilter implements Filter {

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		boolean emName = false;
		boolean emSurn = false;
		boolean emEmail = false;
		boolean emPhone = false;
		boolean emPass = false;
		boolean emConpass = false;
		boolean match = false;
		String name = req.getParameter("name");
		String surname = req.getParameter("surname");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String pass = req.getParameter("pass");
		String conpass = req.getParameter("conpass");

		if (name == null || name.trim() == "") {
			req.setAttribute("emName", "Enter Name");
			req.setAttribute("nameclr", "border: solid 1px red;");
		} else {
			emName = true;
			req.setAttribute("name", name);
		}
		if (surname == null || surname.trim() == "") {
			req.setAttribute("emSurn", "Enter Surname");
			req.setAttribute("surnclr", "border: solid 1px red;");
		} else {
			emSurn = true;
			req.setAttribute("surname", surname);
		}

		if (email == null || email.trim() == "") {
			req.setAttribute("emEmail", "Enter Email");
			req.setAttribute("emailclr", "border: solid 1px red;");
		} else {
			emEmail = true;
			req.setAttribute("email", email);
		}

		if (phone == null || phone.trim() == "") {
			req.setAttribute("emPhone", "Enter phone");
			req.setAttribute("phoneclr", "border: solid 1px red;");
		} else {
			emPhone = true;
			req.setAttribute("phone", phone);
		}

		if (pass == null || pass.trim() == "") {
			req.setAttribute("emPass", "Enter Password");
			req.setAttribute("passclr", "border: solid 1px red;");
		} else
			emPass = true;

		if (conpass == null || conpass.trim() == "") {
			req.setAttribute("emConpass", "Enter Password");
			req.setAttribute("conpassclr", "border: solid 1px red;");
		} else
			emConpass = true;

		if (!emPass && !emConpass && !pass.trim().equals(conpass.trim())) {
			req.setAttribute("NMatch", "Password Not Match");
			req.setAttribute("passclr", "border: solid 1px red;");
			req.setAttribute("conpassclr", "border: solid 1px red;");
		} else
			match = true;

		if (emName && emSurn && emEmail && emPhone && emPass && emConpass && match)
			chain.doFilter(req, resp);
		else {
			req.getRequestDispatcher("signUp.jsp").forward(req, resp);
		}
	}

}
