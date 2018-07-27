package com.tpf.Service;

import com.tpf.Dao.ImgMapper;
import com.tpf.Dao.UserMapper;
import com.tpf.Entity.Imgs;
import com.tpf.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ImgsService {

 @Autowired
 private ImgMapper mapper;




 public List<Imgs> getAll(){

  return mapper.getImgs();
 }

}
