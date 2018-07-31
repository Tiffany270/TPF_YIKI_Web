package com.tpf.Test;

import com.tpf.Entity.User;
import com.tpf.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Tests {

 UserService service;

 @Test
 public void test() throws IOException {
  ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
  service = (UserService) cxt.getBean("userService");

  System.out.println(service.getUserByNameAndPassword("yiki","1234"));

 }

 @Test
 public void test01() throws IOException {
  ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
  service = (UserService) cxt.getBean("userService");

 service.deleteUserById(22);

 }

 }

