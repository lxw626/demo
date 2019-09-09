package com.example.demo.dao;

import com.example.demo.entity.TypeDemo;
import com.example.demo.entity.TypeDemoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypeDemoMapper {
    long countByExample(TypeDemoExample example);

    int deleteByExample(TypeDemoExample example);

    int insert(TypeDemo record);

    int insertSelective(TypeDemo record);

    List<TypeDemo> selectByExampleWithBLOBs(TypeDemoExample example);

    List<TypeDemo> selectByExample(TypeDemoExample example);

    int updateByExampleSelective(@Param("record") TypeDemo record, @Param("example") TypeDemoExample example);

    int updateByExampleWithBLOBs(@Param("record") TypeDemo record, @Param("example") TypeDemoExample example);

    int updateByExample(@Param("record") TypeDemo record, @Param("example") TypeDemoExample example);
}