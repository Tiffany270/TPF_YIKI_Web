package com.tpf.Dao;

import com.tpf.Entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
 public User getUserByName(String uname);
 public User getUserById(int id);
 public List<User> getAll();
 public User getUserByNameAndPassword(@Param("uname") String uname, @Param("upassword") String upassword);


}
