package test1;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserRegister<String> extends HttpServlet  {
	
	@WebServlet("/UserRegister")
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        
        res.getWriter().println("<h2>Kayıt Detayları:</h2>");
        res.getWriter().println("<p>Ad: " + name + "</p>");
        res.getWriter().println("<p>Soyad: " + surname + "</p>");
        res.getWriter().println("<p>Eposta: " + email + "</p>");
        res.getWriter().println("<p>Şifre: " + maskPassword(password) + "</p>");
	}
    private String maskPassword(String password) {
        StringBuilder maskedPassword = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            maskedPassword.append("*");
        }
        return maskedPassword.toString();
    }
}