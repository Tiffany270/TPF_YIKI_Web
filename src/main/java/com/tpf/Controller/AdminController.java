package com.tpf.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tpf.Entity.Respond;
import com.tpf.Entity.User;
import com.tpf.Service.OrderService;
import com.tpf.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class AdminController {

 @Autowired
 UserService service;
 @Autowired
 OrderService orderService;


 @ResponseBody
 @RequestMapping("**/AllUser")
 public Respond getAllUsers(
  @RequestParam(value = "pn", defaultValue = "1") Integer pn,
  Map<String, Object> map) {
  PageHelper.startPage(pn, 5);//页数+每页的大小
  List<User> listuser = service.getAll();
   PageInfo page = new PageInfo(listuser, 5);
   if(pn>page.getPages()){
    return Respond.fail();
   }
   return Respond.success().add("pageInfo", page);

 }

 @RequestMapping("/admin")
 public String admin(
  @RequestParam(value = "pn", defaultValue = "1") Integer pn,
  Map<String, Object> map) {
  PageHelper.startPage(pn, 5);//页数+每页的大小
  List<User> listuser = service.getAll();
  //pageinfo里有详细的信息-->连续传入5页
  PageInfo page = new PageInfo(listuser, 5);
  map.put("pageinfo", page);
//  page.getNavigatepageNums()能取到页面
  return "AllUser";
 }

 @RequestMapping("/JumToAdmin")
 public String JumToAdmin(){

  return "admin";
 }

 @RequestMapping("**/JumToGoodManager")
 public String JumToGoodManager(){
  return "GoodAdmin";
 }

 @RequestMapping("**/JumToOrderManager")
 public String JumToOrderManager(){
  return "AllOrder";
 }

 @ResponseBody
@RequestMapping(value="/SendGood")
 public Respond SendGood( @RequestParam(value = "oid") String oid){
  orderService.SendGood(oid);

  return Respond.success();
 }





}
