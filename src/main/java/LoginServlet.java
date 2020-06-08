import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Pattern;

import static java.lang.String.valueOf;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    public Pattern namePattern;
    public Pattern passwordPattern;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userName = request.getParameter("name");
        String password = request.getParameter("password");
        namePattern = namePattern.compile("^[A-Z][A-Za-z]{2,}");
        passwordPattern = passwordPattern.compile("(?=.*[A-Z].*)(?=.*[0-9].*)([a-zA-Z0-9]{4,}[!@#$%^&*()_+][a-zA-Z0-9]{3,})");
        if (namePattern.matches(valueOf(namePattern),userName) && passwordPattern.matches(valueOf(passwordPattern),password) &&
                userName.equals("Vaibhav") && password.equals("Vaibhav@123"))
            response.sendRedirect("welcome.jsp");
    }
}
