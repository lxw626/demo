package com.example.demo.mapper;

import com.example.demo.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @autor lixiewen
 * @date 2018/12/25-13:47
 */
@Mapper
@Repository
public interface EmpMapper {
    Integer insert(Emp emp);

    Integer delete(Emp emp);

    Integer update(Emp emp);

    List<Emp> select(Emp emp);
}
