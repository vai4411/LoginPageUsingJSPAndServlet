package com.bl.demo.servlet;

import com.bl.demo.alertMessage.AlertMessages;
import com.bl.demo.dbConnection.DBConnection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.regex.Pattern;

import static java.lang.String.valueOf;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    public Pattern namePattern;
    public Pattern passwordPattern;

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String userName = request.getParameter("name");
        String actualPassword = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        String email = request.getParameter("email");
        namePattern = namePattern.compile("^[A-Z][A-Za-z]{2,}");
        passwordPattern = passwordPattern.compile("(?=.*[A-Z].*)(?=.*[0-9].*)([a-zA-Z0-9]{4,}[!@#$%^&*()_+][a-zA-Z0-9]{3,})");
        if (namePattern.matches(valueOf(namePattern), userName) && passwordPattern.matches(valueOf(passwordPattern), actualPassword)
                && actualPassword.equals(confirmPassword) && email != null) {
            int n = 0;
            try {
                n = DBConnection.setEntries(userName, actualPassword, email);
                DBConnection.closeConnection();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if (n > 0) {
                AlertMessages.registerSuccessfulMessage(response);
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.include(request, response);
            } else {
                AlertMessages.databaseErrorMassage(response);
                RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
                rd.include(request, response);
            }
        } else {
            AlertMessages.registrationFailMassage(response);
            RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
            rd.include(request, response);
        }
    }
}
