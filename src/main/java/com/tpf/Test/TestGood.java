package com.tpf.Test;

import com.tpf.Service.GoodService;
import com.tpf.Service.ImgsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class TestGood {

 GoodService service;

 @Test
 public void test() throws IOException {
  ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
  service = (GoodService) cxt.getBean("goodService");
  System.out.println(service.getGoodsByType("%男%"));

 }
}

