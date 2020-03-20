package com.example.zhenghe;

import com.example.zhenghe.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
public class RedisTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;  // 操作k-v都是字符串
    @Autowired
    private RedisTemplate redisTemplate;  // 操作k-v都是对象的
    @Autowired
    private RedisTemplate<Object, Employee> empRedisTemplate;

    /**
     * Redsi常见的五大数据类型
     * String, List, Set, Hash, ZSet
     *
     * stringRedisTemplate.opsForValue()[String（字符串）]
     * stringRedisTemplate.opsForList()[List（列表）]
     * stringRedisTemplate.opsForSet()[Set（集合）]
     * stringRedisTemplate.opsForHash()[Hash（散列）]
     * stringRedisTemplate.opsForZSet()[ZSet（有序集合）]
     */
    @Test
    public void test() {
//        stringRedisTemplate.opsForValue().append("msg", "hello");
//        String msg = stringRedisTemplate.opsForValue().get("msg");
//        System.out.println(msg);

        stringRedisTemplate.opsForList().leftPush("mylist", "1");
        stringRedisTemplate.opsForList().leftPush("mylist", "2");
    }

    /**
     *测试保存对象
     */
    @Test
    public void saveObj() {
        // 默认保存对象，使用jdk序列化机制，序列化后的数据保存到redis中
//        redisTemplate.opsForValue().set("emp-1", new Employee("wang", 1));

        // 将数据以json数据保存
        // 1.自己将对象转换为json
        // 2.redisTemplate默认的序列化规则
//        redisTemplate.opsForValue().set("emp-4", new Employee("wang", 1));
        Employee employee = (Employee) redisTemplate.opsForValue().get("emp-4");
        System.out.println(employee);
    }

}
