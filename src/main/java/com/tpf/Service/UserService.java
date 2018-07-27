package com.tpf.Service;

import com.tpf.Dao.UserMapper;
import com.tpf.Entity.User;
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

  return mapper.getUserById(id);

 }
 public User getUserByName(String name){

  return mapper.getUserByName(name);

 }



 public List<User> getAll(){

  return mapper.getAll();
 }
 public boolean getUserByNameAndPassword(String name,String psw){

  User user = mapper.getUserByNameAndPassword(name,psw);
  if(user!=null){
   return true;
  }

  return false;
 }

}
