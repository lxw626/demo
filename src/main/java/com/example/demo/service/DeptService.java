package com.example.demo.service;

import com.example.demo.entity.Dept;
import com.example.demo.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @autor lixiewen
 * @date 2018/12/25-13:49
 */
@Service
@CacheConfig(cacheNames = "dept", cacheManager = "myRedisCacheManager",keyGenerator = "myKeyGenerator") //抽取缓存的公共配置
public class DeptService {
    @Autowired
    private DeptMapper deptMapper;
//    @Autowired
//    @Qualifier("myRedisCacheManager")
//    RedisCacheManager myRedisCacheManager;

    @CachePut
    public Integer insert(Dept dept) {
        System.out.println("走了DeptService.insert" + dept.toString());
        Integer result = deptMapper.insert(dept);
        return result;
    }

    @CacheEvict
    public Integer deleteByPrimaryKey(Integer deptno) {
        return deptMapper.deleteByPrimaryKey(deptno);
    }

    @CacheEvict
    public Integer deleteByEntity(Dept dept) {
        return deptMapper.deleteByEntity(dept);
    }

    @CachePut
    public Integer updateByPrimaryKey(Dept dept) {
        return deptMapper.updateByPrimaryKey(dept);
    }

    @Cacheable
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

    @Cacheable
    public Dept findByPrimaryKey(Integer deptno) {
        return deptMapper.findByPrimaryKey(deptno);
    }

    @Cacheable
    public List<Dept> findByEntity(Dept dept) {
        return deptMapper.findByEntity(dept);
    }
}
