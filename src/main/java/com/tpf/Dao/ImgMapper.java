package com.tpf.Dao;

import com.tpf.Entity.Imgs;
import com.tpf.Entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImgMapper {
 public List<Imgs> getImgs();


}
