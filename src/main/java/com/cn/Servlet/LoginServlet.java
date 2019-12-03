package com.cn.Servlet;

import com.cn.Service.Service1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/LoginServlet")
public class LoginServlet {
    /*public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        HttpSession session=request.getSession();
        String userId=request.getParameter("user_id");
        String password=request.getParameter("user_password");
        Service1 service1=new Service1();
        if(userId!=""&&password!=""){
            if("admin".equals(userId)&&"admin".equals(password)){
                request.getRequestDispatcher("Admin.jsp").forward(request,response);
            }
            else if(service1.compare(userId,password)){
                request.getRequestDispatcher("zhuce.jsp").forward(request,response);
            }
            else request.getRequestDispatcher("index.jsp").forward(request,response);
        }
        else{
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
    }*/
}
