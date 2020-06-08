package com.bl.demo.servlet;

import com.bl.demo.alertMessage.AlertMessages;
import com.bl.demo.dbConnection.DBConnection;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;

@WebServlet("/ForgotPasswordServlet")
public class ForgotPasswordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userName = request.getParameter("name");
        String email = request.getParameter("email");
        try{
            ResultSet rs = DBConnection.getEntriesForRecovery(userName,email);
            boolean isSuccess = false;
            while(rs.next())
            {
                isSuccess=true;
            }
            DBConnection.closeStatement();
            DBConnection.closeConnection();
            if(isSuccess) {
                AlertMessages.dbCredentialFound(response);
                RequestDispatcher rd=request.getRequestDispatcher("passwordRecovery.jsp");
                rd.include(request, response);
            }
            else {
                AlertMessages.dbCredentialNotFound(response);
                RequestDispatcher rd=request.getRequestDispatcher("forgotPassword.jsp");
                rd.include(request,response);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
