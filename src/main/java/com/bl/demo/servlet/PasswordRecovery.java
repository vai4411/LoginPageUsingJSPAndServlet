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

@WebServlet("/passwordRecovery")
public class PasswordRecovery extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String userName = request.getParameter("name");
        String actualPassword = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        String email = request.getParameter("email");
        if(actualPassword.equals(confirmPassword)) {
            int n = 0;
            try {
                n = DBConnection.updateEntries(userName, actualPassword, email);
                DBConnection.closeConnection();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if (n > 0) {
                AlertMessages.passwordChangedSuccessfulMassage(response);
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.include(request, response);
            } else {
                AlertMessages.databaseErrorMassage(response);
                RequestDispatcher rd = request.getRequestDispatcher("passwordRecovery.jsp");
                rd.include(request, response);
            }
        } else {
            AlertMessages.passwordChangedErrorMassage(response);
            RequestDispatcher rd = request.getRequestDispatcher("passwordRecovery.jsp");
            rd.include(request, response);
        }
    }
}
