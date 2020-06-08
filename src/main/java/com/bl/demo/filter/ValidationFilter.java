package com.bl.demo.filter;

import com.bl.demo.alertMessage.AlertMessages;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class ValidationFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Inside Filter");
        HttpServletRequest req=(HttpServletRequest) servletRequest;
        HttpServletResponse res=(HttpServletResponse) servletResponse;
        String path=req.getRequestURI();
        String userName=req.getParameter("name");
        String actualPassword = req.getParameter("password");
        if(path.contains("com.bl.com.bl.demo.servlet.LoginServlet"))
        {
            if(userName !=null  && userName.trim().length()<3 &&
                    actualPassword !=null && actualPassword.trim().length()<8)
            {
                AlertMessages.loginFailMassage(res);
            }
        }
            filterChain.doFilter(req, res);
    }

    @Override
    public void destroy() {
    }
}
