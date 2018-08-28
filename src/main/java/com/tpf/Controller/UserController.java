package com.tpf.Controller;

import com.tpf.Entity.*;
import com.tpf.Service.GoodService;
import com.tpf.Service.OrderService;
import com.tpf.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

 @Autowired
 UserService service;
 @Autowired
 GoodService goodServiceservice;
 @Autowired
 OrderService orderService;



 @RequestMapping("/JumpToCart")
 public String JumpToCart(HttpServletRequest request){

  HttpSession session = request.getSession();
  if (session.getAttribute("isLogin") == null) {
   return "error";
  }

  return "Cart";


 }
 @RequestMapping("/JumpToOrder")
 public String JumpToOrder(HttpServletRequest request, Map<String, Object> map){

  HttpSession session = request.getSession();
  if (session.getAttribute("isLogin") == null) {
   return "error";
  }

  String name = (String) session.getAttribute("loginuser");


  List<Order> orderList = orderService.getOrderByName(name);
  map.put("orderList",orderList);






  return "order";


 }

 @RequestMapping("/quer")
 public String quer(HttpServletRequest request) {

  HttpSession session = request.getSession();
  User user = (User) session.getAttribute("loginuser");
  System.out.println(user);
  return "succ";
 }

 @RequestMapping(value = "/login", method = RequestMethod.POST)
 public String login(User user,
                     HttpServletRequest request
 ) {
  boolean isLogin = service.getUserByNameAndPassword(user.getUname(), user.getUpassword());
  if (isLogin) {
   HttpSession session = request.getSession();
   List<User> loginuser = service.getUserByName(user.getUname());
   session.setAttribute("ListUser", loginuser);
   session.setAttribute("isLogin", "yes");
   session.setAttribute("loginuser",user.getUname());
   return "redirect:/index.jsp";
  }
  return "error";
 }


 @RequestMapping("/loginOut")
 public String loginOut(HttpServletRequest request, RedirectAttributes attr) {
  HttpSession session = request.getSession();
 // session.setAttribute("ListUser", null);
 // session.setAttribute("isLogin", null);
  // session.setAttribute("loginuser",null);
 // session.setAttribute("cart",null);
  session.invalidate();
  return "redirect:/index.jsp";
 }

 @RequestMapping(value = "/signup", method = RequestMethod.POST)
 public String SignUp(User user, HttpServletRequest request) {
  HttpSession session = request.getSession();
  service.addUser(user);
  List<User> listuser = new ArrayList<User>();
  listuser.add(user);
  session.setAttribute("ListUser", listuser);
  session.setAttribute("isLogin", "yes");
  session.setAttribute("loginuser",user.getUname());
  return "redirect:/index.jsp";

 }
 @RequestMapping("/userinfo")
 public String userinfo() {
   return "userinfo";
 }

@ResponseBody
 @RequestMapping(value="/deleteUser{uid}",method = RequestMethod.DELETE)
 public Respond deleteUserById(@PathVariable("uid") Integer uid){
  service.deleteUserById(uid);
  return Respond.success();
 }


}
