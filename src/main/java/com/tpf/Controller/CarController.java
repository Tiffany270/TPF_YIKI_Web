package com.tpf.Controller;

import com.tpf.Entity.Cart;
import com.tpf.Entity.Good;
import com.tpf.Entity.Respond;
import com.tpf.Service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class CarController {

 @Autowired
 GoodService service;


 @RequestMapping(value = "/addToCart", method = RequestMethod.POST)
 public String addToCart(@RequestParam(value = "number") Integer number, HttpServletRequest request) {
  HttpSession session = request.getSession();
  Integer id = (Integer) session.getAttribute("detailId");
  System.out.println(number);

  Good good = service.getGoodsById(id);

  if (session.getAttribute("isLogin") == null) {
   return "error";
  }

  // 是否是第一次给购物车添加商品
  if (session.getAttribute("cart") == null) {// 创建对象放进session里
   Cart cart = new Cart();
   request.getSession().setAttribute("cart", cart);
  }

  Cart cart = (Cart) request.getSession().getAttribute("cart");// 获取现有购物车对象
  cart.addToCart(good, number);

  System.out.println(cart.toString());

  return "succ";
 }


 @RequestMapping("/removeToCart")
 public String removeToCart(@RequestParam(value = "gid") Integer gid,HttpServletRequest request){
  Cart cart = (Cart) request.getSession().getAttribute("cart");
  Good good = service.getGoodsById(gid);
  cart.removeToCart(good);
  return "redirect:/JumpToCart";

 }



 @ResponseBody
 @RequestMapping("/getCart")
 public Respond getCart(HttpServletRequest request) {
  HttpSession session = request.getSession();

  Cart cart = (Cart) session.getAttribute("cart");
  if(cart!=null){



   HashMap<Good,Integer> goods = cart.getGoods();
   Set<Good> items = goods.keySet();
   Iterator<Good> it = items.iterator();
   List<Good> goodlist = new ArrayList<Good>();
   List<Integer> numberlist = new ArrayList<Integer>();
   while(it.hasNext())
   {
    Good good = it.next();
    goodlist.add(good);
    numberlist.add(goods.get(good));

   }


   return Respond.success()
    .add("goodlist",goodlist).add("numberlist",numberlist);


  }

  return Respond.fail();
 }


}
