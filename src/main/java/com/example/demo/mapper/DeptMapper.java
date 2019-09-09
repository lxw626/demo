package com.example.demo.mapper;

import com.example.demo.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @autor lixiewen
 * @date 2018/12/25-13:48
 */
@Mapper
@Repository
public interface DeptMapper {
    Integer insert(Dept dept);

    Integer deleteByEntity(Dept dept);

    Integer deleteByPrimaryKey(Integer deptno);

    Integer updateByPrimaryKey(Dept dept);

    List<Dept> findAll();

    Dept findByPrimaryKey(Integer deptno);

    List<Dept> findByEntity(Dept dept);

}
