package com.itheima.web;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController  {
  @RequestMapping("login")
    public String logon(HttpServletRequest request, User user){
      if ("tom".equals(user.getUsername()) && "123".equals(user.getPassword())){
          request.getSession().setAttribute("user",user);
          return "/index.jsp";
      }else {
          return "/login.jsp";
      }
  }
}
