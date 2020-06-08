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

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userName = request.getParameter("name");
        String password = request.getParameter("password");
        try{
            ResultSet rs = DBConnection.getEntries(userName,password);
            boolean isSuccess = false;
            String email="";
            String id="";
            String date="";
            while(rs.next())
            {
                isSuccess=true;
                email=rs.getString("email");
                id=rs.getString("id");
                date=rs.getString("date");
            }
            DBConnection.closeStatement();
            DBConnection.closeConnection();
            if(isSuccess) {
                request.setAttribute("email",email);
                request.setAttribute("id",id);
                request.setAttribute("date",date);
                AlertMessages.loginSuccessfulMessage(response);
                RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
                rd.include(request, response);
            }
            else {
                AlertMessages.loginFailMassage(response);
                RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
                rd.include(request,response);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
