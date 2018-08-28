package com.tpf.Test;

import com.tpf.Entity.Cart;
import com.tpf.Entity.Good;
import com.tpf.Entity.Order;
import com.tpf.Entity.OrderDetail;
import com.tpf.Service.GoodService;
import com.tpf.Service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestOrder {

 GoodService goodServiceservice;
 OrderService orderService;

 @Test
 public void test() throws IOException {
  ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
  goodServiceservice = (GoodService) cxt.getBean("goodService");
  orderService = (OrderService) cxt.getBean("orderService");


  Good good1 = goodServiceservice.getGoodsById(1);
  Good good2 = goodServiceservice.getGoodsById(2);

  Cart cart = new Cart();
  cart.addToCart(good1, 1);
  cart.addToCart(good2, 2);

  String name = "yiki";
  String address = "测试";
  String uuid = getUUID();
  System.out.println(getUUID());
  Order order = new Order(uuid, name, cart.getTotalPrice(), address,"未发货");

  orderService.buildOrder(order);
  HashMap<Good, Integer> goods = cart.getGoods();
  System.out.println(goods);//key->2
  Set<Good> items = goods.keySet();
  System.out.println(items.toString());//所有key
  Iterator<Good> it = items.iterator();


  while (it.hasNext()) {
   Good i = it.next();
   System.out.println(goods.get(i));
   OrderDetail detail = new OrderDetail(null, good1.getGid(), "uolo", goods.get(i), uuid);
   orderService.buildOrderDetail(detail);
  }

  orderService.getOrderByName("yiki");


 }

 @Test
 public void test2() throws IOException {
  ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
  orderService = (OrderService) cxt.getBean("orderService");
  goodServiceservice = (GoodService) cxt.getBean("goodService");


  Cart cart = new Cart();
  List<Order> orderList = orderService.getOrderByName("yiki");
  for (int i = 0; i < orderList.size(); i++) {
   System.out.println(orderList.get(i).getOid());
   List<OrderDetail> orderDetails = orderService.getOrderDetialByUUID(orderList.get(i).getOid());
   System.out.println(orderDetails.toString());
   for (int j = 0; j < orderDetails.size(); j++) {
    Integer gid = orderDetails.get(j).getGid();
    cart.addToCart(goodServiceservice.getGoodsById(gid), orderDetails.get(i).getDnumber());
   }
  }

  System.out.println(cart.toString());


 }


 public static String getUUID() {
  String orderNo = "";
  String trandNo = String.valueOf((Math.random() * 9 + 1) * 1000000);
  String sdf = new SimpleDateFormat("yyyyMMddHHMMSS").format(new Date());
  orderNo = trandNo.toString().substring(0, 4);
  orderNo = orderNo + sdf;
  return orderNo;
 }
}

