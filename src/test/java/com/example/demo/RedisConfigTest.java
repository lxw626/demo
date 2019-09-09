package com.example.demo;

import com.example.demo.entity.Dept;
import com.example.demo.service.RedisService;
import com.example.demo.util.RedisKeyUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.*;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisConfigTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Resource
    private ValueOperations<String,Object> valueOperations;

    @Autowired
    private HashOperations<String, String, Object> hashOperations;

    @Autowired
    private ListOperations<String, Object> listOperations;

    @Autowired
    private SetOperations<String, Object> setOperations;

    @Autowired
    private ZSetOperations<String, Object> zSetOperations;

    @Resource
    private RedisService redisService;

    @Test
    public void testObj() throws Exception{
        Dept dept = new Dept();
        dept.setDeptno(1);
        dept.setLoc("上海");
        dept.setDname("测试1部");
        ValueOperations<String,Object> operations = redisTemplate.opsForValue();
        String key = RedisKeyUtil.getKey("dept","deptno",dept.getDeptno().toString());
        System.out.println(key);
        redisService.expireKey(key,600, TimeUnit.SECONDS);
        operations.set(key,dept);
        Dept vo = (Dept) operations.get(key);
        System.out.println(vo);
    }

    @Test
    public void testValueOption( )throws  Exception{
        Dept dept = new Dept(2,"开发部","北京");
        String key = RedisKeyUtil.getKey("dept","deptno",dept.getDeptno().toString());
        redisService.expireKey(key,60, TimeUnit.SECONDS);
        valueOperations.set(key,dept);
        System.out.println(valueOperations.get(key));
    }

    @Test
    public void testSetOperation() throws Exception{
        Dept dept3 = new Dept(3,"销售1部","北京");
        Dept dept4 = new Dept(4,"销售2部","北京");
        setOperations.add("dept:set:test",dept3,dept4);
        Set<Object> result = setOperations.members("dept:set:test");
        System.out.println(result);
    }

    @Test
    public void HashOperations() throws Exception{
        Dept dept3 = new Dept(1,"开发1部","北京");
        hashOperations.put("dept:hash:test",dept3.hashCode()+"",dept3);
        System.out.println(hashOperations.get("dept:hash:test",dept3.hashCode()+""));
    }

    @Test
    public void  ListOperations() throws Exception{
        Dept dept1 = new Dept(1,"开发1部","北京");
        Dept dept2 = new Dept(2,"开发2部","北京");
        Dept dept3 = new Dept(3,"开发3部","北京");
        listOperations.leftPush("list:dept",dept1);
        listOperations.leftPush("list:dept",dept2);
        listOperations.leftPush("list:dept",dept3);
//        System.out.println(listOperations.leftPop("list:user"));
        // pop之后 值会消失
        System.out.println(listOperations.leftPop("list:dept"));
    }
}