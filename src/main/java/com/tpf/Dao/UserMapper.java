package com.tpf.Dao;

import com.tpf.Entity.User;

import java.util.List;

public interface UserMapper {
 public User getUserById(Integer id);
 public List<User> getAll();


}