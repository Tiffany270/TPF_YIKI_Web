package com.tpf.Service;
import com.tpf.Dao.UserMapper;
import com.tpf.Entity.User;
import com.tpf.Entity.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

 @Autowired
 private UserMapper mapper;

 public User getUserById(int id){

  return mapper.selectByPrimaryKey(id);

 }
 public  List<User> getUserByName(String name){
  UserExample userExample = new UserExample();
  //userExample.setDistinct(false); //去除重复,true是选择不重复记录,false反之
  UserExample.Criteria criteria = userExample.createCriteria(); //构造自定义查询条件
  criteria.andUnameEqualTo(name);

  //自定义查询条件可能返回多条记录,使用List接收
  return mapper.selectByExample(userExample);

 }



 public List<User> getAll(){

  return mapper.selectByExample(null);
 }


 public boolean getUserByNameAndPassword(String name,String psw){

  User user = mapper.getUserByNameAndPassword(name,psw);
  if(user!=null){
   return true;
  }

  return false;
 }

 public void addUser(User user){
  mapper.insertSelective(user);
 }

 public void deleteUserById(Integer id){
   mapper.deleteByPrimaryKey(id);
 }

}
