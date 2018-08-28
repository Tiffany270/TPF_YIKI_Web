package com.tpf.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tpf.Entity.*;
import com.tpf.Service.GoodService;
import com.tpf.Service.OrderService;
import com.tpf.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class OrderController {

 @Autowired
 OrderService service;
 @Autowired
 GoodService goodService;


 @RequestMapping("/submitOrder")
 public String submitOrder(HttpServletRequest request) {
  HttpSession session = request.getSession();
  Cart cart = (Cart) session.getAttribute("cart");
  if (cart != null) {
   String uuid = getUUID();
   List<User> loginuser = (List<User>) session.getAttribute("ListUser");
   User user = loginuser.get(0);

   Order order = new Order(uuid, user.getUname(), cart.getTotalPrice(), user.getUaddress(), "未发货");
   service.buildOrder(order);

   HashMap<Good, Integer> goods = cart.getGoods();
   Set<Good> items = goods.keySet();
   Iterator<Good> it = items.iterator();


   while (it.hasNext()) {
    Good i = it.next();
    goodService.updateNumber(i.getGid(),goods.get(i));
    System.out.println(goods.get(i));
    OrderDetail detail = new OrderDetail(null, i.getGid(), user.getUname(), goods.get(i), uuid);
    service.buildOrderDetail(detail);
   }

   session.setAttribute("cart", null);
   return "succ";
  }


  return "error";
 }


 public static String getUUID() {
  String orderNo = "";
  String trandNo = String.valueOf((Math.random() * 9 + 1) * 1000000);
  String sdf = new SimpleDateFormat("yyyyMMddHHMMSS").format(new Date());
  orderNo = trandNo.toString().substring(0, 4);
  orderNo = orderNo + sdf;
  return orderNo;
 }



 @ResponseBody
 @RequestMapping("**/AllOrder")
 public Respond getAllOrder(
  @RequestParam(value = "pn", defaultValue = "1") Integer pn,
  Map<String, Object> map) {
  PageHelper.startPage(pn, 5);//页数+每页的大小
  List<Order> listorder = service.getAllOrder();
  PageInfo page = new PageInfo(listorder, 5);
  if(pn>page.getPages()){
   return Respond.fail();
  }
  return Respond.success().add("pageInfo", page);

 }



}
