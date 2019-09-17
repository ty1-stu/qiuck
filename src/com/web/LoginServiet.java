package com.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 小小一
 * @date 2019.9.17
 * 登录的请求响应
 */
@WebServlet(urlPatterns = "/login.do")
public class LoginServiet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理请求乱码
        req.setCharacterEncoding("UTF-8");
        //通过req请求参数资格获取前台表单的用户名参数
       String username = req.getParameter("username");
//        String password = req.getParameter("password");
 //       System.out.println(username);
        //跳转之前把用户名存入req对象
//        req.setAttribute("username",username);
 //       req.setAttribute("password",password);
        //通过req跳转
//        req.getRequestDispatcher("/index.jsp").forward(req,resp);

        //通过req请求对象获取session会话对象
        HttpSession session=req.getSession();
        //将用户名存入session对象
        session.setAttribute("username",username);
        //通过resq跳转
       resp.sendRedirect("/index.jsp");
    }
}