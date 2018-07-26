package com.tpf.Controller;

import com.tpf.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class AdminController {

 @Autowired
 UserService service;

 @RequestMapping("/admin")
 public String admin(Map<String, Object> map) {
  map.put("alluser", service.getAll());

  return "AllUser";
 }

}
