package com.barron.servlet;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入了doGet");
//        PrintWriter writer = resp.getWriter();
//        writer.print("hello,servlet");

        String url = this.getInitParameter("url");
        resp.getWriter().print(url);
        ServletContext servletContext = this.getServletContext();
        servletContext.setAttribute("name","张三zhangsan");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
