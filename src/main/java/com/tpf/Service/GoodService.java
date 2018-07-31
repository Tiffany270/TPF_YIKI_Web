package com.tpf.Service;

import com.tpf.Dao.GoodMapper;
import com.tpf.Dao.ImgMapper;
import com.tpf.Entity.Good;
import com.tpf.Entity.GoodExample;
import com.tpf.Entity.Imgs;
import com.tpf.Entity.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GoodService {

 @Autowired
 private GoodMapper mapper;




 public List<Good> getGoodsByType(String type){
  GoodExample goodExample = new GoodExample();
  //userExample.setDistinct(false); //去除重复,true是选择不重复记录,false反之
  GoodExample.Criteria criteria = goodExample.createCriteria(); //构造自定义查询条件
  criteria.andGtypeLike(type);

  //自定义查询条件可能返回多条记录,使用List接收
  return mapper.selectByExample(goodExample);

 }
 public List<Good> getGoods(){

  return mapper.selectByExample(null);
 }

 public Good getGoodsById(Integer id){

  return mapper.selectByPrimaryKey(id);
 }

 }
