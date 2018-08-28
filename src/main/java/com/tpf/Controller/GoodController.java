package com.tpf.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tpf.Entity.Good;
import com.tpf.Entity.Respond;
import com.tpf.Entity.User;
import com.tpf.Service.GoodService;
import com.tpf.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class GoodController {

 @Autowired
 GoodService service;


 @ResponseBody
 @RequestMapping("**/GoodsManage")
 public Respond GoodsManage(
  @RequestParam(value = "pn", defaultValue = "1") Integer pn) {
  PageHelper.startPage(pn, 8);//页数+每页的大小
  List<Good> listgood = service.getGoods();
  PageInfo page = new PageInfo(listgood, 5);
  if (pn > page.getPages()) {
   return Respond.fail();
  }
  return Respond.success().add("pageInfo", page);

 }


 @ResponseBody
 @RequestMapping("**/AllGoods")
 public Respond getAllGoods(
  @RequestParam(value = "pn", defaultValue = "1") Integer pn, HttpServletRequest request) {

  HttpSession session = request.getSession();
  String type = (String) session.getAttribute("type");
  System.out.println(type);
  PageHelper.startPage(pn, 8);//页数+每页的大小
  List<Good> listgood = service.getGoodsByType("%" + type + "%");
  PageInfo page = new PageInfo(listgood, 5);
  if (pn > page.getPages()) {
   return Respond.fail();
  }
  return Respond.success().add("pageInfo", page);

 }

 @RequestMapping("/JumpToGood")
 public String JumToGood(@RequestParam(value = "type") String type, HttpServletRequest request) {
  HttpSession session = request.getSession();
  System.out.println(type);
  if (type.equals("man")) {
   session.setAttribute("type", "男");
  }
  else if (type.equals("manT")) {
   session.setAttribute("type", "男T");
  }
  else if (type.equals("manJ")) {
   session.setAttribute("type", "男夹克");
  }
  else if (type.equals("manF")) {
   session.setAttribute("type", "男风衣");
  }
  else if (type.equals("women")) {
   session.setAttribute("type", "女裙");
  }

  else if (type.equals("womenS")) {
   session.setAttribute("type", "短裙");
  }
  else if (type.equals("womenF")) {
   session.setAttribute("type", "女风衣");
  }
  else if (type.equals("womenQ")) {
   session.setAttribute("type", "连衣裙");
  }
  else if (type.equals("winter")) {
   session.setAttribute("type", "风衣");
  }
  else if (type.equals("maoyi")) {
   session.setAttribute("type", "毛衣");
  }
  else if (type.equals("pants")) {
   session.setAttribute("type", "裤");
  }
  else if (type.equals("kuopants")) {
   session.setAttribute("type", "阔腿裤");
  }
  else if (type.equals("shoe")) {
   session.setAttribute("type", "鞋");
  }
  else if (type.equals("shoeY")) {
   session.setAttribute("type", "运动鞋");
  }
  else if (type.equals("shoeL")) {
   session.setAttribute("type", "凉鞋");
  }
  return "forward:/GoodType.jsp";

 }


 @RequestMapping("/JumpToDetail")
 public String JumpToDetail(@RequestParam(value = "id", defaultValue = "1") Integer id, HttpServletRequest request) {
  HttpSession session = request.getSession();
  session.setAttribute("detailId", id);
  return "forward:/Detail.jsp";
 }

 @ResponseBody
 @RequestMapping("/GoodDetail")
 public Respond GoodDetail(HttpServletRequest request) {
  HttpSession session = request.getSession();
  Integer id = (Integer) session.getAttribute("detailId");
  return Respond.success().add("good", service.getGoodsById(id));
 }


}
