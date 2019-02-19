package com.itheima.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义拦截器
 */
public class MyInterceptor implements HandlerInterceptor{
    //fileupload执行之前执行
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws ServletException, IOException {
        Object user = request.getSession().getAttribute("user");
        if (user == null){
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        //把fileupload方法给拦截了
            return false;
        }
        return true;
    }

}
