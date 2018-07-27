package com.tpf.Controller;
import com.sun.deploy.net.HttpRequest;
import com.tpf.Entity.User;
import com.tpf.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class UserController {

 @Autowired
 UserService service;

 @RequestMapping("/quer")
 public String quer(HttpServletRequest request) {

  HttpSession session= request.getSession();
  User user = (User)session.getAttribute("loginuser");
  System.out.println(user);
  return "succ";
 }

 @RequestMapping(value = "/login",method = RequestMethod.POST)
 public String login(User user, RedirectAttributes attr,HttpServletRequest request) {


 boolean isLogin = service.getUserByNameAndPassword(user.getUname(),user.getUpassword());
 if(isLogin){
//  map.put("user",user.getUname());
//  map.put("isLogin","yes");
  HttpSession session= request.getSession();
  User loginuser = service.getUserByName(user.getUname());
  session.setAttribute("loginuser",loginuser);
  attr.addAttribute("isLogin","yes");
  attr.addAttribute("loginuser",user.getUname());
  return "redirect:/index.jsp";
 }
  return "error";
 }
 @RequestMapping("/loginOut")
 public String loginOut(HttpServletRequest request,RedirectAttributes attr) {
  attr.addAttribute("isLogin",null);
  HttpSession session= request.getSession();
  session.setAttribute("loginuser",null);
  return "redirect:/index.jsp";
 }


}
