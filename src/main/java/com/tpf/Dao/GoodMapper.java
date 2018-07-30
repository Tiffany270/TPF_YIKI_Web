package com.tpf.Dao;

import com.tpf.Entity.Good;
import com.tpf.Entity.GoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodMapper {
    long countByExample(GoodExample example);

    int deleteByExample(GoodExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(Good record);

    int insertSelective(Good record);

    List<Good> selectByExample(GoodExample example);

    Good selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") Good record, @Param("example") GoodExample example);

    int updateByExample(@Param("record") Good record, @Param("example") GoodExample example);

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKey(Good record);
}