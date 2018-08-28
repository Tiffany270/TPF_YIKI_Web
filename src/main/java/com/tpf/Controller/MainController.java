package com.tpf.Controller;

import com.tpf.Entity.Imgs;
import com.tpf.Service.ImgsService;
import com.tpf.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class MainController {

 @Autowired
 UserService service;

 @Autowired
 ImgsService imgsService;

 @RequestMapping("/back")
 public String back() {
  return "redirect:/index.jsp";
 }




 @ResponseBody
 @RequestMapping("/getImg")
 public List<Imgs> getImg() {
  return imgsService.getAll();
 }



}
