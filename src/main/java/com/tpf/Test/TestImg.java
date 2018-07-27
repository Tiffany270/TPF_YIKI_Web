package com.tpf.Test;

import com.tpf.Service.ImgsService;
import com.tpf.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class TestImg {

 ImgsService service;

 @Test
 public void test() throws IOException {
  ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
  service = (ImgsService) cxt.getBean("imgsService");

  System.out.println(service.getAll());

 }
}

