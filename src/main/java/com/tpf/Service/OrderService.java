package com.tpf.Service;

import com.tpf.Dao.GoodMapper;
import com.tpf.Dao.OrderDetailMapper;
import com.tpf.Dao.OrderMapper;
import com.tpf.Entity.Order;
import com.tpf.Entity.OrderDetail;
import com.tpf.Entity.OrderDetailExample;
import com.tpf.Entity.OrderExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderService {

 @Autowired
 private GoodMapper goodMappermapper;
 @Autowired
 private OrderMapper orderMapper;
 @Autowired
 private OrderDetailMapper orderDetailMapper;


 public void buildOrderDetail(OrderDetail detail) {
  orderDetailMapper.insert(detail);

 }

 public void buildOrder(Order order) {
  orderMapper.insert(order);
 }

 public List<Order> getOrderByName(String name){

  OrderExample example = new OrderExample();
  OrderExample.Criteria criteria = example.createCriteria();
  criteria.andOusernameEqualTo(name);
  return orderMapper.selectByExample(example);

 }

 public List<OrderDetail> getOrderDetialByUUID(String UUID){

  OrderDetailExample example = new OrderDetailExample();
  OrderDetailExample.Criteria criteria = example.createCriteria();
  criteria.andOidEqualTo(UUID);
  return orderDetailMapper.selectByExample(example);
 }


public List<Order> getAllOrder(){
  return orderMapper.selectByExample(null);
}


public void SendGood(String uuid){

  Order order = orderMapper.selectByPrimaryKey(uuid);
  OrderExample example = new OrderExample();
  OrderExample.Criteria criteria = example.createCriteria();
  order.setIssend("已发货");
  criteria.andOidEqualTo(uuid);
  orderMapper.updateByExampleSelective(order,example);

}


}
