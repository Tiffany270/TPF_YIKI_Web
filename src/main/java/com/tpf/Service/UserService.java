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

 public User getPersonById(Integer id){

  return mapper.getUserById(id);

 }

 public List<User> getAll(){

  return mapper.getAll();
 }

}
